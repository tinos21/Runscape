package com.tino_runscape.runscape.model;


import java.util.List;

public class UserData {
    private List<Skill> skills;
    private List<Activity> activities;

    // Constructors, Getters, and Setters
    public UserData(List<Skill> skills, List<Activity> activities) {
        this.skills = skills;
        this.activities = activities;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "skills=" + skills +
                ", activities=" + activities +
                '}';
    }
}
