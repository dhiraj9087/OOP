package singleton;

public class Main2 {
    public static void main(String[] args) {
        Singleton obj = Singleton.getinstance();
        Singleton obj2 = Singleton.getinstance();
        Singleton obj3 = Singleton.getinstance();
        Singleton obj4 = Singleton.getinstance();
    }
}
