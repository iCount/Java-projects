public class Chanel {
    public static void main(String[] args) {
        Person party[] = new Person[10];
        for (int i = 0; i < party.length; i += 2) {
            party[i] = new Man();
            party[i + 1] = new Woman();
        }
        for (int i = 0; i < party.length; i++) {
            party[i].print();
            party[i].sayHi();
            party[i].birthday();
            party[i].sayHi();
        }
    }
}

