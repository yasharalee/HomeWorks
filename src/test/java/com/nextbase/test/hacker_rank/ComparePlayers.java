package com.nextbase.test.hacker_rank;

import java.util.*;
class Checker implements Comparator<Player>{

    public int compare(Player p1, Player p2){

        return p1.score != p2.score ? p2.score -p1.score : p1.name.compareToIgnoreCase(p2.name) > 0 ? 1 : -1;

    }

}
// Write your Checker class here

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {


        Player[] player = {new Player("amy", 100),
                new Player("davis", 100),
                new Player("heraldo ", 50),
                new Player("aakansha ", 75),
                new Player("aleksa ", 150)};

        Checker checker = new Checker();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
