
class animal {
    animal() {
        System.out.println("Animal constructor called");
    }
    animal(int a) {
        this();
        System.out.println("Animal constructor with int parameter called: " + a);
    }
}
class dog extends animal {
    dog() {

        super(20);
        System.out.println("Dog constructor called");
    }
    dog(int a) {
        this();
        System.out.println("Dog constructor with int parameter called: " + a);
    }
}

public class access4 {
    public static void main(String[] args) {
        animal d = new dog(10); 
    }

}