public class Main {
    public static void main(String[] args){

        Trokut trokut = new Trokut(2.4, 1,2);
        Pravokutnik pravokutnik = new Pravokutnik(2,5);
        Krug krug = new Krug(3);


        System.out.println(trokut.getA());
        System.out.println(pravokutnik.getA());
        System.out.println(krug.getR());


    }
}
