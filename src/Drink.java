public class Drink {
    String drinkName;
    double price;
    boolean alkohol;

    int whiskey;
    int tonic;
    int cola;
    int gin;
    int ice;
    //Lub
    int capacity;

    public static void main(String[] args) {
        Drink ingredient1 = new Drink();
        ingredient1.drinkName = "vodka";
        ingredient1.capacity = 50;

        Drink ingredient2 = new Drink();
        ingredient2.drinkName = "tonic";
        ingredient2.capacity = 150;

        Drink ingredient3 = new Drink();
        ingredient3.drinkName = "gin";
        ingredient3.capacity = 50;

        Drink ingredient4 = new Drink();
        ingredient4.drinkName = "ice";
        ingredient4.capacity = 50;

        Drink ingredient5 = new Drink();
        ingredient5.drinkName = "whiskey";
        ingredient5.capacity = 50;

        Drink ingredient6 = new Drink();
        ingredient6.drinkName = "cola";
        ingredient6.capacity = 150;
    }

}
