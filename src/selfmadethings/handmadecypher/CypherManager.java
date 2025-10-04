package selfmadethings.handmadecypher;

/**
 * Шифрование с помощью открытого ключа
 */

//Агент создания ключей шифрования
//и расшифровки сообщений
public class CypherManager {

    //компоненты открытого ключа
    private  int firstOpenKey;
    private  int secondOpenKey;

    //закрытый ключ
    private int secretKey;

    public CypherManager() {
        this.createKeys();
    }

    //создает открытый и закрытый ключи
    private void createKeys() {
        int p = (int) PrimeNumberGenerator.generate(408);
        int q = (int) PrimeNumberGenerator.generate(30);
        int fiPQ = (p-1)*(q-1);     //функция Эйлера

        firstOpenKey = p*q;
        int e = 3;
        while(PrimeNumberGenerator.grandCommonDivider(e, fiPQ) != 1 && e < firstOpenKey)
            e = PrimeNumberGenerator.getNoparity(e);
        secondOpenKey = e;

        int d = 2;
        while((d*secondOpenKey%fiPQ) != 1 && d < fiPQ) d++;
        secretKey = d;
    }

    //возвращает компоненты открытого ключа
    public int getFirstOpenKey() {
        return firstOpenKey;
    }

    public int getSecondOpenKey() {
        return secondOpenKey;
    }

    //сформировать расшифрованное сообщение
    public String deCypher(String cypherMessage) {
        StringBuilder sb = new StringBuilder();
        String[] liters = cypherMessage.split(" ");
        for(String s: liters) sb.append(deCypherCore(s));
        return sb.toString();
    }

    //ядро преобразования
    private char deCypherCore(String liter) {
        int lit = Integer.parseInt(liter);
        int tmp = 1;
        for(int i = 1; i <= secretKey; i++) {
            tmp = tmp * lit;
            tmp = tmp%firstOpenKey;
        }
        return (char)tmp;
    }

}
