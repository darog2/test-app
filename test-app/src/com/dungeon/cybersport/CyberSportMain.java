package com.dungeon.cybersport;

import com.dungeon.cybersport.model.Ladder;
import com.dungeon.cybersport.model.Player;
import com.dungeon.cybersport.model.PlayerResult;
import com.dungeon.cybersport.model.Team;
import com.dungeon.cybersport.sevice.LadderService;

public class CyberSportMain {
    public static void main(String[] args) {
        Team team1=new Team("navi","Ukraine","05.05.2007","Total War");
        Team team2=new Team("Zadrots","rossia","12.12.2019","Total War");
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
        player4.setResult(new PlayerResult(254,85,11));
        team1.addPlayer(player1);
        team1.addPlayer(player3);
        team2.addPlayer(player2);
        team2.addPlayer(player4);
        Ladder ladder=new Ladder("Super France",2020);
        ladder.getTeamsList().add(team2);
        ladder.getTeamsList().add(team1);
        LadderService ladderService=new LadderService();
        ladderService.convertObjectToXml(ladder,"ladder.xml");




    }

}
