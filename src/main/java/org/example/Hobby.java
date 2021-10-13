package org.example;

public class Hobby {
    private String name;
    private int hoursPerWeek;

    public Hobby() {
        this.name = "noname";
        this.hoursPerWeek = 0;
    }

    public Hobby(String name, int hoursPerWeek) {
        this.name = name;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
