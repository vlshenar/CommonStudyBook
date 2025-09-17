package ekkelIotasks.innerclasses;

import ekkelIotasks.innerclasses.horrorshow.CreepyHouse;
import ekkelIotasks.innerclasses.horrorshow.DangerousMonster;
import ekkelIotasks.innerclasses.horrorshow.Vampire;

/**
 * реализация интерфейсов как внутренних классов
 */

public class HorrorShow {
    public static void main(String[] args) {

        CreepyHouse house = new CreepyHouse();

        Vampire vampire = house.getVampire();

        DangerousMonster dangerousMonster = house.getMonster();

        vampire.drinkBlood();
        vampire.kill();

        dangerousMonster.destroy();
        dangerousMonster.menace();
    }
}
