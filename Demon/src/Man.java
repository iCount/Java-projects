public class Man extends Person {
    double money;
    Man(){
        super();
        money = 1000;
    }

    Man(String x, int y, double z){
        super(x, y);
        money = z;
    }
    @Override
    void print(){
        super.print();
        println(money);
    }

    private void println(double money) {
    }

    void spendMoney(){
        money = 0;
    }

}
