class Sample {
    int b;
    int c;

    int display(int a) {
        System.out.println("value of a: " + a);
        System.out.println("Value of b: " + this.b);
        System.out.println("Value of c: " + this.c);
        return a;
    }
}

class by_refrence_variable {
    public static void main(String[] args) {
        Sample obj = new Sample(); // Object creation
        obj.b = 2;  // Assigning values before calling display()
        obj.c = 3;
        obj.display(2); // Calling method using object
    }
}
