package ekkelIotasks.innerclasses.usersqueryes;

/**
 * задание номер 2 с сайта
 * www.examclouds.com/ru/java/java-core-russian/lesson14-tasks
 */

public class UserV2 {
    private String login;
    private String passWord;

    //constructor
    public UserV2(String login, String passWord) {
        this.login = login;
        this.passWord = passWord;
    }

    //метод createQuery() с локальным внутренним классом
    public void createQuery() {
        class Query {
            void printToLog() {
                System.out.println("User - " + login + " with password - " + passWord
                        + " sent query.");
            }
        }
        new Query().printToLog();
    }
}
