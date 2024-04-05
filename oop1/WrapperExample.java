package oop1;
public class WrapperExample {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        Integer a= 10;
        Integer b=20;
        System.out.println(a+" "+b);

        
    }
    

    
    static void swap(Integer a,Integer b)
        {
            Integer temp=a;
            a=b;
            b=temp;
        }
}
