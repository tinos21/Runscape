package com.tino_runscape.runscape.model;


public class Skill {
    private int id;
    private String name;
    private int rank;
    private int level;
    private int xp;

    // Constructors, Getters, and Setters
    public Skill(int id, String name, int rank, int level, int xp) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.level = level;
        this.xp = xp;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", level=" + level +
                ", xp=" + xp +
                '}';
    }
}
