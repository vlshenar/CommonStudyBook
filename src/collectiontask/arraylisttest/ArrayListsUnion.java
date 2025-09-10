package collectiontask.arraylisttest;

import java.util.ArrayList;

/**
 * написать программу для объединения двух массивов-списков в один
 */

public class ArrayListsUnion {
    public static void main(String[] args) {
        //списки для объединения
        ArrayList<Cats> cats = new ArrayList<>();
        ArrayList<Dogs> dogs = new ArrayList<>();

        //список - результат объединения
        ArrayList<Pets> pets = new ArrayList<>();

        //добавление в перый список
        cats.add(new Cats("Мурзик"));
        cats.add(new Cats("Печенька", "Мяу-мяф!"));
        cats.add(new Cats());

        //добавление во второй список
        dogs.add(new Dogs("Шарик"));
        dogs.add(new Dogs("Стрелка"));

        //вывод этих списков
        System.out.println(cats);
        System.out.println(dogs);

        //объединение списков и вывод результата на консоль
        pets.addAll(cats);
        pets.addAll(dogs);
        System.out.println(pets);
    }
}
