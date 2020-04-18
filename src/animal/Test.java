package animal;

public class Test {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal chicken = new Chicken();
        Edible orange = new Orange();
        Edible apple = new Apple();



        System.out.println(tiger.makeSound());
        System.out.println(chicken.makeSound());
        System.out.println(orange.howtoEat());
        System.out.println(apple.howtoEat());

        System.out.println("------------------------------");

        Edible watermelon = new Fruit() {
            @Override
            public String howtoEat() {
                return "Dưa hấu làm sinh tố";
            }
        };

        Edible banana = new Fruit() {
            @Override
            public String howtoEat() {
                return "Chuối ăn ngon";
            }
        };

        System.out.println(watermelon.howtoEat());
        System.out.println(banana.howtoEat());
    }
}
