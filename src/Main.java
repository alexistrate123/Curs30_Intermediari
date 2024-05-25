public class Main {
    public static void main(String[] args) {

        Phone samsung = new Phone("Samsung", "S23", "Black",8,12,128,"Android",1000);
        System.out.println();
        Phone samsung1 =new Phone("Samsung","S22",1000);
        System.out.println(samsung1);
       /* samsung.name = "Samsung";
        samsung.model = "S23";
        samsung.culoare = "Black";
        samsung.pret = 1000;
        samsung.ram = 8;
        samsung.gb = 128;
        samsung.amperajBaterie = 12;
        samsung.sistemOperare = "Android";
        System.out.println("Caracteristici telefon :\n"
                + "Nume: " + samsung.name + "\n"
                + "Model: " + samsung.model + "\n"
                + "Culoare:" + samsung.culoare + "\n"
                + "Ram: " + samsung.ram + "\n"
                + "Memorie: " + samsung.gb + "\n"
                + "Amperaj baterie: " + samsung.amperajBaterie + "A" + "\n"
                + "Sistem de Operare: " + samsung.sistemOperare);
        */
        System.out.println("________________________________________________________________________________");
        System.out.println();
        System.out.println(samsung);
        samsung.suna(21243509);
        Phone.incarcaTelefon();
        System.out.println();


        Phone iphone = new Phone("Iphone","15ProMax","Purple",8,12,250,"IOS",2000);
        iphone.suna("Iphone ", 213245679);
        System.out.println();
        System.out.println(iphone);


        System.out.println();
        Phone iphone1 = new Phone("Iphone", 10000);
        System.out.println(iphone1);



        Phone huwawei = new Phone("Huwawei", "P30","MidNight Blue", 8,12,500, "Android", 3000);
        System.out.println(huwawei);
        System.out.println();

        Phone huwawei1 = new Phone("Huwawei","P40","Android");
        System.out.println(huwawei1);





    }


}
