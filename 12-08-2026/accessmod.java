class demo {
    private int a = 10;
    protected static int b = 20;
    static int c = 30;
    public static int d = 40;
    int getA() {
        return a;
    }
}
public class accessmod extends demo {
    public static void main(String[] args) {
        accessmod obj = new accessmod();
        System.out.println("Protected variable b: " + b); 
        System.out.println("Default variable c: " + c); 
        System.out.println("Public variable d: " + d); 
        System.out.println("Private variable a: " + obj.getA());
    }
}
