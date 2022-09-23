public abstract class Figura {
    String type;
    double S;
    int P;
    int T ;
    double C;
    int a;
    int b;
    int c;
    int r;


    int receiveP () {
        P=a+b;
        return P;
    }
    int receiveT () {
        T=a+b+c;
        return T;
    }
    double receiveC () {
        C=2*Math.PI*r;
        return C;
    }

}
