package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;
import fr.diginamic.factory.ObjetConnecte;
import fr.diginamic.factory.ObjetConnecteController;
import fr.diginamic.factory.ObjectConnecteFactory;

public class ObjetConnecteTest {

    private static final double DELTA = 0.0000001;

    @Test
    public void testCreerTelephone() {

        ObjetConnecte obj = ObjectConnecteFactory.getObjetConnecte(1);

        assertEquals(10, obj.getLimitVolt(), DELTA);
    }

    @Test
    public void testCreerTablette() {

        ObjetConnecte obj = ObjectConnecteFactory.getObjetConnecte(2);

        assertEquals(20, obj.getLimitVolt(), DELTA);
    }

    @Test
    public void testCreerEnceint() {

        ObjetConnecte obj = ObjectConnecteFactory.getObjetConnecte(3);

        assertEquals(5, obj.getLimitVolt(), DELTA);
    }

}
