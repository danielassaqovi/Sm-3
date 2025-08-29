public class SepedaDemo {
  public static void main(String[] args) {
      //Buat dua objek Sepeda
      Sepeda spd1 = new Sepeda();
      Sepeda spd2 = new Sepeda();
      SepedaGunung spd3 = new SepedaGunung();

      //Panggil method pada objek sepeda pertama
      spd1.setMerk("Polygon");
      spd1.tambahKecepatan(10);
      spd1.gantiGear(2);
      spd1.cetakStatus();

      //Panggil method pada objek sepeda kedua
      spd2.setMerk("Wimcycle");
      spd2.tambahKecepatan(10);
      spd2.gantiGear(2);
      spd2.tambahKecepatan(10);
      spd2.gantiGear(3);
      spd2.cetakStatus();

      //Panggil method pada objek sepeda gunung
      spd3.setMerk("Klinee");
      spd3.tambahKecepatan(5);
      spd3.gantiGear(7);
      spd3.setTipeSuspensi("Gas Suspension");
      spd3.cetakStatus();
  }
}