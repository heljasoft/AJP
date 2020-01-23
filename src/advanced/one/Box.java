
package advanced.one;
//T-generički odnosno generalni tip podatka
//opseg vidljivosti (scope) je blok koda ove klase
// Generički tipovi:
// 1. Unbounded
// 2. Bounded

public class Box<T> {
    
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    
    //generički tip na nivou nestatičke funkcije
    public <U extends Number> void inspect(U u){
        System.out.println("T je tipa: "+ object.getClass().getName());
    }
}
