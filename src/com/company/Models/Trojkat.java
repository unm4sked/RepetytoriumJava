package com.company.Models;

public class Trojkat {



    private String name;
    private double a;
    private double b;
    private double c;

    public Trojkat(double a, double b, double c){
        this.name = "Trojkat";
        this.a= a;
        this.b = b;
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void Pole(){
        System.out.println("Pole:"+0.5*a*b);
    }

    public void Obwod() {
        System.out.println("Obwod: "+a+b+c);
    }
}
