/**
 * A
 */
public class A {

    private int num;
    String name;
    public void setNum(int num) {
        this.num = num;
    }

    int[] arr;
    
    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }



}