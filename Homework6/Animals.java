package GeekBrainsJava1.Homework6;

public class Animals {

    int averageRunDist;
    float averageJumpHeight;
    float averageSwimDist;
    String name;


    public Animals(String name, int averageRunDist, float averageJumpHeight) {
        this.name = name;
//       add diapason +-100m
        this.averageRunDist = (int) (averageRunDist + (Math.random() * 201) - 100);
//        add diapason +-0.15m
        this.averageJumpHeight = (float) (averageJumpHeight + (Math.random()*0.5)-0.25);
    }

        protected void run (int distance){
            System.out.println(name + ((averageRunDist >= distance) ? " succeeded in running!" : " failed in running!"));
        }

        protected void jump (float height){
            System.out.println(name + ((averageJumpHeight >= height) ? " succeeded in jumping!" : " failed in jumping!"));
        }

        protected void swim (float waterDist){
            System.out.println(name + ((averageSwimDist >= waterDist) ? " succeeded in swimming!" : " failed in swimming!"));
        }
    }
