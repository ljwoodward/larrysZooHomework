package codeclan.com.larryszoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by janemackay on 10/11/2017.
 */
public class EnclosureTest {

    Animal animal1;
    Animal animal2;
    Animal animal3;
    Enclosure<Lion> enclosure;
    Enclosure<Lion> enclosure2;

    @Before
    public void setUp() throws Exception {
        animal1 = new Lion("Aslan", 45000);
        animal2 = new Panda("Beatrice", 85000);
        animal3 = new Lion("Mufasa", 50000);
        enclosure = new Enclosure<Lion>();
    }

    @Test
    public void testGetInhabitants() {
        enclosure.addToEnclosure((Lion) animal1);
        enclosure.addToEnclosure((Lion) animal3);
        int actual = enclosure.inhabitants.size();
        assertEquals(2, actual);
    }

    @Test
    public void testRemoveInhabitants() {
        enclosure.addToEnclosure((Lion) animal1);
        enclosure.addToEnclosure((Lion) animal3);
        System.out.println(enclosure.inhabitants.size());
        enclosure.remove(animal3);
        int actual = enclosure.inhabitants.size();
        assertEquals(1, actual);
    }

}