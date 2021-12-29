public class Student extends Person{
    Student(){}
    Student(String name){this.name = name;}
    Student(String name, int age) {this.name = name; this.age = age;}

    public void virtual()
    {
        System.out.println("You ");
    }
}
