package animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cục tác cục tác" ;
    }

    @Override
    public String howtoEat() {
        return "Ăn thịt gà";
    }
}
