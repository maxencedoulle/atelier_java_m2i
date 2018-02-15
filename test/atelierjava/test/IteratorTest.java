package atelierjava.test;

import java.util.HashSet;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class IteratorTest {

//        @Test
//        public void iteratorOK () {
//            HashSet<String> set = new HashSet <> ();
//            set.add("rouge");
//            set.add("jaune");
//            set.add("Vert");
//            
//            Iterator <String> iterateur = set.iterator();
//            String couleur1 = iterateur.next ();
//            String couleur2 = iterateur.next ();
//            String couleur3 = iterateur.next ();
//            String couleur4="";
//            if (iterateur.hasNext () == true){
//                couleur4 = iterateur.next();
//            }
//            
//            System.out.println( couleur1);
//            System.out.println( couleur2);
//            System.out.println( couleur3 );
    @Test
    public void iteratorOK() {
        HashSet<String> set = new HashSet<>();
        set.add("rouge");
        set.add("jaune");
        set.add("Vert");

        Iterator<String> iterateur = set.iterator();

        while (iterateur.hasNext()) {
            String next = iterateur.next();
            System.out.println(next);
        }
    }
}
