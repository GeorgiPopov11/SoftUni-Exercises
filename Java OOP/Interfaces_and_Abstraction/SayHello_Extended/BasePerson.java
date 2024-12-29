package Interfaces_and_Abstraction.SayHello_Extended;

public abstract class BasePerson implements Person {

    String name;

    protected BasePerson(String name) {
        setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
