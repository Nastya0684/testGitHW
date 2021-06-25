import static java.lang.Math.min;

public abstract class Animal {
    protected String name;
    protected int run;
    protected int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
   }

    public void run(int distance) {
        System.out.println(name + " ran " + min(distance, run) + "m");
    }

    public void swim(int distance) {
        System.out.println(name + " swam " + min(distance, swim) + "m");
    }

    public void speak() {
        System.out.println(name + " says Hello");
    }
}
