package ekkelIotasks.innerclasses.horrorshow;

/**
 * реализация интерфейсов как внутренних классов
 */

public class CreepyHouse {
    public Vampire getVampire(){
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("drink blood");
            }

            @Override
            public void destroy() {
                System.out.println("destroyed your defence");
            }

            @Override
            public void kill() {
                System.out.println("you dead and alive as a new vampire");
            }

            @Override
            public void menace() {
                System.out.println("no menace");
            }
        };
    }
    public DangerousMonster getMonster(){
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("destroy all");
            }

            @Override
            public void menace() {
                System.out.println("A-a-a-a-r-r-rg-h-h!");
            }
        };
    }
}
