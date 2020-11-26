/*Develop a Java program to create a class PLAYER with member variables name,
matches_played and average. This class has an abstract method cal_average(String,int,int).
Derive two classes BATSMAN and BOWLER from PLAYER. Class BATSMAN has a
member variable runs_scored. Class BOWLER has a member variable runs_given. Create m
BATSMAN objects and n BOWLER objects. Calculate and display the average runs scored
by each BATSMAN and average runs given by each BOWLER.*/

import java.util.Scanner;

abstract class PLAYER{
    String name;
    int matches_played;
    double average;
    abstract void cal_average(String name,int mp,int r);
}

class BATSMAN extends PLAYER{
    int runs_scored;
    void setRuns_Scored(int runs){
        runs_scored = runs;
    }

    void cal_average(String playerName,int matchesPlayed, int runsScored){
        name = playerName;
        matches_played = matchesPlayed;
        average = (double)runsScored/matchesPlayed;
    }

}
class BOWLER extends PLAYER{
    int runs_given;
    void setRuns_Given(int runs){
        runs_given = runs;
    }

    void cal_average(String playerName,int matchesPlayed, int runsGiven ){
        name = playerName;
        matches_played = matchesPlayed;
        average = (double)runsGiven/matchesPlayed;
    }

}

class Prog2 extends Exception{
    public static void main(String[] args) {
        int m,n,matches_played,runs;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of batsmen: ");
        m = sc.nextInt();
        System.out.println("Enter number of bowlers: ");
        n = sc.nextInt();
        if(m <= 0 || n<=0){
            System.out.println("Enter only +ve values of m and n");
            System.exit(1);
        }

        BATSMAN batsmen[] = new BATSMAN[m];
        BOWLER bowlers[] = new BOWLER[n];

        for(int i=0;i<batsmen.length;i++){
            System.out.println("Enter name of bastman " + (i+1) + ": ");
            name = sc.next();
            System.out.println("Enter matches played of bastman " + (i+1) + ": ");
            matches_played = sc.nextInt();
            System.out.println("Enter runs scored: ");
            runs = sc.nextInt();
            batsmen[i] = new BATSMAN();
            batsmen[i].cal_average(name, matches_played, runs);
        }
        for(int i=0;i<bowlers.length;i++){
            System.out.println("Enter name of bowler " + (i+1) + ": ");
            name = sc.next();
            System.out.println("Enter matches played of bowler " + (i+1) + ": ");
            matches_played = sc.nextInt();
            System.out.println("Enter runs given: ");
            runs = sc.nextInt();
            bowlers[i] = new BOWLER();
            bowlers[i].cal_average(name, matches_played, runs);
        }
        System.out.println("=======DETAILS OF BASTMEN=======");
        for(int i=0;i<batsmen.length;i++){
            System.out.format("%s has an average of %.2f\n",batsmen[i].name,batsmen[i].average);
        }
        System.out.println("=======DETAILS OF BOWLERS=======");
        for(int i=0;i<batsmen.length;i++){
            System.out.format("%s has an average of %.2f\n",bowlers[i].name,bowlers[i].average);
        }


    }
}
