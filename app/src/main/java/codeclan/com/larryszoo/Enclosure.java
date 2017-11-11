package codeclan.com.larryszoo;

import java.util.ArrayList;

/**
 * Created by janemackay on 10/11/2017.
 */

public class Enclosure<T extends Animal> {

    ArrayList<T> inhabitants;

    public Enclosure() {
        this.inhabitants = new ArrayList<T>();
    }

    public ArrayList<T> getInhabitants() {
        return this.inhabitants;
    }

    public void addToEnclosure(T animal) {
        this.inhabitants.add(animal);
    }


    public void remove(Animal animal) {
        this.inhabitants.remove(animal);
    }

    public int countInhabitants() {
        return this.inhabitants.size();
    }
}
