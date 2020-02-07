public class Zoo {

    public static void main (String[] args) {
        Zoo z = new Zoo();
        z.sleep("Tigger");
    }
    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";

    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep(name);
        }
    }
}
