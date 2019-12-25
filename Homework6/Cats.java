package GeekBrainsJava1.Homework6;

public class Cats extends Animals{

    public Cats(String name, int averageRunDist, float averageJumpHeight) {
        super(name, averageRunDist, averageJumpHeight);
    }


    @Override
    protected void swim(float waterDist) {
        System.out.println("Cats can't swim!");
    }
    protected void info() {
        System.out.println("Name is: " + name +"[RunDistance = " + averageRunDist + "; JumpHeight = " + String.format("%.2f", averageJumpHeight) + "]");
    }
}
