package GeekBrainsJava1.Homework6;

public class Main {

    public static void main(String[] args) {

        Cats cat1 =  new Cats("Juchka", 200, 2.0f);
        Cats cat2 =  new Cats("Kuzya", 200, 2.0f);
        Cats cat3 =  new Cats("Kleopa", 200, 2.0f);

        Dogs dog1 = new Dogs("Yoggy", 500, 0.5f, 10);
        Dogs dog2 = new Dogs("Jordan", 500, 0.5f, 10);
        Dogs dog3 = new Dogs("Sharik", 500, 0.5f, 10);

        cat1.info();
        cat2.info();
        cat3.info();
        dog1.info();
        dog2.info();
        dog3.info();
        cat1.swim(100);
        cat2.run(170);
        cat3.jump(1.98f);
        dog1.jump(0.66f);
        dog2.swim(10.2f);
        dog3.run(505);
    }
}
