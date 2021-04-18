package com.dungeon.cybersport;

import com.dungeon.cybersport.model.Player;
import com.dungeon.cybersport.model.Team;

public class CyberSportMain {
    public static void main(String[] args) {
        Team team1=new Team("navi","Ukraine","05.05.2007","Dota2");
        Team team2=new Team("Zadrots","rossia","12.12.2019","Dota2");
        Player player1=new Player("Vasya",
                "Pumpkin",
                "NaGiBaToR228",
                "Kazakhstan",
                "02.04.2001");
        Player player2=new Player("Dasha",
                "Petrovna",
                "HELLO_kitty666",
                "Ukraine",
                "02.11.1999");
        Player player3=new Player("Abdul",
                "Akhmedov",
                "xXx_Master_xXx",
                "Dagestan",
                "01.02.1978");
        Player player4=new Player("Karl",
                "Waltz",
                "Viking_CAPt",
                "Sweden",
                "02.03.1984");
        team1.getPlayersList().add(player1);
        team1.getPlayersList().add(player3);
        team2.getPlayersList().add(player2);
        team2.getPlayersList().add(player4);

    }

}
