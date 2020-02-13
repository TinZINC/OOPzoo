public class zoo {

    public static void main(String[] args) {
        Tiger Tigger = new Tiger("Tigger");

        Bear Pooh = new Bear("Pooh");

        Unicorn Rarity = new Unicorn("Rarity");

        Giraffe Gemma = new Giraffe("Gemma");

        Bee Stinger = new Bee("Stinger");

        Zookeeper Zoebot = new Zookeeper("Zoebot");
        Animal[] Animal = {
                Tigger, Pooh, Rarity, Gemma, Stinger
        };
        Zoebot.feedAnimals(Animal, "hamburgers");
    }


}
