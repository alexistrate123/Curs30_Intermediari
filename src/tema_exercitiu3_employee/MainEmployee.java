package tema_exercitiu3_employee;

public class MainEmployee {

    public static void main(String[] args) {

        Employee Robert = new Employee("Robert", 1994, 40000, "64C-WallStreet");
        System.out.println("Ma numesc " + Robert.nume + " m-am inscris in anul: " + Robert.anul_inscrierii + " am salariul de: "
                + Robert.salariu + " de lei" + " si stau pe strada: " + Robert.adresa);
        System.out.println();

        Employee Sam = new Employee("Sam ", 2000, 29000, "68D-WallStreet");
        System.out.println("Ma numesc " + Sam.nume + " m-am inscris in anul: " + Sam.anul_inscrierii + " am salariul de: "
                + Sam.salariu + " de lei" + " si stau pe strada: " + Sam.adresa);
        System.out.println();

        Employee John = new Employee("John", 1999, 15000, "26B-WallStreet");
        System.out.println("Ma numesc " + John.nume + " m-am inscris in anul: " + John.anul_inscrierii + " am salariul de: "
                + John.salariu + " de lei" + " si stau pe strada: " + John.adresa);

        // de refacut ! cu \\ TAB !!

    }

}
