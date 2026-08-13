import java.util.*;
class a {
    public void display() {
        System.out.println("Display method called");
        this.show();
    }
    static void show() {
        System.out.println("Show method called");
        new a().display(); 
    }
}

public class main {
    public static void main(String[] args) {
        a obj = new a();
        a.show();
        String str 
    }
}
