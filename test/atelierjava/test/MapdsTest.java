
package atelierjava.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class MapdsTest {
    
//    @Test
//    public void mapOK () {
//        HashMap <String, String> paysCapitales = new HashMap<> ();
//        paysCapitales.put("France", "Paris");
//        paysCapitales.put("Angletterre", "Londres");
//        paysCapitales.put("Italy", "Rome");
//        
//        String res = paysCapitales.get("Italy");
//        System.out.println(res);
//    }
    
    
    @Test 
    public void MapKeySetOK (){
        HashMap <String, String> paysCapitales = new HashMap<> ();
        paysCapitales.put("France", "Paris");
        paysCapitales.put("Angletterre", "Londres");
        paysCapitales.put("Italy", "Rome");
       
        Set<String> cles = paysCapitales.keySet();
        for ( String pays : cles) {
            String capitale = paysCapitales.get(pays);
            System.out.println(" Pay : " + pays + " Capitale : " + capitale);
        }
        
    }
}
