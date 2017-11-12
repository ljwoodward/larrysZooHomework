package codeclan.com.larryszoo;

import java.util.ArrayList;

/**
 * Created by janemackay on 11/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private double bankBalance;
    private double ticketPrice;
    private ArrayList<Visitor> visitors;

    public Zoo(double bankBalance, double ticketPrice) {
        this.enclosures = new ArrayList();
        this.bankBalance = bankBalance;
        this.ticketPrice = ticketPrice;
        this.visitors = new ArrayList();
    }

    public void addEnclosureToZoo(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void remove(Enclosure enclosure) {
        this.enclosures.remove(enclosure);
    }


    public int calculateTotalAnimals() {
        int total = 0;
        for(Enclosure enclosure : this.enclosures) {
            total += enclosure.countInhabitants();
        }
        return total;
    }

    public int calculateTotalValueOfAnimals() {
        int total = 0;
        for(Enclosure enclosure : this.enclosures) {
            total += enclosure.calculateValue();
        }
        return total;
    }

    public void sellAnimal(Animal animal) {
        for(Enclosure enclosure : this.enclosures) {
            if(enclosure.inhabitants.contains(animal)) {
                enclosure.remove(animal);
                this.bankBalance += animal.getCashValue();
            }
        }
    }

}

