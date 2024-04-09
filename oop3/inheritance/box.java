public class box {
    double l;
    double h;
    double w;

    box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    box(double side)
    {
        this.l=side;
        this.h=side;
        this.w=side;
    }
    box(double l,double h, double w)
    {
        this.l=l;
        this.h=h;
        this.w=w;
    }
    public void information()
    {
        System.out.println("running in box");
    }
}
