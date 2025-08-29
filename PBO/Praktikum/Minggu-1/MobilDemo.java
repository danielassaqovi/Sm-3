// Class Demo
public class MobilDemo {
    public static void main(String[] args) {
        MobilSport ms = new MobilSport("Ferrari", 4000, "Merah", 200, true);
        MobilTruck mt = new MobilTruck("Hino", 5000, "Hijau", 2000, 10000);
        MobilSUV suv = new MobilSUV("Fortuner", 2500, "Hitam", 500, true);
        MobilListrik ml = new MobilListrik("Tesla", 0, "Putih", 300, 100, 80);

        System.out.println("=== Mobil Sport ===");
        ms.nyalakanMesin();
        ms.ubahKecepatan();
        ms.konsumsiBahanBakar(100, true);
        ms.aktifkanTurbo();
        ms.info();

        System.out.println("\n=== Mobil Truck ===");
        mt.nyalakanMesin();
        mt.ubahKecepatan();
        mt.konsumsiBahanBakar(150, false);
        mt.muatBarang(5000);
        mt.info();

        System.out.println("\n=== Mobil SUV ===");
        suv.nyalakanMesin();
        suv.ubahKecepatan();
        suv.konsumsiBahanBakar(120, true);
        suv.offroad();
        suv.info();

        System.out.println("\n=== Mobil Listrik ===");
        ml.nyalakanMesin();
        ml.ubahKecepatan();
        ml.konsumsiBahanBakar(80, true);
        ml.isiDaya(10);
        ml.gunakanDaya(30);
        ml.info();
    }
}