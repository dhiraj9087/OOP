public class Main1 {
    public static void main(String[] args) {
        // human1 dhi = new human1(24, "abc", 90, false);
        // human1 dhi2 = new human1(20, "def", 98, true);
        // // System.out.println(dhi.population); dont  use static via obj
        // System.out.println(human1.population);

        
    }
    static void fun()
    {
        Main1 obj = new Main1();
        obj.greeting();
    }

    void greeting()
    {
        System.out.println("hello");
    }
}
