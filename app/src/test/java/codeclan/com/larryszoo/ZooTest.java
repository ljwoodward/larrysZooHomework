package codeclan.com.larryszoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by janemackay on 11/11/2017.
 */
public class ZooTest {

    Zoo zoo;
    Animal animal1;
    Animal animal2;
    Animal animal3;
    Enclosure enclosure1;
    Enclosure enclosure2;

    @Before
    public void setUp() throws Exception {
        animal1 = new Lion("Aslan", 45000);
        animal2 = new Lion("Mufasa", 50000);
        animal3 = new Panda("Beatrice", 85000);
        enclosure1 = new Enclosure<Lion>();
        enclosure1.addToEnclosure(animal1);
        enclosure1.addToEnclosure(animal2);
        zoo.addEnclosureToZoo(enclosure1);
        enclosure2 = new Enclosure<Panda>();
        enclosure2.addToEnclosure(animal3);
        zoo.addEnclosureToZoo(enclosure2);
    }

    @Test
    public void testCalculateTotalAnimals() {

    }

}