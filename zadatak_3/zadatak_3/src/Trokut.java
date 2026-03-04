
public class Trokut extends GeometrijskiLik{

    String naziv;
    double a;
    double b;
    double c;

    Trokut(String naziv, double a, double b, double c){
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    @Override
    double povrsina(){
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double opseg(){
        return a + b + c;
    }



}
