public class Utama {

    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");

        // Deklarasi array untuk Manager dan Staff
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        // ----------- Pembuatan Manajer -----------

        // Manajer 0
        man[0] = new Manager();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1"); // Gaji Pokok otomatis 5.000.000
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");

        // Manajer 1
        man[1] = new Manager();
        man[1].setNama("Artika");
        man[1].setNip("102");
        man[1].setGolongan("1"); // Gaji Pokok otomatis 5.000.000
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");

        // ----------- Pengaturan Staff untuk Manajer 0 (staff1) -----------

        // Staff 1[0]
        staff1[0] = new Staff();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2"); // Gaji Pokok otomatis 3.000.000
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000); // Upah per jam lembur 10.000

        // Staff 1[1]
        staff1[1] = new Staff();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2"); // Gaji Pokok otomatis 3.000.000
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000); // Upah per jam lembur 55.000

        // Masukkan staff1 ke Manajer 0
        man[0].setStaff(staff1);

        // ----------- Pengaturan Staff untuk Manajer 1 (staff2) -----------
        
        // Staff 2[0]
        staff2[0] = new Staff();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3"); // Gaji Pokok otomatis 2.000.000
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500); // Upah per jam lembur 5.500

        // Staff 2[1]
        staff2[1] = new Staff();
        staff2[1].setNama("Trisula");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4"); // Gaji Pokok otomatis 3.000.000
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000); // Upah per jam lembur 100.000

        // Staff 2[2]
        staff2[2] = new Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3"); // Gaji Pokok otomatis 2.000.000
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000); // Upah per jam lembur 20.000

        // Masukkan staff2 ke Manajer 1
        man[1].setStaff(staff2);

        // ----------- Cetak Informasi Manajer dan Staffnya -----------

        // Cetak info Manajer 0 beserta staffnya
        man[0].lihatInfo();
        
        // Cetak info Manajer 1 beserta staffnya
        man[1].lihatInfo();
    }
}