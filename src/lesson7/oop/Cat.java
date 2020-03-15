package lesson7.oop;

public class Cat implements Observer {

    private final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAppetite() {
        return appetite;
    }

/*    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            satiety = true;
            doEat(plate);
            plate.removeCat(this);
            System.out.println("Кот наелся и ушел");
            appetite = 0;
        }

        else  {
//            Thread.sleep(1000);
            int m = appetite;
            appetite = appetite - plate.getFood();
          //  appetite -= foodEat;
          //  plate.decreaseFood(foodEat);
            plate.decreaseFood(plate.getFood());
            satiety = false;
            System.out.println("Кот остался недоволен! " + " Аппетит после последней трапезы: " + appetite + " . В тарелке 0. Сытость кота: " + satiety);
            appetite = m;

        }

    }*/


    private void doEat(Subject s) {
        s.decreaseFood(appetite);
    }


    @Override
    public void update(Subject s) {
        System.out.println(this.name + " got notified!");
        //print job list
        System.out.println(s);
        System.out.println("Кот аппетит: " + appetite);
        eat(s);
/*        if (appetite == 0) {s.removeCat(this);}*/

    }

    @Override
    public void eat(Subject s) {
        if (s.getFood() >= appetite) {
            satiety = true;
            doEat(s);
            System.out.println("Кот наелся и ушел");
            appetite = 0;
        } else {
//            Thread.sleep(1000);
            int m = appetite;
            appetite = appetite - s.getFood();
            //  appetite -= foodEat;
            //  plate.decreaseFood(foodEat);
            s.decreaseFood(s.getFood());
            satiety = false;
            System.out.println("Кот остался недоволен! " + " Аппетит после последней трапезы: " + appetite + " . В тарелке 0. Сытость кота: " + satiety);
            appetite = m;
        }


    }
}

