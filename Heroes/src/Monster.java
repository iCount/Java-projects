public class Monster extends Character {
    float badness;
    double aggressive;


    Monster() {
        super();
        badness = 999;
        aggressive = 888;
    }

    public Monster(String x, int y, int g, String h, int t, int o, String n) {
    }

    public Monster(String x, int y) {
    }

    void print() {
            super.print();
            System.out.println(badness + aggressive);
            System.out.println("I'm monster, i'm very badness and aggressive");
        }
    }

