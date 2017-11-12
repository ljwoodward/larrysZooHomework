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
        zoo = new Zoo(725000.50);
        zoo.addEnclosureToZoo(enclosure1);
        enclosure2 = new Enclosure<Panda>();
        enclosure2.addToEnclosure(animal3);
        zoo.addEnclosureToZoo(enclosure2);
    }

    @Test
    public void testCalculateTotalAnimals() {
        int actual = zoo.calculateTotalAnimals();
        assertEquals(3, actual);
    }

    @Test
    public void testCalcualteTotalValueOfAnimals() {
        int actual = zoo.calculateTotalValueOfAnimals();
        assertEquals(180000, actual);
    }

    @Test
    public void testSellAnimal() {
        zoo.sellAnimal(animal1);
        int actual = zoo.calculateTotalAnimals();
        double actualBankBalance = zoo.getBankBalance();
        assertEquals(2, actual);
        assertEquals(770000.50, actualBankBalance, 0.05);
    }

}