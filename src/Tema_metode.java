import java.util.Scanner;

public class Tema_metode {

    public static void main(String[] args) {

    welcome();
        System.out.println();

    welcome1("Darius");
        System.out.println();

        System.out.println(welcome2("Marian"));

    }

// 1. Scrie o metoda welcome(), care cere de la user un nume si apoi afiseaza un salut;

    public static void welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te rog introdu numele tau: ");
        String numeCerutLaConsola = sc.nextLine();
        System.out.println("Salut numele meu este: "+ numeCerutLaConsola);

    }

    // 2. Scrie o metoda welcome1(),  care ia ca parametru un String nume, si apoi afiseaza un salut;

    public static void welcome1(String nume) {
        System.out.println("Salut numele meu este: "+ nume);
    }

    // 3. Scrie o metoda welcome2(), care ia ca parametru un String nume, si apoi returneaza un salut;

    public static String welcome2(String nume) {
        return  "Buna ziua, "+ nume + "! Bine ai venit ! ";
    }





}
