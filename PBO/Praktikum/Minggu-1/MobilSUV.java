// Turunan 3: Mobil SUV
class MobilSUV extends Mobil {
    boolean fourByFour;

    public MobilSUV(String merk, int cc, String warna, int totalBeban, boolean fourByFour) {
        super("SUV", merk, cc, 0, warna, totalBeban);
        this.fourByFour = fourByFour;
    }

    public void offroad() {
        if (fourByFour) {
            System.out.println(merk + " sedang dipakai offroad dengan mode 4x4.");
        } else {
            System.out.println(merk + " bukan 4x4, hati-hati saat offroad.");
        }
    }

    @Override
    public double konsumsiBahanBakar(int jarak, boolean ac) {
        double konsumsi = super.konsumsiBahanBakar(jarak, ac);
        if (fourByFour) {
            konsumsi += 0.8; // mode 4x4 lebih boros
            System.out.println("Mode 4x4 aktif → konsumsi bertambah jadi: " + konsumsi + " liter");
        }
        return konsumsi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Mode 4x4: " + fourByFour);
    }
}