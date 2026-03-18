class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
        this.sisi = 0;
    }

    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return 3 * sisi;
    }

    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }
}

public class Main {
    public static void main(String[] args) {

        Segitiga segitiga1 = new Segitiga();
        segitiga1.setAlas(1);
        segitiga1.setTinggi(1);
        segitiga1.setSisi(1);

        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        Segitiga segitiga3 = new Segitiga(20, 30, 60);

        System.out.println("Segitiga 1");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());

        System.out.println("\nSegitiga 2");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());

        System.out.println("\nSegitiga 3");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}