package codeclan.com.larryszoo;

/**
 * Created by janemackay on 10/11/2017.
 */

public abstract class Animal {

    public String name;

     public int cashValue;

    public Animal(String name, int cashValue) {
        this.name = name;
        this.cashValue = cashValue;
    }

    public int getCashValue() {
        return cashValue;
    }



}
