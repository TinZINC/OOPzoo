public class Unicorn extends Animal {
    private String name = "";

    public Unicorn (String name) {
        super(name, "marshmallows");
        this.name = name;
    };

    public void eat(String fooD){
        System.out.println(name + " eats " + fooD);
        if (fooD == "marshmallows") {
            System.out.println("YUM!!! " + name + " wants more " + fooD);
            System.out.println(name + " sleeps in a cloud");
        } else {
            sleep();
        }
    }

}