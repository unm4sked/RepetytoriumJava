package com.company.Models;

public class Kolo {

    private String name;
    private double r;

    public void Obwod() {
        System.out.println("Obwod: "+2*Math.PI*r);
    }

    public void Pole() {
        System.out.println("Pole: "+Math.PI*r*r);
    }

    public String getName() {
        return name;
    }

    public Kolo(double r){
        this.r = r;
        this.name = "kolo";
    }


}
