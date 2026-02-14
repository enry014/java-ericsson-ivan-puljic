public class Main {
    public static void main(String[] args){

        Trokut trokut = new Trokut("trokut_1",2.4, 1,2);
        Pravokutnik pravokutnik = new Pravokutnik("pravokutnik",2,5);
        Krug krug = new Krug("mali_krug",3);


        System.out.println(trokut.getNaziv());
        System.out.println(pravokutnik.getNaziv());
        System.out.println(krug.getNaziv());


    }
}
