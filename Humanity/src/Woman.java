public class Woman extends Person{
    float beauty;
    byte goodness;
    Woman(){
        super();
        beauty = 100;
        goodness = 50;
    }

    Woman(String x, int y, byte z, float k){
        super(x, y);
        goodness = z;
        beauty = k;

    }

    void print(){
        super.print();
        System.out.println(beauty + goodness);

    }

    void makeup(){
        beauty *= 2;
    }

    public void sayHi(){
        if(goodness < 100)
        System.out.println("Womaaan");
        else System.out.println();

    }

    @Override
    public void birthday() {
        super.birthday();
        beauty-=30;
        goodness = (byte)127;
    }
}


