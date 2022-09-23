import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        main3();
    }

    public static void main1() {
        Treugolnic one = new Treugolnic(3, 4, 5);
        one.receiveP();
        one.receiveS();
        System.out.println();

        Primougolnic first = new Primougolnic(3, 4);

        Primougolnic first1 = new Primougolnic(2, 3);
        Primougolnic two2 = new Primougolnic(4, 5);
        Primougolnic three3 = new Primougolnic(5, 6);
        Primougolnic four4 = new Primougolnic(6, 7);
        Primougolnic five5 = new Primougolnic(7, 8);

        first.receiveP();
        first.receiveS();
        System.out.println();

        Krug perv = new Krug(1);
        perv.receiveC();
        perv.receiveS();
        System.out.println();


        Figura[] figures = new Figura[5];
        figures[0] = new Krug(6);
        figures[1] = new Treugolnic(3, 5, 4);
        figures[2] = new Primougolnic(4, 5);
        figures[3] = new Treugolnic(5, 6, 2);
        figures[4] = new Primougolnic(2, 3);

        int arearect = 0;
        int arearect2 = 0;
        int areatrew = 0;
        int areatrew2 = 0;
        double areacube = 0;

        areacube = figures[0].receiveC();
        System.out.println("Площадь круга: " + areacube);
        areatrew2 = figures[1].receiveT();
        System.out.println("Площадь треугольника: " + areatrew2);
        arearect = figures[2].receiveP();
        System.out.println("Площадь прямоугольника: " + arearect);
        areatrew = figures[3].receiveT();
        System.out.println("Площадь треугольника: " + areatrew);
        arearect2 = figures[4].receiveP();
        System.out.println("Площадь прямоугольника: " + arearect2);

        double result = areacube + arearect + areatrew + areatrew2 + arearect2;
        System.out.println("Общая площадь: " + result);
    }

    public static void main2() {
        Nameable name = new Director();
        Nameable name1 = new Worker();
        Nameable name2 = new Bookkeeper();
        name.name();
        name1.name();
        name2.name();
    }

    public static void main3() {
        Register[] registers = new Register[10];
        for (int i = 0; i < 10; i++) {
            String s =UUID.randomUUID().toString();
            String s1=s.split("-")[0];
            registers[i]= new Register(s1, s);
        }
        System.out.println(Register.getPrint());
    }

    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }

    public static void main4() {
        System.out.println(recursion(20, 15));
        System.out.println(recursion(10, 15));
    }

    public static void main5() {
        Student student = new Student("Ivan", "Ivanov", "Group1", 4.7);
        Aspirant aspirant1 = new Aspirant("Vova", "Vladimirov", "Group2", 5, "Work");
        Student aspirant2 = new Aspirant("Petr", "Petrov", "Group3", 4.3, "Work1");

    Student[] students = {student, aspirant1, aspirant2};
        for (Student s: students) {
            System.out.println(s.lastName+" "+s.getScholarship());
        }

    }
}
