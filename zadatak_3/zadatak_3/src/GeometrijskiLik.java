public abstract class GeometrijskiLik {

    protected String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    abstract double povrsina();
    abstract double opseg();
}
