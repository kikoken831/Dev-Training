import java.util.*;

class Dog {
    private String name;
    private String color;
    private int cost;

    public Dog(String name, String color, int cost) {
        this();
        this.name = name;
        this.color = color;
        this.cost = cost;
    }
    public Dog() {
        this.name = "test";
        this.color = "test";
        this.cost = 1;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    void disp() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
    }
}

public class DogDriver {
    public static void main(String[] args) {
        Dog d = new Dog("doggy", "red", 100);
        d.disp();
        Dog d1 = new Dog();
        d1.disp();
    }
}

