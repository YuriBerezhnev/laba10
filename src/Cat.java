class Cat extends Animal implements AnimalActions {
    private final int maxRunDistance = 200;
    private final double maxJumpHeight = 2;

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот пробежал " + distance + " метров");
        } else {
            System.out.println("Кот не может пробежать " + distance + " метров");
        }
    }
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кот перепрыгнул препятствие высотой " + height + " метра");
        } else {
            System.out.println("Кот не может перепрыгнуть препятствие высотой " + height + " метра");
        }
    }
}
