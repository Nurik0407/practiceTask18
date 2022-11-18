public class Main {
    public static void main(String[] args) {

        /**
         *  1. HelpAble (method: void firstAid();), SwimAble (method: void swim();) деген интерфейтерди тузунуз, методдору менен.
         2. Ал интерфейти implements кылган Employee
         (method: void say();) деген abstract класс болсун, методу м/н.
         3. Абстрак класстты мурастаган
         Teacher ( void teaching();) жана Driver ( void driving();) класстары болсун, методу менен.
         4 Полиморфизм колдонуп 8 турдуу объект тузуп, ар бир тузгон объектте бардык методдорду чакырыныз.
         **/

        Employee[] employees = {
                new Teacher("Ilim"),
                new Teacher("Mukhammed"),
                new Teacher("Dastan"),
                new Teacher("Sanzhar"),
                new Driver("Nursdil"),
                new Driver("Bek"),
                new Driver("AbuALi"),
                new Driver("Syimyk")};

        for (Employee employee : employees) {

            System.out.println(employee);
            employee.firstAid();
            employee.swim();
            employee.say();
            if (employee instanceof Teacher) ((Teacher) employee).teaching();
            else if (employee instanceof Driver) ((Driver) employee).driving();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }
}