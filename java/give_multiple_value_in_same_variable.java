class Sample {
    int b;
   final int c = 2;
    int display(int a) {
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+this.b);
        System.out.println("value of b: "+this.c);
        return a;
    }
}

class give_multiple_value_in_same_variable {
    public static void main(String[] args) {
        Sample obj = new Sample(); // Object creation
        obj.b=4;
        obj.b=3;
        obj.display(2); // Calling method using object
    }
}
