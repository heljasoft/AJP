
package advanced.one;


public class GenericExecutor {
    
    public static void main(String[] args) {
        
        //Backward compatibility 1998 RAW type 1.4
        Box kanitinaKutija = new Box();
        kanitinaKutija.setObject("Kanita");
        String vrijednost1 = (String)kanitinaKutija.getObject();
        
        Box feridinaKutija = new Box();
        feridinaKutija.setObject(23);
        Integer vrijednost2 = (Integer)feridinaKutija.getObject();
        
        //<1.7 (1.5, 1.6)
        Box <String> fadilovaKutija = new Box<String>();
        fadilovaKutija.setObject("Fadil");
        String vrijednost3 = fadilovaKutija.getObject();
        
        //1.5, 1.6, 1.7
        Box <Double> mahirovaKutija = new Box<>(); //diamond
        mahirovaKutija.setObject(0.4);
        Double sadrzaj = mahirovaKutija.getObject();
        // T, S, E, V, U -> zamjena mogu biti samo objektni tipovi!!!
    }
}
