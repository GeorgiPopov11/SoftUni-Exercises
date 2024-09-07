package OpinionPoll_P02ClassesAndObjects;

public class OpinionPoll {
    private String name;
    private int age;

    public OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return getName() + " - " + getAge();
    }

}




