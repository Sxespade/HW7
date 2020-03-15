package lesson6;

public abstract class Animal {

    private String name;
    protected String color;
    private int age;

    public Animal(String name, String color, int age) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public abstract void voice() ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Животное =  %s, Цвет = %s, Возраст = %s%n",
                name,
                getColor(),
                getAge());
    }


}
