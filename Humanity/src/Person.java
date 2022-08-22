public abstract class Person implements Holiday{
    public static Man p;
    String name;
    int age;

    Person(){
        name = "Name";
        age = 20;
    }

    Person(String n, int a) {
        name = n;
        age = a;

    }

    void print(){
        System.out.println(" name " + name + " age " + age);
    }


    public void sayHi() {
    }

    public void birthday(){
        age++;
    }
}



