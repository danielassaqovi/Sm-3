// Turunan 1: Mobil Sport
class MobilSport extends Mobil {
    boolean turbo;

    public MobilSport(String merk, int cc, String warna, int totalBeban, boolean turbo) {
        super("Sport", merk, cc, 0, warna, totalBeban);
        this.turbo = turbo;
    }

    public void aktifkanTurbo() {
        if (turbo) {
            kecepatan += 50;
            System.out.println(merk + " turbo aktif! Kecepatan bertambah jadi " + kecepatan + " km/jam");
        } else {
            System.out.println(merk + " tidak memiliki turbo.");
        }
    }

    @Override
    public double konsumsiBahanBakar(int jarak, boolean ac) {
        double konsumsi = super.konsumsiBahanBakar(jarak, ac);
        if (turbo) {
            konsumsi += 1.0; // turbo bikin lebih boros
            System.out.println("Turbo aktif → konsumsi bertambah jadi: " + konsumsi + " liter");
        }
        return konsumsi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Turbo: " + turbo);
    }
}