// Turunan 2: Mobil Truck
class MobilTruck extends Mobil {
    int kapasitasMaks;

    public MobilTruck(String merk, int cc, String warna, int totalBeban, int kapasitasMaks) {
        super("Truck", merk, cc, 0, warna, totalBeban);
        this.kapasitasMaks = kapasitasMaks;
    }

    public void muatBarang(int beban) {
        if (totalBeban + beban <= kapasitasMaks) {
            totalBeban += beban;
            System.out.println(merk + " berhasil menambah muatan. Total beban: " + totalBeban + " kg");
        } else {
            System.out.println("Muatan melebihi kapasitas!");
        }
    }

    @Override
    public double konsumsiBahanBakar(int jarak, boolean ac) {
        double konsumsi = super.konsumsiBahanBakar(jarak, ac);
        konsumsi += (totalBeban / 500.0); // truck makin berat makin boros
        System.out.println("Truck berat → konsumsi jadi: " + konsumsi + " liter");
        return konsumsi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas Maks: " + kapasitasMaks + " kg");
    }
}