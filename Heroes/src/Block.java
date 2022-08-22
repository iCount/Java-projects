import java.util.Vector;

public class Block {
    public static void main(String[] args) {
        Character party[] = new Character[10];
        for (int i = 0; i < party.length -1; i += 2) {
            party[i] = new Man();
            party[i + 1] = new Woman();
        }
        for (int i = 0; i < party.length; i++) {
            party[i].print();
            if(party[i] instanceof Woman)
            ((Woman) party[i]).MakeUp();
        }
    }
}