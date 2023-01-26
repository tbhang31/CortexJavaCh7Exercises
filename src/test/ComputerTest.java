package test;

import exercises.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {

//Xander- memories
    //Nostalgia

    @Test
    public void testsConstructorCorrectlyConstructsComputerObject() {
        Computer test = new Computer(32, "Intel", 256, "NVIDIA 40xx series");
        assertEquals(32, test.getRam());
        assertEquals("Intel", test.getProcessor());
        assertEquals(256, test.getHardDrive());
        assertEquals("NVIDIA 40xx series", test.getGpu());
    }

    @Test
    public void testEqualsMethod() {
        Computer compareThis = new Computer(32, "Intel", 256, "NVIDIA 40xx series");
        Computer compareThat = new Computer(32, "Intel", 256, "NVIDIA 40xx series");
        assertFalse(compareThis.equals(compareThat));
    }

    @Test
    public void canCastAsChildren() {
        Computer isLaptop= new Laptop(32, "Intel", 256, "NVIDIA 40xx series",6);
        Computer isSmartphone= new Smartphone(32, "Intel", 256, "NVIDIA 40xx series",4.5);

        assertTrue(((Laptop)isLaptop) instanceof Laptop);
        assertTrue(((Smartphone)isSmartphone) instanceof Smartphone);

        assertEquals("I am a laptop",((Laptop)isLaptop).iAmLaptop());
        assertEquals("RING RING, PICK UP THE PHONE", ((Smartphone)isSmartphone).phoneRinging());
    }
}
