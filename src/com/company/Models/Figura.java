package com.company.Models;

import java.util.Scanner;

public class Figura {


    private Trojkat trojkat;
    private Kwadrat kwadrat;
    private Kolo kolo;


    public void doSomething(String figura, String akcja){

        Scanner reader = new Scanner(System.in);

        if(figura == "kwadrat") {
            System.out.println("Podaj bok kwadratu: ");
            double x = reader.nextDouble();
            this.kwadrat = new Kwadrat(x);

            if(akcja == "pole") {
                kwadrat.Pole();
            }
            else if(akcja == "obwod") {
                kwadrat.Obwod();
            }
        }
        else if (figura =="kolo") {
            System.out.println("Podaj promien kola: ");
            double x = reader.nextDouble();
            this.kolo = new Kolo(x);

            if(akcja == "pole") {
                kolo.Pole();
            }
            else if(akcja == "obwod") {
                kolo.Obwod();
            }
        }
        else if( figura == "trojkat") {
            System.out.println("Podaj boki trojkata: ");
            double x = reader.nextDouble();
            double y = reader.nextDouble();
            double z = reader.nextDouble();
            this.trojkat = new Trojkat(x,y,z);

            if(akcja == "pole") {
                trojkat.Pole();
            }
            else if(akcja == "obwod") {
                trojkat.Obwod();
            }
        }
    }

    public Trojkat getTrojkat() {
        return trojkat;
    }

    public void setTrojkat(Trojkat trojkat) {
        this.trojkat = trojkat;
    }

    public Kwadrat getKwadrat() {
        return kwadrat;
    }

    public void setKwadrat(Kwadrat kwadrat) {
        this.kwadrat = kwadrat;
    }

    public Kolo getKolo() {
        return kolo;
    }

    public void setKolo(Kolo kolo) {
        this.kolo = kolo;
    }
}
