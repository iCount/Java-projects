import java.util.Vector;

public class Block1 {
    public static void main(String[] args) {
        Monster party[] = new Monster[10];
        for (int i = 0; i < party.length; i ++) {
            party[i] = new Monster();
        }
        for (int i = 0; i < party.length; i++) {
            party[i].print();
        }
    }
}
