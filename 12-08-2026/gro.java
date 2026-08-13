abstract class Product {
    int productId;
    String productName;
    double price;
    
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    
    abstract double calculateDiscount();
    
    double calculateFinalPrice() {
        return price - calculateDiscount();
    }
    
    void displayDetails() {
        System.out.println("pId   : " + productId);  
        System.out.println("pName : " + productName);  
        System.out.println("Pri       : ₹" + price);  
        System.out.println("dic   : ₹" + calculateDiscount());  
        System.out.println("fp : ₹" + calculateFinalPrice());  
    }
}

class Electronics extends Product {
    Electronics(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    
    @Override
    double calculateDiscount() {
        return price * 10 / 100; // 10% discount
    }
}

class Clothing extends Product {
    Clothing(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    
    @Override
    double calculateDiscount() {
        return price * 20 / 100; 
    }
}

class Grocery extends Product {
    Grocery(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    
    @Override
    double calculateDiscount() {
        return price * 5 / 100; 
    }
}

public class gro {
    public static void main(String[] args) {
        
        Product p; 
        
        System.out.println("<-------------Electronics------------>");
        p = new Electronics(101, "Laptop", 55000);
        p.displayDetails();
        
        System.out.println("\n<-------------Clothing--------------->");
        p = new Clothing(201, "Denim Jacket", 2500);
        p.displayDetails();
        
        System.out.println("\n<-------------Grocery---------------->");
        p = new Grocery(301, "Organic Almonds", 800);
        p.displayDetails();
    }
}