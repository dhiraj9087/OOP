public class boxweight extends box{
    double weight;
    public boxweight()
    {
        this.weight = -1;
    }
    boxweight (boxweight other)
    {
        super();
        weight = other.weight;
    }
    public boxweight(double side,double weight)
    {
        super(side);
        this.weight=weight;
    }
    public boxweight(double l,double h,double w,double weight)
    {
        super(l,h,w);  // used to initlized values of parent class
        this.weight=weight;
    }
}
