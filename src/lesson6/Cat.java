package lesson6;

public class Cat extends AnimalWithLegs {

    private int weight;

    public Cat(String name, String color, int age, int weight) {
        super(name, color, age);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Мяв");
    }

    @Override
    public void printInfo() {
        System.out.printf("Животное =  %s, Цвет = %s, Возраст = %s, Вес = %s%n",
                getName(),
                getColor(),
                getAge(),
                weight);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
