class animal {
    animal() {
        System.out.println("Animal constructor called");
    }
    animal(int a) {
        System.out.println("Animal constructor with int parameter called: " + a);
    }
}
class dog extends animal {
    dog() {
        
        System.out.println("Dog constructor called");
    }
    dog(int a) {
        super(20);
        System.out.println("Dog constructor with int parameter called: " + a);
    }
}

public class access2 {
    public static void main(String[] args) {
        dog d = new dog(10); 
    }

}

