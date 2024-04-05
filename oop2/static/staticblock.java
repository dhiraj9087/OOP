public class staticblock {
    static int a=9;
    static int b;
    // b=2;
    static{
        System.out.println("inside");
        b=a*6;
    }
    public static void main(String[] args) {
        staticblock obj = new staticblock();
        System.out.println(a+" "+b);

        staticblock.b+=2;
        System.out.println(a+" "+b);

        staticblock obj2 = new staticblock();    // while creating this obj2 static does not run againg it only runs for first time which was while creating obj1
        System.out.println(a+" "+ b);
    }
}
