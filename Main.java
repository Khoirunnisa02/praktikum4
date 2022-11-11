public class Main {

    public static void main(String[] args) {
        // Buat objek bangun datar, lingkaran, persegi, segitiga
        BangunDatar bangunDatar = new BangunDatar();

        // Masukkan nilai parameter jari lingkaran misal 40
        Lingkaran lingkaran = new Lingkaran(40);

        // Masukkan nilai parameter alas dan tinggi dengan nilai misal alas=5
        // tingginya=4
        Segitiga segitiga = new Segitiga(5, 4);

        // Masukkan nilai parameter sisi persegi dengan nilai misal = 8
        Persegi persegi = new Persegi(8);

        // Memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());
    }
}