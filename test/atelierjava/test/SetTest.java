
package atelierjava.test;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SetTest {
    
    @Test
    public void addOk () {
        HashSet<String> set = new HashSet<> ();
        set.add("vert");
        set.add("vert");
        set.add("rouge");
        
        System.out.println(set);
    }
}
