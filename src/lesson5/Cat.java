package lesson5;


public class Cat {
    protected String name;
    protected String color;
    protected int age;
    public static int legsNumber = 4;

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        legsNumber = 4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <=20)
        this.age = age;
    }

    public Cat(String name, String color, int age) {

        System.out.println("Создем кота " + name );
        this.name = name != null ? name.toUpperCase(): null ;
        this.color = color;
        this.age = age;

    }

    public Cat(String name, String color) {
        this(name, color, 0);

    }

    public Cat(String name) {
        this(name, null);
    }

    public Cat() {
        this(null);
    }

    public void meow () {
        System.out.println(name + " говорит Мяу!");
    }

    public Cat cloneCat(String name) {
        return new Cat(name, this.color, this.age);
    }

        @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }



}
