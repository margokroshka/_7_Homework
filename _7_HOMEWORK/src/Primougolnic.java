public class Primougolnic extends Figura{
    int a;
    int b;
    Primougolnic(int a, int b){
        this.a=a;
        this.b=b;

    }

    public Primougolnic(String s1, String s) {

    }

    int receiveP () {
        P=a+b;
        return P;
    }
    void receiveS () {
        int p=P/2;
        S=a*b;
        System.out.println("Площадь фигуры равна= "+S);
    }
}
