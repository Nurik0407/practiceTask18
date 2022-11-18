public class Teacher extends Employee{
    public Teacher(String name) {
        super(name);
    }

    void teaching(){
        System.out.println(getName()+" teaches a lesson");
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
