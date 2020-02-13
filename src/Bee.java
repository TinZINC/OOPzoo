public class Bee extends Animal {
    private String name = "";

    public Bee (String name) {
        super(name, "pollen");
        this.name = name;
    };

    public void eat(String fooD){
        System.out.println(name + " eats " + fooD);
        if (fooD == "pollen") {
            System.out.println("YUM!!! " + name + " wants more " + fooD);
            System.out.println(name + " never sleeps");
        } else {
            System.out.println("YUCK!!!" + name + " will not eat " + fooD);
        }
    }
}

