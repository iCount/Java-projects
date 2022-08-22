public class Main1 {
    public static void main(String[] args) {
        Person ono = new Person();
        Man Ilya = new Man();
        Person Jay = new Man();
        ono.print();
        Ilya.print();
        Jay.print();
        Ilya.spendMoney();
        ((Man)Jay).spendMoney();
    }
}
