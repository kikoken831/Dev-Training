public class Demo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        System.out.println(d1.id);
        System.out.println(d2.id);
        System.out.println(d3.id);
        
        System.out.println(Dog.count);
    }
}

class Dog {
    static int count = 0;
    int id;
    Dog() {
        id = count;
        count++;
    }


}