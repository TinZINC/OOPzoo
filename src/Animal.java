public class Animal {

    //properties
    private String favoriteFood = "";
    private String name = "";
    public static int population;

    //constructor
    public Animal(String itsName, String itsFavoriteFood) {
        this.favoriteFood = itsFavoriteFood;
        this.name = itsName;
        population++;
    }

    //methods
    public void sleep() {
        System.out.println(name + " sleeps for 8 hours ");
    }

    public void eat(String fooD){
        System.out.println(name + " eats " + fooD);
        if (fooD == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + fooD);
        } else {
            sleep();
        }
    }
}
