package ekkelIotasks.innerclasses.usersqueryes;

/**
 * задание под номером 1 с сайта
 * www.examclouds.com/ru/java/java-core-russian/lesson14-tasks
 */

public class User {
    private String login;
    private String passWord;

    //constructor
    public User(String login, String passWord) {
        this.login = login;
        this.passWord = passWord;
    }

    //внутренний класс
    public class Query {
        public void printToLog(){
            System.out.println("User - " + login + " with password - " +
                    passWord + " sent query.");
        }
    }

    public void createQuery(){
        new Query().printToLog();
    }
}
