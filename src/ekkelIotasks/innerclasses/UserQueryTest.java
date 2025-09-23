package ekkelIotasks.innerclasses;

import ekkelIotasks.innerclasses.usersqueryes.User;

/**
 * задание под номером 1 с сайта
 * www.examclouds.com/ru/java/java-core-russian/lesson14-tasks
 */

public class UserQueryTest {
    public static void main(String[] args) {

        //1
        User user1 = new User("gregory_jonson@upi.org", "password1");
        user1.createQuery();

        //2
        User user2 = new User("justinholk@fail.net", "password2");
        User.Query query = user2.new Query();
        query.printToLog();

        //3
        new User("katenilson@yahuu.com", "password3").new Query().printToLog();
    }
}
