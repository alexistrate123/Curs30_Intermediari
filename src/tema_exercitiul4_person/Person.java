package tema_exercitiul4_person;

public class Person {

    String nume;
    int vasrta;
    String sex;
    String adresa;

    public Person(String nume, int vasrta, String sex, String adresa) {
        this.nume = nume;
        this.vasrta = vasrta;
        this.sex = sex;
        this.adresa = adresa;
    }

    public void walk() {
        System.out.println(nume + " se plimba.");
    }

    public void eat() {
        System.out.println(nume + " se pune sa manance.");
    }

    public void sleep() {
        System.out.println(nume + " se culca la ora 23:00.");
    }
}
