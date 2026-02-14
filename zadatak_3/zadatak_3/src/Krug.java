public class Krug extends GeometrijskiLik{

    String naziv;
    double r;

    Krug(String naziv, double r){
        super(naziv);
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    @Override
    double povrsina() {
        return 0;
    }

    @Override
    double opseg() {
        return 0;
    }
}
