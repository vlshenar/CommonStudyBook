package selfmadethings.myannotatest;

public class Worker {
    private final String name;
    private String position;
    private int loyalDegree;

    //constructors
    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
        loyalDegree = 3;
    }

    public Worker(String name, String position, int loyalDegree) {
        this.name = name;
        this.position = position;
        this.loyalDegree = loyalDegree;
    }

    public Worker() {
        name = "Harry";
        position = "Boss";
        loyalDegree = 5;
    }

    @RunThisSecond
    public String getName() {
        return name;
    }

    @RunThisSecond
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @RunThisSecond
    public int getLoyalDegree() {
        return loyalDegree;
    }

    @RunThisNow
    public void setLoyalDegree(int loyalDegree) {
        this.loyalDegree = loyalDegree;
    }
}
