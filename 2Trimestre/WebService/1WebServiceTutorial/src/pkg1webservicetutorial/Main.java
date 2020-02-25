package pkg1webservicetutorial;

import https.footballpool_dataaccess.ArrayOftNextGame;
import https.footballpool_dataaccess.ArrayOftPlayerName;
import https.footballpool_dataaccess.ArrayOftTeam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author patri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean selected = true;
        System.out.println("NOMBRE JUGADOR: " +allPlayerNames(selected).getTPlayerName().get(0).getSName());
        System.out.println("PAIS JUGADOR: " +allPlayerNames(selected).getTPlayerName().get(0).getSCountryName());
        System.out.println("BANDERA JUGADOR: " +allPlayerNames(selected).getTPlayerName().get(0).getSCountryFlag());
        
        System.out.println("\nNEXT GAME");
        System.out.println("EQUIPO 1 = " + nextGames().getTNextGame().get(0).getSTeam1());
        System.out.println("EQUIPO 2 = " + nextGames().getTNextGame().get(0).getSTeam2());
        System.out.println("FECHA = " + nextGames().getTNextGame().get(0).getSLocalDateTime());
        
    }

    private static ArrayOftPlayerName allPlayerNames(boolean bSelected) {
        https.footballpool_dataaccess.Info service = new https.footballpool_dataaccess.Info();
        https.footballpool_dataaccess.InfoSoapType port = service.getInfoSoap();
        return port.allPlayerNames(bSelected);
    }

    private static ArrayOftNextGame nextGames() {
        https.footballpool_dataaccess.Info service = new https.footballpool_dataaccess.Info();
        https.footballpool_dataaccess.InfoSoapType port = service.getInfoSoap();
        return port.nextGames();
    }

    
    
}
