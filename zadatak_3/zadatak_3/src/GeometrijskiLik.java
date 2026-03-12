public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private final String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double povrsina();
    public abstract double opseg();

    @Override
    public String toString() {
        return naziv + " | Povrsina: " + String.format("%.2f", povrsina()) + " | Opseg: " + String.format("%.2f", opseg()) + "\n";
    }

    @Override
    public int compareTo(GeometrijskiLik drugi) {
        return Double.compare(this.povrsina(), drugi.povrsina());
    }

}
