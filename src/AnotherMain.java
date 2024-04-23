public class AnotherMain {
    public static void main(String[] args) {

        Person salvatore = new Person();
        salvatore.firstName = "Salvatore";
        salvatore.surname = "Corsaro";
        salvatore.age = 35;
        salvatore.favoriteColor = "Green";

        Person beau = new Person();
        salvatore.firstName = "Beau";
        salvatore.surname = "Uabe";
        salvatore.age = 42;
        salvatore.favoriteColor = "Blue";

        System.out.println( salvatore.firstName + " favorite color is " + salvatore.favoriteColor);
        System.out.println( beau.firstName + " favorite color is " + beau.favoriteColor);


        beau.walk();
        salvatore.codeJava();



  //      var mba = new Laptop();
  //      mba.model = "Mac Book Air";
  //      mba.brand = "Apple";


        var xps = new Laptop("XPS 13", "DELL");

        String xpsModel = xps.getModel();
        System.out.println(xpsModel);
        System.out.println(xps.getModel());

        xps.setModel("Xps9590");

        var logger = new Logger();

        logger.log("Java is FUN!");

    }
}
