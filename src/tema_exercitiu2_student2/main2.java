package tema_exercitiu2_student2;

public class main2 {
    public static void main(String[] args) {

        Student2 John = new Student2(4, "Strada Mircea Voda, nr 129A ", 2134512234);
        System.out.println("Ma numesc John, numarul meu matricol este: " + John.roll_no + ", stau pe " + John.adresa +
                "si numarul meu de telefon este: " + John.numarDeTelefon);
        System.out.println();


        Student2 Sam = new Student2(10,"Strada 1 Ianuarie, bloc 1B, sc. A, ap 1 ", 258234509);
        System.out.println("Salut. ma numesc Sam, numarul meu matricol este: "+ Sam.roll_no+", stau pe "+ Sam.adresa+
                "si numarul meu de telefon este: "+ Sam.numarDeTelefon);

    }
}
