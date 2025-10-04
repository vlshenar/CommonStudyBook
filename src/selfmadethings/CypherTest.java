package selfmadethings;

import selfmadethings.handmadecypher.CypherManager;
import selfmadethings.handmadecypher.Encrypter;

/**
 * Шифрование с помощью открытого ключа
 */

public class CypherTest {
    public static void main(String[] args) {
        //создает открытый и закрытый ключи, расшифровывает сообщение
        CypherManager cypherManager = new CypherManager();

        //использует открытый ключ для шифровки сообщения
        Encrypter encrypter = new Encrypter(cypherManager.getFirstOpenKey(), cypherManager.getSecondOpenKey());

        //исходное сообщение
        String message = "Be the spirit of Autumn: stalwart, and colorful, amenable to change, the grateful breath that greets each day.";
        System.out.println(message);    //вывод

        //зашифрованное сообщение
        String encryptingMessage = encrypter.encrypt(message);
        System.out.println(encryptingMessage);  //вывод

        //дешифровка
        String descryptingMessage = cypherManager.deCypher(encryptingMessage);
        System.out.println(descryptingMessage); //вывод
    }
}
