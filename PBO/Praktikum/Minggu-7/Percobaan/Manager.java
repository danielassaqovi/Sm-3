public class Manager extends Karyawan {

    private double tunjangan;
    private String bagian;
    private Staff st[]; // Array untuk menyimpan objek-objek Staff

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("---------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("---------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager \t: " + this.getBagian());
        System.out.println("NIP \t\t: " + this.getNip());
        System.out.println("Nama \t\t: " + this.getNama());
        System.out.println("Golongan \t: " + this.getGolongan());
        // Menggunakan printf untuk format output Tunjangan
        System.out.printf("Tunjangan \t: $%.0f\n", this.getTunjangan());
        // Memanggil method getGaji() yang sudah dioverride (Gaji Pokok + Tunjangan)
        System.out.printf("Gaji Total\t: $%.0f\n", this.getGaji());
        System.out.println("Bagian \t\t: " + this.getBagian());
        
        // Menampilkan informasi detail Staf yang berada di bawah manajer ini
        this.viewStaff();
    }

    // Overriding method getGaji dari Karyawan
    public double getGaji() {
        // Gaji total Manager = Gaji Pokok Karyawan + Tunjangan
        return super.getGaji() + tunjangan;
    }
}