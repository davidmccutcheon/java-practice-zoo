public class Runner {
    public static void main (String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        Zookeeper zoebot = new Zookeeper("Zoebot");

        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};

        zoebot.feedAnimals(animals, "beans");

//        tigger.eat("meat");
//        pooh.eat("fish");
//        pooh.eat("meat");
//        rarity.eat("marshmallows");
//        rarity.sleep();
//        gemma.eat("meat");
//        gemma.eat("leaves");
//        stinger.eat("ice cream");
//        stinger.eat("pollen");
    }
}
