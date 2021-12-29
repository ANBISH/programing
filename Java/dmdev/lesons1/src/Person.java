public class Person {
    protected String name = "";
    protected int age = 0;

    Person(){}

    Person(String name){
        this.name = name;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show()
    {
        System.out.println("You name:" + name);
        System.out.println("You age: " + age );
    }
    public void virtual()
    {
        System.out.println("You age: ");
    }
}
