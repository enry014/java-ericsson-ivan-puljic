public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    protected String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    abstract double povrsina();
    abstract double opseg();

    @Override
    public String toString() {
        return naziv + " | Povrsina: " + String.format("%.2f", povrsina()) + " | Opseg: " + String.format("%.2f", opseg()) + "\n";
    }

    @Override
    public int compareTo(GeometrijskiLik drugi) {
        return Double.compare(this.povrsina(), drugi.povrsina());
    }

}
