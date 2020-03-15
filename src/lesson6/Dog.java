package lesson6;

public class Dog extends Animal implements IAnimal {

    private int heightJump;
    public String color;

    public Dog(String name, String color, int age, int heightJump) {
        super(name, color, age);
        this.heightJump = heightJump;

    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    //    @Override
    public void printInfo(boolean a) {
        super.printInfo();
        System.out.printf("Высота прыжка собаки = %s и ее цвет после изменения %s%n ", heightJump,
                        this.color);

    }

    public void changeColor(String color) {
//        super.color = color;
        this.color = color;
    }


    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
}
