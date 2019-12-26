#include <pthread.h>
#include <iostream>
#include <string>
#include <semaphore.h>
#include <vector>
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

using namespace std;

int tamanio_buffer, num_hebras_prod, num_hebras_cons;
bool terminan_prod, terminan_cons;
int entrada, salida, contador, id_p, id_c;
vector <int> buffer;
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
pthread_cond_t lleno = PTHREAD_COND_INITIALIZER;
pthread_cond_t vacio = PTHREAD_COND_INITIALIZER;

void *func_prod (void *arg);
void *func_cons(void *arg);

//<tamanio_buffer> <num_hebras_prod> <terminan_prod> <num_hebras_cons> <terminan_cons>
int main(int argc, char *argv[]){

	tamanio_buffer = atoi(argv[1]);
	buffer.resize(tamanio_buffer);
	num_hebras_prod = atoi(argv[2]);
	terminan_prod = atoi(argv[3]);
	num_hebras_cons = atoi(argv[4]);
	terminan_cons = atoi(argv[5]);

	entrada = 0;
	salida = 0;

	id_p = 0;
	id_c = 0;

	pthread_t id_hebra_prod[num_hebras_prod] ; //vector de punteros a hebras productoras
	pthread_t id_hebra_cons[num_hebras_cons] ; //vector de punteros a hebras consumidoras

	


	//Crear las hebras productoras
	int p_bucle=0;
	do{
		
		pthread_create( &(id_hebra_prod[p_bucle]), NULL, func_prod, NULL);
		p_bucle++;
		
	}while (p_bucle<num_hebras_prod);

	//Crear las hebras consumidoras
	int c_bucle=0;
	do{
		
		pthread_create( &(id_hebra_cons[c_bucle]), NULL, func_cons, NULL );
		c_bucle++;

	}while (c_bucle<num_hebras_cons);

    //Los join de las hebras productoras
	for(p_bucle = 0 ; p_bucle < num_hebras_prod ; p_bucle++ ) { 
		pthread_join( id_hebra_prod[p_bucle], NULL );
	}
	
	//Los join de las hebras consumidoras
	for(c_bucle = 0 ; c_bucle < num_hebras_cons ; c_bucle++ ) { 
		pthread_join( id_hebra_cons[c_bucle], NULL );
	}

	

	exit (0);
}

void *func_prod (void *arg){
	int item;

    if(terminan_prod == 0){
		while(1){		
			pthread_mutex_lock (&mutex);
			while(contador == tamanio_buffer){
				pthread_cond_wait(&lleno,&mutex);
			}
			if(id_p==num_hebras_prod){
				id_p=0;
			}
			item=1;
			buffer[entrada] = item;
			cout << morado << "HebraProductora " << id_p << " produce en posición " << entrada << rest << endl;
			cout << gris << "Buffer {" << rest;
			for(int i = 0; i<tamanio_buffer;i++){
				if(i != entrada){
					if(i!=tamanio_buffer-1)
						cout << gris<< buffer[i] <<" "<< rest;
					else 
						cout << gris<< buffer[i] << rest;
				}else{
					if(i!=tamanio_buffer-1)
						cout << verde<< buffer[i] <<" "<< rest;
					else 
						cout << verde<< buffer[i] << rest;
				}	
			} 
			cout << gris << "}" << rest<< endl;
			entrada = (entrada+1) % tamanio_buffer;
			id_p++;
			contador++;
			pthread_cond_broadcast(&vacio);
			pthread_mutex_unlock(&mutex);
		}
	} else {
		pthread_mutex_lock (&mutex);
		while(contador == tamanio_buffer){
			pthread_cond_wait(&lleno,&mutex);
		}
		item=1;
		buffer[entrada] = item;
		cout << morado << "HebraProductora " << id_p << " produce en posición " << entrada << rest << endl;
		cout << gris << "Buffer {" << rest;
		for(int i = 0; i<tamanio_buffer;i++){
			if(i != entrada){
				if(i!=tamanio_buffer-1)
					cout << gris<< buffer[i] <<" "<< rest;
				else 
					cout << gris<< buffer[i] << rest;
			}else{
				if(i!=tamanio_buffer-1)
					cout << verde<< buffer[i] <<" "<< rest;
				else 
					cout << verde<< buffer[i] << rest;
			}
		} 
		cout << gris << "}" << rest<< endl;
		entrada = (entrada+1) % tamanio_buffer;
		id_p++;
		contador++;
		pthread_cond_broadcast(&vacio);
		pthread_mutex_unlock(&mutex);
	}
}

void *func_cons(void *arg){
	int item;

    if(terminan_cons ==0){
		while(1){
			pthread_mutex_lock(&mutex);
			while(contador == 0){
				pthread_cond_wait(&vacio,&mutex);
			}
			if(id_c==num_hebras_cons){
				id_c=0;
			}
			item=0;
			buffer[salida]=item;
			cout << amarillo<< "HebraConsumidora " << id_c << " consume en posicion " << salida << rest<< endl;
			cout << gris << "Buffer {" << rest;
			for(int i = 0; i<tamanio_buffer;i++){
				if(i != salida){
					if(i!=tamanio_buffer-1)
						cout << gris<< buffer[i] <<" "<< rest;
					else 
						cout << gris<< buffer[i] << rest;
				}else{
					if(i!=tamanio_buffer-1)
						cout << rojo<< buffer[i] <<" "<< rest;
					else 
						cout << rojo<< buffer[i] << rest;
				}
			} 
			cout << gris << "}" << rest<< endl;
			salida = (salida+1) % tamanio_buffer;
			id_c++;
			contador--;
			pthread_cond_broadcast(&lleno);
			pthread_mutex_unlock(&mutex);
		}
	}else{
		pthread_mutex_lock(&mutex);
		while(contador == 0){
			pthread_cond_wait(&vacio,&mutex);
		}
		item=0;
		buffer[salida]=item;
		cout << amarillo<< "HebraConsumidora " << id_c << " consume en posicion " << salida << rest<< endl;
		cout << gris << "Buffer {" << rest;
		for(int i = 0; i<tamanio_buffer;i++){
			if(i != salida){
				if(i!=tamanio_buffer-1)
					cout << gris<< buffer[i] <<" "<< rest;
				else 
					cout << gris<< buffer[i] << rest;
			}else{
				if(i!=tamanio_buffer-1)
					cout << rojo<< buffer[i] <<" "<< rest;
				else 
					cout << rojo<< buffer[i] << rest;
			}
		} 
		cout << gris << "}" << rest<< endl;
		salida = (salida+1) % tamanio_buffer;
		id_c++;
		contador--;
		pthread_cond_broadcast(&lleno);
		pthread_mutex_unlock(&mutex);
	}
}