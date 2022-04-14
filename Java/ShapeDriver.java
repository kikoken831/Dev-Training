import java.util.Scanner;

abstract class Shape {
    float area;

    abstract void acceptInput();

    abstract void compute();

    void display() {
        System.out.println(area);
    }
}

class Triangle extends Shape {
    float base;
    float height;

    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Base of Triangle");
        this.base = s.nextFloat();

        System.out.println("Height of Triangle");
        this.height = s.nextFloat();

    }

    void compute() {
        super.area = 0.5f * this.base * this.height;
    }

}

class Rectangle extends Shape {
    float length;
    float breadth;

    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Length of rectangle");
        this.length = s.nextFloat();

        System.out.println("Height of Rectangle");
        this.breadth = s.nextFloat();
    }

    void compute() {
        super.area = this.length * this.breadth;
    }

}

class Circle extends Shape {
    float radius;

    void acceptInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Radius of Circle");
        this.radius = s.nextFloat();
    }

    void compute() {
        super.area = 3.14f * radius * radius;
    }

}

public class ShapeDriver {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Triangle();
        arr[1] = new Rectangle();
        arr[2] = new Circle();
        for (Shape ref : arr) {
            ref.acceptInput();
            ref.compute();
            ref.display();
        }
    }
}
