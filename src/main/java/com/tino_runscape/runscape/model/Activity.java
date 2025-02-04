package com.tino_runscape.runscape.model;


public class Activity {
    private int id;
    private String name;
    private int rank;
    private int score;

    // Constructors, Getters, and Setters
    public Activity(int id, String name, int rank, int score) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", score=" + score +
                '}';
    }
}
