public class Man extends Person {
    double money;

    Man() {
        super();
        money = 1000;
    }

    Man(String x, int y, double z) {
        super(x, y);
        money = z;
    }

    @Override
    void print() {
        super.print();
        println(money);
    }

    private void println(double money) {
    }

    void spendMoney() {
        money = 0;
    }

    public void sayHi() {
        if (money > 200)
            System.out.println("o-o-oni chaaaaaaaaaaan");
        else System.out.println("Woman hahaha");

    }

    @Override
    public void birthday() {
    super.birthday();
    money = 0;
    }
}

