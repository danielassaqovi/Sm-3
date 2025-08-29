// Turunan 4: Mobil Listrik
class MobilListrik extends Mobil {
    int kapasitasBaterai; // kWh
    int dayaTersisa; // %

    public MobilListrik(String merk, int cc, String warna, int totalBeban, int kapasitasBaterai, int dayaTersisa) {
        super("Listrik", merk, cc, 0, warna, totalBeban);
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaTersisa = dayaTersisa;
    }

    public void isiDaya(int persen) {
        dayaTersisa += persen;
        if (dayaTersisa > 100) dayaTersisa = 100;
        System.out.println(merk + " baterai diisi, daya sekarang: " + dayaTersisa + "%");
    }

    public void gunakanDaya(int persen) {
        dayaTersisa -= persen;
        if (dayaTersisa < 0) dayaTersisa = 0;
        System.out.println(merk + " sedang digunakan, daya tersisa: " + dayaTersisa + "%");
    }

    @Override
    public double konsumsiBahanBakar(int jarak, boolean ac) {
        // konversi: 1 kWh = ±5 km
        double konsumsiEnergi = (jarak / 5.0);
        if (ac) konsumsiEnergi += 0.5;
        System.out.println(merk + " konsumsi listrik: " + konsumsiEnergi + " kWh untuk jarak " + jarak + " km");
        return konsumsiEnergi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Baterai: " + kapasitasBaterai + " kWh, Daya Tersisa: " + dayaTersisa + "%");
    }
}