sclass Car {
    String brand;
    String color;
    
    // Default constructor
    Car() {
        brand = "BMW";
        color = "Black";
    }
    
    // Copy constructor
    Car(Car obj) {
        brand = obj.brand;
        color = obj.color;
    }

    void display() {
        System.out.println(brand + " " + color);
    }
}

class Copy_Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();  // Original object
        Car c2 = new Car(c1); // Copying object

        c2.display();  // Output: BMW Black
    }
}
