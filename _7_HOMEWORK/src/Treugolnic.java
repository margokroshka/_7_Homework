public class Treugolnic extends Figura{
int a;
int b;
int c;
Treugolnic(int a, int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
}
     int receiveT () {
        T=a+b+c;
        return T;
    }
    void receiveS () {
    int p=T/2;
        S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь фигуры равна= "+S);
    }
}
