package com.mlabs.mock.hackerank;

public class Volunteer extends Employee{
    private int hours;

    private Volunteer(String name) {
        super(name);
    }

    private void setHours(int hours){
        this.hours = hours;
    }

    private int getHours(){
        return hours;
    }

    /** Overrides the superclass' print method and prints information about an instance of Volunteer. **/
    @Override
    void print(){
        System.out.println("Volunteer Name: " + this.getName()
                + "\nHours: " + this.getHours());
    }

    public static void main(String[] args) {
        Volunteer volunteer = new Volunteer("Buddh");
        volunteer.setHours(20);
        volunteer.print();
    }
}