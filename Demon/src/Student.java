public class Student {

        String nickName;
        float laziness;//0.. 1
        byte IQ;//.. 127
        int exams;
        int marks[];



        Student() {
            nickName = "Ilya";
            laziness = 0.50f;
            IQ = (byte) 100;
            exams = 5;
            marks = new int[exams];
            int i;
            for (i = 0; i < exams; i++);
            marks[i] = 3;
        }


        Student(float laziness,byte iq){
            nickName = "Dima";
            this.laziness = laziness;
            this.IQ = iq;
            exams = 5;
            marks = new int[exams];
            for (int i = 0; i < exams; i++)
                marks[i] = 5;

        }
        Student(Student Vanya)
        {
            nickName = Vanya. nickName;
            laziness = Vanya. laziness;
            IQ = Vanya.IQ;
            exams = Vanya.exams;
            marks = new int [exams];
            for (int i = 0; i < exams; i++)
                marks [i] = Vanya. marks [i];
        }


        void println(String s)
        {
            println("Student nick is" + nickName);
            println("Student laziness is" + laziness);
            for (int i = 0; i < exams; i++)
                System.out.print(" "+marks[i]);

        }
        public class Main {
            public static void main(String[] args) {

                Student Ilya;
                Ilya = new Student();
                Student Artur;
                Artur = new Student(0.50f, (byte) 120);
                Student Clone = new Student(Artur);
                Student grupaI[] = new Student[12];
                int i;
                for (i = 0; i < grupaI.length; i++);
                    grupaI[i] = new Student((float) (0.1 * 1), (byte) (120 + i));
                grupaI[i].printStudent();
            }
        }

    private void printStudent() {
        System.out.println("Student's nick is " + nickName);
        println("Students laziness is: " + laziness );
        println("Students IQ is: " + IQ);
        println("Students exams is: " + exams);
    }
}

