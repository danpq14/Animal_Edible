package animal;

public abstract class Fruit implements Edible {
    @Override
    public abstract String howtoEat();
}


class Watermelon extends Fruit{
    @Override
    public String howtoEat() {
        return "Dưa hấu ăn rất ngon";
    }
}

class Banana extends Fruit {
    @Override
    public String howtoEat() {
        return "Chuối ăn rất ngon";
    }
}


