public class Segitiga extends bangunDatar {
    // Buat variabel segitiga
    int alas;
    int tinggi;
    int kll;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.kll = kll;
    }

    @Override
    public float luas() {
        return (0.5 * alas * tinggi);
    }

    @Override
    public float keliling() {
        return (float) (3 * alas);

    }
}