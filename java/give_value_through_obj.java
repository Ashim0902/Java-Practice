class Sample {
    int display(int a) {  // Removed semicolon
        System.out.println("Hello, this is an object example! " + a);
        return a; // Return an integer as required by the method signature
    }
}

class give_value_through_obj {
    public static void main(String[] args) {
        Sample obj = new Sample(); // Object creation
        obj.display(2); // Calling method using object
    }
}
