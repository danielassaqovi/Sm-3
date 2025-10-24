public class Segitiga {
    // Atribut
    private int sudut;
    
    // Method overloading #1: totalSudut dengan 1 parameter
    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }
    
    // Method overloading #2: totalSudut dengan 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }
    
    // Method overloading #3: keliling dengan 3 parameter int
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    // Method overloading #4: keliling dengan 2 parameter int (return double)
    public double keliling(int sisiA, int sisiB) {
        // Menghitung sisi miring menggunakan teorema Pythagoras
        // c = √(a² + b²)
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
    
    // Getter untuk sudut
    public int getSudut() {
        return this.sudut;
    }
}  