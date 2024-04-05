public class human1 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    public human1(int age, String name, int salary, boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human1.population++;
        
    }
}
