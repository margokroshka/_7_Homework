public class Krug extends Figura{
    int r;

    Krug(int r){
        this.r = r;
    }
    double receiveC () {
        C=2*Math.PI*r;
        return C;
    }
    void receiveS () {
        S=Math.PI*r*r;
        System.out.println("Площадь фигуры равна= "+S);
    }
}
