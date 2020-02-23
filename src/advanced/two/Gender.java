
package advanced.two;

public enum Gender {
    MALE("Muski"), FEMALE("Zenski"), TRANS("Srednji");
    
    String name;

    private Gender(String n) {
        this.name=n;
    }

    public String getName() {
        return name;
    }
    
    
}
