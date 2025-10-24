// Main method untuk testing
public class Main {
    public static void Main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        // Testing overloading totalSudut(int)
        System.out.println("=== Testing Method Overloading ===\n");
        System.out.println("1. totalSudut(60):");
        int hasil1 = segitiga.totalSudut(60);
        System.out.println("   Sudut yang tersisa = " + hasil1 + " derajat\n");
        
        // Testing overloading totalSudut(int, int)
        System.out.println("2. totalSudut(60, 50):");
        int hasil2 = segitiga.totalSudut(60, 50);
        System.out.println("   Sudut yang tersisa = " + hasil2 + " derajat\n");
        
        // Testing overloading keliling(int, int, int)
        System.out.println("3. keliling(3, 4, 5):");
        int keliling1 = segitiga.keliling(3, 4, 5);
        System.out.println("   Keliling segitiga = " + keliling1 + " cm\n");
        
        // Testing overloading keliling(int, int)
        System.out.println("4. keliling(3, 4) - Pythagoras:");
        double keliling2 = segitiga.keliling(3, 4);
        System.out.println("   Sisi miring (c) = " + keliling2 + " cm");
        System.out.println("   (menggunakan rumus c = √(a² + b²))");
    }
}