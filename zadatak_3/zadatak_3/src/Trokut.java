
public class Trokut extends GeometrijskiLik{

    double a;
    double b;
    double c;

    Trokut(String naziv, double a, double b, double c){
        super(naziv);

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Stranice moraju biti > 0");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Ne postoji trokut s tim stranicama");
        }

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
    public double povrsina(){
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double opseg(){
        return a + b + c;
    }



}
