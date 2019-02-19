package com.github.alex15190.programmer_day;

public class ProgrammerDay {
    private int year;

    public ProgrammerDay(){}

    public ProgrammerDay(int year){
        this.year = year;
    }

    public int calculate(){
        return isLeap() ? 12 : 13;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private Boolean isLeap(){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    public void printDay(int day){
        System.out.println("Programmer Day is " + day + " September.");
    }

    public String showDay(){
        return calculate() + " сентября " + year;
    }
}
