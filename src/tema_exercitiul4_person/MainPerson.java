package tema_exercitiul4_person;

import tema_exercitiul4_person.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person Marius = new Person("Marius", 23, "masculin", "Strada 25 Mai, nr. 23A.");
        System.out.println("Ma numesc " + Marius.nume + " am " + Marius.vasrta + " de ani " + "am sexul: " + Marius.sex +
                " si stau pe " + Marius.adresa);
        Marius.eat();
        Marius.sleep();
        Marius.walk();
        System.out.println();

        Person Rebeca = new Person("Rebeca", 19, "feminin", "Strada Mircea Voda, nr. 14.");
        System.out.println("Ma numesc " + Rebeca.nume + " am " + Rebeca.vasrta + " de ani " + "am sexul: " + Rebeca.sex +
                " si stau pe " + Rebeca.adresa);

        Rebeca.eat();
        Rebeca.sleep();
        Rebeca.walk();



    }
}
