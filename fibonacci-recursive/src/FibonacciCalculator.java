


public class FibonacciCalculator {

	public static void main(String[] args) {
        // TODO code application logic here
        int elemanlar[] = {10, 20, 30, 40, 50, 60, 70};
        long sonuc[] = new long[7];
        long gecenZaman[] = new long[7];

        for (int i = 0; i < elemanlar.length; i++) {
            long startTime = System.currentTimeMillis();
            sonuc[i] = fib(elemanlar[i]);
            long elapsedTime = System.currentTimeMillis()-startTime;
            gecenZaman[i] = elapsedTime;

            System.out.println(elemanlar[i] + " inci eleman = " + sonuc[i] + " eleman üretiminde geçen zaman  " + gecenZaman[i]);
        }

    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}