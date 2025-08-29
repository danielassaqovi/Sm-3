// Class Induk
class Mobil {
    String jenis;
    String merk;
    int cc;
    int kecepatan;
    String warna;
    int totalBeban;

    public Mobil(String jenis, String merk, int cc, int kecepatan, String warna, int totalBeban) {
        this.jenis = jenis;
        this.merk = merk;
        this.cc = cc;
        this.kecepatan = kecepatan;
        this.warna = warna;
        this.totalBeban = totalBeban;
    }

    public void nyalakanMesin() {
        System.out.println(merk + " mesin dinyalakan...");
    }

    public void matikanMesin() {
        System.out.println(merk + " mesin dimatikan.");
    }

    public void ubahKecepatan() {
        int kecepatanBaru = (cc / 100) - (totalBeban / 10);
        if (kecepatanBaru < 0) kecepatanBaru = 0;
        this.kecepatan = kecepatanBaru;
        System.out.println(merk + " kecepatan disesuaikan menjadi " + kecepatan + " km/jam");
    }

    // Hitung penggunaan bahan bakar
    public double konsumsiBahanBakar(int jarak, boolean ac) {
        // dasar konsumsi = jarak dibagi efisiensi cc
        double konsumsi = (jarak / (cc / 1000.0)) + (totalBeban / 1000.0);

        // jika AC dinyalakan
        if (ac) {
            konsumsi += 0.5; // nambah 0.5 liter
        }
        System.out.println(merk + " menempuh " + jarak + " km, konsumsi BBM: " + konsumsi + " liter");
        return konsumsi;
    }

    public void info() {
        System.out.println("Jenis: " + jenis + 
                           ", Merk: " + merk + 
                           ", CC: " + cc + 
                           ", Kecepatan: " + kecepatan + 
                           ", Warna: " + warna + 
                           ", Total Beban: " + totalBeban + " kg");
    }
}