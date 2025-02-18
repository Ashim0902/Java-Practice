class Car {
    private String brand;
    private String color;
    
    // Setter methods
    void setBrand(String brand) {
        this.brand = brand;
    }
    
    void setColor(String color) {
        this.color = color;
    }
    
    // Getter methods
    String getBrand() {
        return brand;
    }
    
    String getColor() {
        return color;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("BMW");
        c.setColor("Black");
        
        System.out.println(c.getBrand() + " " + c.getColor()); // Output: BMW Black
    }
}
