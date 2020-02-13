public class Giraffe extends Animal {
    private String name = "";

    public Giraffe (String name) {
        super(name, "leaves");
        this.name = name;
    };

    public void eat(String fooD){
        if (fooD == "leaves") {
            System.out.println(name + " eats " + fooD);
            System.out.println("YUM!!! " + name + " wants more " + fooD);
            sleep();
        } else {
            System.out.println("YUCK!!!" + name + " will not eat " + fooD);
        }
    }
}
