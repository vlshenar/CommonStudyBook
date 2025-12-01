package selfmadethings.arraystuff;
//возвращает массив целых случайных чисел
import java.util.Random;

public class RandNumbers {
    private static Random rand = new Random(47);
    public static int[] getBlock(int lengthBlock){
        int[] blockOfNumbers = new int[lengthBlock];
        for (int i = 0; i < lengthBlock; i++)
            blockOfNumbers[i] = rand.nextInt();
        return blockOfNumbers;
    }
    //перегрузка метода для ограничения диапазона случайных чисел
    public static int[] getBlock(int lengthBlock, int bound){
        int[] blockOfNumbers = new int[lengthBlock];
        for (int i = 0; i < lengthBlock; i++)
            blockOfNumbers[i] = rand.nextInt(bound);
        return blockOfNumbers;
    }
}
