abstract class Animal {
    abstract void eat();

    abstract void sleep();
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats");
    }

    void sleep() {
        System.out.println("Tiger sleeps");
    }

}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats");
    }

    void sleep() {
        System.out.println("Deer sleeps");
    }

}

class Monkey extends Deer {
    void eat() {
        System.out.println("Monkey eats");
    }

    void sleep() {
        System.out.println("Monkey sleeps");
    }
}

class Poly {
    void call(Animal ref) {
        ref.eat();
        ref.sleep();

    }
}

public class ADriver {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Tiger();
        arr[1] = new Deer();
        arr[2] = new Monkey();
        Poly p = new Poly(); 
        for (Animal r : arr) {
            p.call(r);
        }

    }
}