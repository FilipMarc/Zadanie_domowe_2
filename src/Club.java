public class Club {
    public static void main(String[] args) {
//        Drink drink1 = new Drink();
//        drink1.drinkName = "gin&Tonic";
//        drink1.price = 15;
//        drink1.alkohol = true;
//        drink1.gin = 50;
//        drink1.tonic = 150;
//        drink1.ice = 50;
//
//        System.out.println("Drink: " + drink1.drinkName + ", cena: "+
//                drink1.price+ " z alkoholem: " + drink1.alkohol +" Skład: " + drink1.gin +" g ginu, "
//                + drink1.tonic +" g toniku, "+ drink1.ice +" g lodu");
//
//        System.out.println("Pojemność drinka: " + (drink1.gin + drink1.tonic + drink1.ice) +" ml");

        //Lub
       Drink drink2 = new Drink();
        drink2.drinkName = "gin&Tonic";
        drink2.price = 15;
        drink2.alkohol = true;
        drink2.gin = 50;
        drink2.tonic = 150;
        drink2.ice = 50;

        System.out.println("Drink: " + drink2.drinkName + ", cena: "+
                drink2.price+ " z alkoholem: " + drink2.alkohol +" Skład: " + drink2.gin +" g ginu, "
                + drink2.tonic +" g toniku, "+ drink2.ice +" g lodu");

        System.out.println("Pojemność drinka: " + (drink2.gin + drink2.tonic + drink2.ice) +"ml");

    }
}
