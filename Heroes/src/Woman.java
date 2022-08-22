public class Woman extends Character{
    float beauty;
    byte care;
    Woman(){
        super();
        beauty = 200;
        care = 100;
    }

    Woman(String x, int y, int g, String h, int d, int j, String l, byte s, float u){
         super(x, y);
         care = s;
         beauty = u;
    }

    void print(){
        super.print();
        System.out.println(care + beauty);
        System.out.println("I'm Woman, I'm very care and beautiful, I dont have a weapon");
    }

    void makeup(){beauty *=4;}
}
