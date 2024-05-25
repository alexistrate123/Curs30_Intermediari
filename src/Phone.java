import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Phone {
     // Ordinea in schita noastra este urmatoarea: 1. Campuri(Stare) 2. Constructori, 3. metode(Comportament), 4. toString;
    // marca, culoare, pret, RAM, AmperajBaterie, GigaBytesMemory, SistemOperare

    String name;
    String model;
    String culoare;
    int pret;
    int ram;
    int amperajBaterie;
    int gb;
    String sistemOperare;

    public Phone(String name, int pret) {
        this.name = name;
        this.pret = pret;
    }

    public Phone(String name, String model, String sistemOperare) {
        this.name = name;
        this.model = model;
        this.sistemOperare = sistemOperare;
    }

    public Phone(String name, String model, int pret) {
        this.name = name;
        this.model = model;
        this.pret = pret;
    }

    public Phone(String name, String model, String culoare, int ram, int amperajBaterie, int gb, String sistemOperare, int pret) {
        System.out.println("Am generat un telefon.");
        this.name = name;
        this.model = model;
        this.culoare = culoare;
        this.ram = ram;
        this.amperajBaterie = amperajBaterie;
        this.gb = gb;
        this.sistemOperare = sistemOperare;
        this. pret = pret;
    }

    // Orice camp sau metoda statica  apartine clasei si nu obiectului. Se apeleaza obligatoriu prin numele clasei si nu
    // prin numele obiectului.
    public static void incarcaTelefon() {
        System.out.println("Telefonul se incarca.");
    }

    public void suna(int numar) {
        System.out.println("Telefonul suna la numarul: " + numar);
    }

    public void suna(String nume, int numar) {
        System.out.println("Telefonul " + nume + "suna la numarul: " + numar);
    }


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                ", pret=" + pret +
                ", ram=" + ram +
                ", amperajBaterie=" + amperajBaterie +
                ", gb=" + gb +
                ", sistemOperare='" + sistemOperare + '\'' +
                '}';
    }










}
