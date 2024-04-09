public class objdemo {
    int num;
    float num2;
    public objdemo(int num,float num2) {
        this.num = num;
        this.num2=num2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     // TODO Auto-generated method stub
    //     super.finalize();
    // }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        // return super.hashCode();
        return num;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    public static void main(String[] args) {
        objdemo obj1 = new objdemo(23,98.9f);
        objdemo obj2 = new objdemo(23,78.8f);
        // System.out.println(obj.hashCode());
        // System.out.println(obj2.hashCode());
        if (obj1==obj2)
        {
            System.out.println("obj1==obj2");
        }
        if (obj1.equals(obj2))
        {
            System.out.println("obj1==obj2 using equals");
        }
    }
}
