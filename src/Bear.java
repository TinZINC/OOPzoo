public class Bear extends Animal {
    private String name = "";

    public Bear (String name) {
        super(name, "fish");
        this.name = name;
    };

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    };
}

