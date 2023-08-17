package com.gervasio.algorithms.algoTests.level01;

import java.util.*;

// There's an algorithms tournament taking place in which teams of programmers
// compete against each other to solve algorithmic problems as fast as possible.
// Teams compete in a round robin, where each team faces off against all other
// teams. Only two teams compete against each other at a time, and for each
// competition, one team is designated the home team, while the other team is the
// away team. In each competition there's always one winner and one loser; there
// are no ties. A team receives 3 points if it wins and 0 points if it loses. The
// winner of the tournament is the team that receives the most amount of points.
// Given an array of pairs representing the teams that have competed against each
// other and an array containing the results of each competition, write a
// function that returns the winner of the tournament. The input arrays are named
// competitions and results, respectively. The
// competitions array has elements in the form of
// [homeTeam, awayTeam], where each team is a string of at most 30
// characters representing the name of the team. The results array
// contains information about the winner of each corresponding competition in the
// competitions array. Specifically, results[i] denotes
// the winner of competitions[i], where a 1 in the
// results array means that the home team in the corresponding
// competition won and a 0 means that the away team won.
// It's guaranteed that exactly one team will win the tournament and that each
// team will compete against all other teams exactly once. It's also guaranteed
// that the tournament will always have at least two teams.
public class TournamentWinner {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        // ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        // ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        // ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        // competitions.add(competition1);
        // competitions.add(competition2);
        // competitions.add(competition3);
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "Java"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("Java", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 1, 1));
        
        String winner = tournamentWinner(competitions, results);
        System.out.println(winner);
        
    }
    
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Integer n = results.size();
        Map<String, Integer> teams = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer winnerInd = 1 - results.get(i);
            ArrayList<String> competition = competitions.get(i);
            String team1 = competition.get(0);
            String team2 = competition.get(1);
            if (winnerInd == 0) {
                if (!teams.containsKey(team1)) {
                    teams.put(team1, 1);
                } else {
                    Integer qtd = teams.get(team1) + 1;
                    teams.put(team1, qtd);
                }
            } else {
                if (!teams.containsKey(team2)) {
                    teams.put(team2, 1);
                } else {
                    Integer qtd = teams.get(team2) + 1;
                    teams.put(team2, qtd);
                }
            }
        }
        String winner = "";
        Integer maxQtd = 0;
        for (Map.Entry<String,Integer> team : teams.entrySet()) {
            String teamName = team.getKey();
            Integer qtd = team.getValue();
            if (qtd > maxQtd) {
                winner = teamName;
                maxQtd = qtd;
            } else if (qtd == maxQtd) {
                winner = winner + ", " + teamName;
            }
        }
        return winner;
    }
    
}
