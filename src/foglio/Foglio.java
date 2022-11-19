package foglio;

import java.util.*;
import java.text.*;

//import serve per importare )
public class Foglio {

    private double altezza;
    private double base;
    private String colore;

    public Foglio(double altezza, double base, String colore) {
        this.altezza = altezza;
        this.base = base;
        this.colore = colore;
    }

    public void setAltezza(double a) {
        altezza = a;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setColore(String c) {
        colore = c;
    }

    public String getColore() {
        return colore;
    }

    public double calcArea() {
        double area = 0;
        area = base * altezza;
        return area;
    }

    public double calcDiagonale() {
        double diagonale = 0;
        diagonale = Math.sqrt((base * base) + (altezza * altezza));
        return diagonale;
    }

    public void impostaAltezza(double area) {
        altezza = area / base;
    }

    public void impostaBase(double area) {
        base = area / altezza;
    }

    public void impostaColore(String c) {
        colore = c;
    }

    public String stampa() {
        String s;
        s = "altezza:" + altezza + "base:" + base + "  colore:" + colore;
        return s;
    }
}
