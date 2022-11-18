public abstract class Employee implements HelpAble,SwimAble{

    private String name;
   void say(){
       System.out.println(getName()+" tells a story");
   }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void firstAid() {
        System.out.println(getName()+" did first aid");
    }

    @Override
    public void swim() {
        System.out.println(getName()+ " floats");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
