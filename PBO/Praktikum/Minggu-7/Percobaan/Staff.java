public class Staff extends Karyawan {
    
    private int lembur;
    private double gajiLembur;
    
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public int getLembur() {
        return lembur;
    }
    
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public double getGajiLembur() {
        return gajiLembur;
    }
    
    // Overloading method getGaji
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }
    
    // Overriding method getGaji dari Karyawan
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }
    
    public void lihatInfo() {
        System.out.println("NIP \t\t: " + this.getNip());
        System.out.println("Nama \t\t: " + this.getNama());
        System.out.println("Golongan \t: " + this.getGolongan());
        System.out.println("Jml Lembur \t: " + this.getLembur() + " jam");
        // Menggunakan printf untuk format output yang lebih rapi
        System.out.printf("Gaji Lembur\t: $%.0f\n", this.getGajiLembur());
        // Memanggil method getGaji() yang sudah dioverride (Gaji Pokok + Gaji Lembur)
        System.out.printf("Gaji Total\t: $%.0f\n", this.getGaji());
    }
}