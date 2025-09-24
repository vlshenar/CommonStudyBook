package ekkelIotasks.innerclasses;

import ekkelIotasks.innerclasses.kitchen.Cookable;
import ekkelIotasks.innerclasses.kitchen.Food;

/**
 * задачи с сайта www.examclouds.com/ru/java/java-core-russian/lesson14-tasks
 * задача номер 5
 */

public class CookingProcess {
    public static void main(String[] args) {

        Food food = new Food();

        food.prepare(new Cookable() {
            //анонимный класс
            @Override
            public void cook(String str) {
                System.out.println("boil " + str);
            }
        }, "chicken meat");
    }
}
