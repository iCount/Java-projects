public class Character {
    public boolean instanceofWoman;
    public boolean instanceofMonster;
    String name;
    int hp;
    int iq;
    String sex;
    int speed;
    int strong;
    String weapon;

    Character(){
        name = "Ivan";
        hp = 100;
        iq = 120;
        sex = "Male";
        speed = 300;
        strong = 600;
        weapon = "Laser-Sword";
    }

    public Character(String x, int y, int g, String h, int t, int o, String n) {
    }

    public Character(String x, int y) {
    }

    void print(){
        System.out.println(" Name " + name + 100 + hp + 120 + iq + "sex" + sex + 300 + speed + 600 + strong + "weapon" + weapon);
    }

    public Object MakeUp() {
        return null;
    }
}
