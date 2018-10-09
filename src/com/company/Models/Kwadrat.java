package com.company.Models;

public class Kwadrat {

    public String getName() {
        return name;
    }

    private String name;
    private double bok1;
    public Kwadrat(double bok1) {
        this.bok1=bok1;
        this.name = "kwadrat";
    }

    public void Pole() {
        System.out.println("Pole: "+bok1*2);
    }

    public void Obwod() {
        System.out.println("Obwod: "+4*bok1);
    }
}
