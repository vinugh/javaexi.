class parent{
    String color="blue";
    void disp(){
    System.out.println("in parent class");
    }
}
class child extends parent{
    String color="black";
    
    void display(){
        super.disp();
        System.out.println("in child class");
        System.out.println(super.color);


        }
}

public class access {
 public static void main(String[] args) {
    child obj = new child();
    obj.display();
 }
}
