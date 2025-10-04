package selfmadethings.handmadecypher;

/**
 * Шифрование с помощью открытого ключа
 */

//генератор простого числа
 class PrimeNumberGenerator {
    //вернуть первое простое число, которое больше
    //заданного произвольного числа
     static long generate(long floor) {
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

    // Наибольший общий делитель
    static int grandCommonDivider(int a, int b) {
        int r;
        while (b != 0) {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    //возвращает нечетное число больше данного
    static int getNoparity(int floor) {
       floor++;
       while(floor%2 == 0) floor++;
       return floor;
    }
}
