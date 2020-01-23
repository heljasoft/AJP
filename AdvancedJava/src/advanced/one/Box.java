
package advanced.one;
//T-generički odnosno generalni tip podatka
//opseg vidljivosti (scope) je blok koda ove klase

public class Box<T> {
    
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
