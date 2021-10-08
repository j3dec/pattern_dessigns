package fr.diginamic.builder;

import fr.diginamic.tp_grasps.Params;
import fr.diginamic.tp_grasps.ReservationController;
import fr.diginamic.tp_grasps.beans.Reservation;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class ZooTest {

    @Test
    public void CreerUneZone() {
        ZooBuilder zooBuilder = new ZooBuilder("zoo");
        zooBuilder.appendZone("zone1", 10);
        assertEquals("zoo", zooBuilder.getZoo().nom);
        assertEquals("zone1", zooBuilder.getZone().nom);
    assertEquals("Chat", zooBuilder.getAnimal().nom);
    }

    @Test
    public void CreerUnLion(){
        ZooBuilder zooBuilder = new ZooBuilder("zoo");
        zooBuilder.appendZone("zone1", 10);
        zooBuilder.appendAnimal("Zone1", "Le Chat");
        assertEquals("Le Chat", zooBuilder.getAnimal().nom);
    }

}