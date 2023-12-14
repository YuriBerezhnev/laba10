class Dog extends Animal implements AnimalActions {
    private final int maxRunDistance = 500;
    private final double maxJumpHeight = 0.5;
    private final int maxSwimDistance = 10;
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собака пробежала " + distance + " метров");
        } else {
            System.out.println("Собака не может пробежать " + distance + " метров");
        }
    }
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака проплыла " + distance + " метров");
        } else {
            System.out.println("Собака не может проплыть " + distance + " метров");
        }
    }
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Собака перепрыгнула препятствие высотой " + height + " метра");
        } else {
            System.out.println("Собака не может перепрыгнуть препятствие высотой " + height + " метра");
        }
    }
}