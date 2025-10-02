package selfmadethings.handmadecypher;

//генератор простого числа
public class PrimeNumberGenerator {
    //вернуть первое простое число, которое больше
    //заданного произвольного числа
   public static long generate(long floor) {
        long prime = 0;
        long bound = Long.MAX_VALUE;
        outer:
        for(long i = 2; i < bound; i++) {
            for(long j = 2; j < i; j++) {
                if (i % j == 0) continue  outer;
            }
           if(i > floor) {
               prime = i;
               break;
           }
        }
        return prime;
    }
}
