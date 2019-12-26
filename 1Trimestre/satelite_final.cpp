#include <unistd.h>
#include <stdio.h>
#include <string.h>
#include <sys/wait.h>
#include <cctype>
#include <iostream>
#include <string>
#include <stdlib.h>
#include <iomanip>

#define rest "\033[1;0m"
#define gris "\033[1;30m"
#define rojo "\033[1;31m"
#define verde "\033[1;32m"
#define amarillo "\033[1;33m"
#define azul "\033[1;34m"
#define morado "\033[1;35m"
#define cyan "\033[1;36m"
#define blanco "\033[1;37m"
#define negro "\033[1;38m"

//ABUELO-PADRE-NIETO
using namespace std;

#define digit(a) ((a >= '0' && a <= '9') ? a - '0' : 0)

void manejador_paquete_erroneo(int segnal)
{
// cout << rojo << "PAQUETE NO VALIDO " /*<< paquete_erroneo */<< rest << endl;
	//cout << buffer << endl;
}

int main() {
	int util = 0;
	char paquete[util];    
    char buffer[200]; 
    bool fin = false;   

    int pid_abuelo;
    pid_abuelo = getpid(); //Para la señal

	pid_t pid/*padre*/, padre_pid/*Espera el abuelo a finalizacion p.padre*/, pid2/*nieto*/, nieto_pid/*Espera padre a finalizacion p.nieto*/;

	int fd1[2]; //lee hijo/escribe padre
	int fd2[2]; //lee padre/escribe hijo

	pipe(fd1);   //pipe para comunicación de padre a hijo
	pipe(fd2);   //pipe para comunicación de hijo a padre

	pid = fork(); //El ABUELO crea al PADRE

	if (pid == -1 ){ //Ha ocurrido un error
		printf("No se ha podido crear el proceso hijo...");
		exit(-1); 
	}

	if(pid == 0){
		
		pid2 = fork();//El PADRE crea al NIETO

		switch(pid2){

			case -1:   // error
				cout << "No se ha podido crear el proceso NIETO en el HIJO..." << endl;
				exit(-1); 
			break;  

			case 0:    // PROCESO NIETO 
		    {

		    	//NIETO RECIBE DEL PADRE
			    close (fd2[1]);//cierra el descriptor de escritura
			    read (fd2[0], buffer, sizeof(buffer)); //leo el pipe  
			    close (fd2[0]);     
			    //cout<<rojo << "DEBUG: NIETO RECIBE mensaje de su PADRE: "<< buffer << rest <<endl; 

			    bool salir = false; //Para saber cuando acaba el bucle
			    int num = 1; //Para saber cuantos numeros me manda el buffer
			    for(int i = 0; i<sizeof(buffer) && !salir; i++){
			    	if(buffer[i] != '0' && buffer[i] != '1' && buffer[i] != '2' && buffer[i] != '3' && buffer[i] != '4' && buffer[i] != '5' && buffer[i] != '6' && buffer[i] != '7' && buffer[i] != '8' && buffer[i] != '9'){
			    		salir=true;
			    	}
			    	num++;
			    }

			    int sum = 0; //Hago la suma
			    for(int i = 0; i<num-2; i++){
			    	sum+=buffer[i] - '0';		    	
			    }

			    string res = to_string(sum); //Paso la suma a string
			    char res_buf [res.length()]; //Paso el string a vector de char para poder pasarlo en el buffer
			    for(int i = 0; i<res.length();i++){
			    	res_buf[i] = res[i];
			    }

			    for(int i = 0; i<strlen(buffer);i++){ //Limpio el buffer
			    	buffer[i]=' ';
			    }


			    cout << verde << "PAQUETE CORRECTO. SUMA = " << sum << rest << endl;
			    //cout << rojo << "DEBUG: NIETO ENVIA MENSAJE a su PADRE..." << res_buf << rest << endl;

			    //NIETO ENVIA AL PADRE
			    close(fd1[0]);
			    write(fd1[1], res_buf, strlen(res_buf)); //escribo en el pipe
			    close(fd1[1]);		    

			}

			default:  //PROCESO PADRE
			{
				close(fd1[1]);
				read(fd1[0], buffer, strlen(buffer)); //leo del pipe
				close(fd1[0]);
				//cout << rojo << "DEBUG: PAQUETE RECIBIDO DEL ABUELO AL PADRE: " << buffer << rest << endl;
      	
				int num = 0; //Para saber cuantos numeros me envia el buffer
				int delimitador=0; // Para saber donde esta el -

				for(int i = 0; i<util; i++){ //Limpio el paquete de datos
		    		paquete[i] =' ';
		    	}

				bool salir = false; //Para saber cuando no hay numeros mas numeros en el bucle
			    for(int i = 0; i<sizeof(buffer) && !salir;i++){
			    	if(buffer[i] != '-'){
			    		delimitador++;
			    	}
			    	if(buffer[i] != '0' && buffer[i] != '1' && buffer[i] != '2' && buffer[i] != '3' && buffer[i] != '4' && buffer[i] != '5' && buffer[i] != '6' && buffer[i] != '7' && buffer[i] != '8' && buffer[i] != '9'){
			    		salir=true;
			    	}
			    	num++;
			    	paquete[i] = buffer[i];
			    	util++;
			    }

			    util--;
			    //cout << gris << "NUM = " << num << rest << endl;
			    //cout << gris << "DEL = " << delimitador << rest << endl;

			    if(num != delimitador){ //Si la cantidad de numeros y el delimitador son != es porque el paquete es correcto

		     		//cout << rojo << "DEBUG: PADRE ENVIA A HIJO: " << paquete << rest << endl;
		         	close(fd2[0]);
			        write(fd2[1], paquete, util);//escribo en el pipe
			        close(fd2[1]);

			        nieto_pid=wait(NULL); //espero a que el hijo haga la suma 

			        //RECIBE DEL NIETO (LA SUMA)
			        close(fd1[1]);//cierra el descriptor de entrada
			        read(fd1[0], buffer, strlen(buffer)); //leo el pipe 
			        close(fd1[0]);           
			        //cout << rojo << "PADRE RECIBE mensaje de su hijo (SUMA): " << buffer << rest << endl;

			        //PADRE ENVIA a ABUELO (PARA IMPRIMIR)
					//cout << rojo << "PADRE ENVIA SUMA AL ABUELO: "<< buffer << rest << endl;   
					close(fd2[0]);
					write(fd2[1], buffer, strlen(buffer));//escribo en pipe  
					close(fd2[1]);     
		     	}else{
		     		kill(pid_abuelo, SIGUSR1); //Mando una señal para que el abuelo sepa que el paquete esta mal
		     	}
	        }
		}
	} else {
		bool salir;
		char dato;
		bool inf = false;

			cout<< morado << "BIENVENIDO. ENVIE PAQUETES. DEBEN SER DE NUMEROS POSITIVOS. CUANDO FINALICE EL PAQUETE, PONGA -1"<< rest<< endl;
	    do{ //Bucle infinito
	    	
		    for(int i = 0; i<util; i++){ //Limpio el paquete
	    		paquete[i] =' ';
	    	}
	    	util = 0;
	    	for(int i = 0; i<strlen(buffer);i++){ //Limpio buffer
	    		buffer[i]=' ';
	    	}

	    	salir = false;
		    for(int i = 0; i<2000 && !salir; i++){
		    	cin >> dato; //Recojo los datos
		    	paquete[util] = dato; //Introduzco el dato en el paquete
		    	util++;
		    	if(dato  == '-'){ //Si dato es == a un - es porque se acaba el paquete
				    //cout << rojo << "DEBUG: ABUELO ENVIA PAQUETE" << rest << endl;
					close(fd1[0]);
					write(fd1[1], paquete, util);//escribo en pipe 
					close(fd1[1]);
					//cout << rojo << "DEBUG: PAQUETE ENVIADO" << rest << endl;
					padre_pid = wait(NULL); //Espero a que el proceso hijo acabe
					
					if(signal( SIGUSR1, manejador_paquete_erroneo )){ //Si me manda una señal es porque el paquete es erroneo
						cout << rojo << "PAQUETE ERRONEO: " << paquete << rest << endl;
						salir = true;
					}else{
						//ABUELO RECIBE						
						close(fd2[1]);//cierra el descriptor de entrada
						read(fd2[0], buffer, sizeof(buffer)); //leo el pipe  
						close(fd2[0]); 
						salir = true;         
						//cout << verde << "PAQUETE CORRECTO. SUMA = " << buffer <<rest<< endl;
					}
		    		cin.ignore();
		    	}
		    }
		}while(!inf);
	}
}