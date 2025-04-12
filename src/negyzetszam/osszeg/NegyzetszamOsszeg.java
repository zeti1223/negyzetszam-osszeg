package negyzetszam.osszeg;

public class NegyzetszamOsszeg {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i * i < 2025; i++) {
            sum += i * i;
        }

        System.out.println("A 2025-nél kisebb négyzetszámok összege: " + sum);
    }
}
