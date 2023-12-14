public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.run(150);
        cat.jump(1.5);
        cat.swim(5);

        dog.run(400);
        dog.jump(0.3);
        dog.swim(8);
    }
}