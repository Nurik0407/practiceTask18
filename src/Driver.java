public class Driver extends Employee {
    public Driver(String name) {
        super(name);
    }

    void driving() {
        System.out.println(getName()+" driving a car ");
    }

    @Override
    void say() {
        super.say();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void firstAid() {
        super.firstAid();
    }

    @Override
    public void swim() {
        super.swim();
    }

}
