public class Man extends Character{
    int iq;
    Man(){
        super();
        iq = 350;
    }

    @Override
    void print(){
        super.print();
        println(iq);
    }

    private void println(int iq) {

        System.out.println("I'm Man, I have high iq ");
    }
}



