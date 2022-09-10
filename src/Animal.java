public class Animal {
    public boolean type;
    String tipe;

    Animal(String tipe){
        if (tipe == "Not Predator" || tipe == "Predator"){
            this.tipe = tipe;
        }
    }
}