// class Test{
//     static String name;    here if you remove static then abc efg print else efg efg print

//     public Test(String name)
//     {
//         this.name = name;

//     }
// }

public class innerclass {
    static class Test{
        String name;

        public Test(String name)
        {
            this.name = name;

        }
    }
    public static void main(String[] args) {
        Test a = new Test("abc");
        Test b = new Test("efg");
        System.out.println(a.name);
        System.out.println(b.name);

    }

}
