public class multilevelinheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.wagTail();
    }
}
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void wagTail() {
        System.out.println("Puppy wags tail");
    }
}