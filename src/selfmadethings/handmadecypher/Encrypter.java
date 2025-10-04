package selfmadethings.handmadecypher;

/**
 * Шифрование с помощью открытого ключа
 */

public class Encrypter {
    private int firstOpenKey;
    private int secondOpenKey;

    public Encrypter(int firstOpenKey, int secondOpenKey) {
        this.firstOpenKey = firstOpenKey;
        this.secondOpenKey = secondOpenKey;
    }

    //сформировать зашифрованное сообщение
    public String encrypt(String message) {
        int liter;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            liter  = cypherCore(message.charAt(i));
            sb.append(liter).append(" ");
        }
        return sb.toString();
    }

    //выполняет основную работу по шифрованию
    private int cypherCore(int toEncrypt) {
        long tmp = (long)Math.pow(toEncrypt, secondOpenKey);
        return (int)(tmp%firstOpenKey);
    }
}
