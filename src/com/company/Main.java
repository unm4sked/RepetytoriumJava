package com.company;
import com.company.Models.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        //Account account = new Account("Name1",43.3);
        //System.out.println(String.format("Account: %s  balance: %f",account.getName(),account.getBalance()));

        zad4();

    }


    public static void zad4() {
        Random r = new Random();
        int n = r.nextInt(9)+1;
        Scanner reader = new Scanner(System.in);
        while(true) {
            System.out.println("Podaj liczbe 1-10");
            int v = reader.nextInt();

            if(n == v) {
                System.out.println("DOBRZE!");
                break;
            }
            else if( v > n) {
                System.out.println("za duzo");
            }
            else {
                System.out.println("za malo");
            }
        }
    }
    public static void zad3() {
        System.out.println("ax+b=c   -> podaj a, b, c");
        Scanner reader = new Scanner(System.in);
        double a = reader.nextDouble();
        double b  = reader.nextDouble();
        double c = reader.nextDouble();
        double x;
        if(a!=0) {
            x = (c/a)-b;
            System.out.println("X = "+x);
        }
        else {
            System.out.println("a != 0");
        }
    }

    public static void zad2() {
        System.out.println("Podaj 3 boki trojkata: ");
        Scanner reader = new Scanner(System.in);
        double n1 = reader.nextDouble();
        double n2  = reader.nextDouble();
        double n3 = reader.nextDouble();


        if(Math.pow(n1,2)+Math.pow(n2,2)==Math.pow(n3,2)) {
            System.out.println("jest prostokatny");

        }
        else {
            System.out.println("nie jest prostokatny");
        }
    }
    public static void zad1() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        String miesiac;
        switch(n) {
            case 1:
                miesiac = "styczen";
                break;
            case 2:
                miesiac = "luty";
                break;
            case 3:
                miesiac = "marzec";
                break;
            case 4:
                miesiac = "kwiecien";
                break;
            case 5:
                miesiac = "maj";
                break;
            case 6:
                miesiac = "czerwiec";
                break;
            case 7:
                miesiac = "lipiec";
                break;
            case 8:
                miesiac = "sierpien";
                break;
            case 9:
                miesiac = "wrzesien";
                break;
            case 10:
                miesiac = "pazdziernik";
                break;
            case 11:
                miesiac = "listopad";
                break;
            case 12:
                miesiac = "grudzien";
                break;
            default:
                miesiac = "wybierz 1 - 12";
        }
        System.out.println(miesiac);
    }
}
