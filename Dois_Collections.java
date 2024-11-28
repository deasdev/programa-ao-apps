import java.util.ArrayList;
import java.Arrays;
import java.util.Collection;


public class DoisCollections {
     public static void main (String[] args) { 
        Collection<String> vogais = new ArrayList<>();
                
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        
        Collection<String> vogais2 =  Array.asList<>("O", "U");
        
        vogais.addAll(vogais2);      
        System.out.println("Lista das vogais:" +vogais);
    
    }

}