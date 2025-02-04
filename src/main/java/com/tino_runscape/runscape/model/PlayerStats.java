package com.tino_runscape.runscape.model;

public class PlayerStats {
    private String rank;
    private int level;
    private int experience;

    public PlayerStats(String rank, int level, int experience) {
        this.rank = rank;
        this.level = level;
        this.experience = experience;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
