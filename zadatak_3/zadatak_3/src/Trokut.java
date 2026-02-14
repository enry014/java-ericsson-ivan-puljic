import static java.lang.Math.sqrt;

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
        return 0;
    }

    @Override
    double opseg(){
        return 0;
    }

}
