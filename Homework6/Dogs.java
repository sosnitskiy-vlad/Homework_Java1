package GeekBrainsJava1.Homework6;

public class Dogs extends Animals {


//    как сделать так, чтобы значения брались из класса животного и не приходилось заносить его в конструктор при создании объекта в main???
//    int averageRunDist = 500;
//    float averageJumpHeight = 0.5f;
//    int averageSwimDist = 10;



    public Dogs(String name, int averageRunDist, float averageJumpHeight, int averageSwimDist) {
        super(name, averageRunDist, averageJumpHeight);
//        add diapason +-1.5m
        this.averageSwimDist =  (float) (averageSwimDist + (Math.random()*3)-1.5);
    }


    protected void info() {
        System.out.println("Name is: " + name + " [RunDistance= " + averageRunDist +
                "; JumpHeight= " + String.format("%.2f", averageJumpHeight) + "; SwimDist= " + String.format("%.2f", averageSwimDist) + "]");
    }

}
