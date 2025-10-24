public class PerkalianKu {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu Objek = new PerkalianKu();
        Objek.perkalian(25, 43);
        Objek.perkalian(34, 23, 56);
    }
} 