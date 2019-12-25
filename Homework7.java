package geekbrainsJavaOne;

class Cat {

    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;

    }

    public void isFullOrHungry() {
        System.out.println(name + ((fullness) ? " is full" : " is hungry"));
    }

    public void eat(Plate plate) {
            if (plate.food >= appetite) {
                fullness = plate.decreaseFood(appetite);
        }
                else fullness = false;
    }

    static class Plate {
        private int food;

        public Plate(int food) {
            this.food = food;
        }

        boolean decreaseFood(int minus) {
            if (food - minus < 0) return false;
            else { food -= minus; }
            return true;
        }

        public void info() {
            System.out.println("Food left on the plate: " + food);
        }
    }

    public static class Main {
        public static void main(String[] args) {

            Cat[] cats = {
                    new Cat("Pixel", 55),
                    new Cat("Nixel", 60),
                    new Cat("Geeksel", 85),
                    new Cat("Mixel", 80),
                    new Cat("Drixel", 40),
            };

            Plate plate = new Plate(175);
            System.out.println("");
            for (Cat cat : cats){
                cat.eat(plate);
                cat.isFullOrHungry();
            }
          plate.info();

        }
    }
}


