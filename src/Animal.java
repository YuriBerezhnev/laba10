abstract class Animal {
    // Абстрактные методы для действий
    public abstract void run(int distance);
    public abstract void swim(int distance);
    public abstract void jump(double height);
}
    interface AnimalActions {
    void run(int distance);
    void swim(int distance);
    void jump(double height);
}