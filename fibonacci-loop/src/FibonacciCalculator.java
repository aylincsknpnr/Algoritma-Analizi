
public class FibonacciCalculator {

    public static int fib2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
           
     
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
          
        }
        return fibonacci; 
      
    }   
    public static void main(String[] args) {
        // TODO code application logic here
        int elemanlar[] = {10, 20, 30, 40, 50, 60, 70};
        long sonuc[] = new long[7];
        long gecenZaman[] = new long[7];

        for (int i = 0; i < elemanlar.length; i++) {
            long startTime = System.currentTimeMillis();
            sonuc[i] = fib2(elemanlar[i]);
            long elapsedTime = System.currentTimeMillis()-startTime;
            gecenZaman[i] = elapsedTime;

            System.out.println(elemanlar[i] + " inci eleman = " + sonuc[i] + " eleman üretiminde geçen zaman  " + gecenZaman[i]);
        }

    }
}
