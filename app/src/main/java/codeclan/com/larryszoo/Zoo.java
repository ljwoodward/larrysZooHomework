package codeclan.com.larryszoo;

import java.util.ArrayList;

/**
 * Created by janemackay on 11/11/2017.
 */

public class Zoo {

    ArrayList<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList();
    }

    public void addEnclosureToZoo(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }


    public void remove(Enclosure enclosure) {
        this.enclosures.remove(enclosure);
    }


}

