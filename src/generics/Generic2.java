
package generics;


public class Generic2 {
    public static void main(String[] args) {
        
        //instanciranje klase 
        MyClass<Integer,String, Boolean> class1 =new MyClass<>(35, "goodbye", true);
        
        System.out.println(class1.field2);
        
    }

}
