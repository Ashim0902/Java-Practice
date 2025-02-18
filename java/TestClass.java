class MyClass {
    private int privateVar = 10;
    public int publicVar = 20;
    protected int protectedVar = 30;

    public int getPrivateVar() {
        return privateVar;
    }
}

class TestClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        System.out.println("Public variable: " + obj.publicVar);

        System.out.println("Protected variable: " + obj.protectedVar);

        System.out.println("Private variable: " + obj.getPrivateVar());
    }
}
