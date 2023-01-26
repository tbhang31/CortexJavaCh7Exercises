package test;

import exercises.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class SmartphoneTest {

    Smartphone test= new Smartphone(32, "Intel", 256, "NVIDIA 40xx series",8);;

    @Test
    public void testLaptopConstructorProperlySetsFields() {
        assertEquals(32, test.getRam());
        assertEquals("Intel", test.getProcessor());
        assertEquals(256, test.getHardDrive());
        assertEquals("NVIDIA 40xx series", test.getGpu());
        assertEquals(8,test.getSize(),0.001);
    }

    @Test
    public void testTwoLaptopWithSameInformationAreNotTheSame() {
        Smartphone compareThis = new Smartphone(32, "Intel", 256, "NVIDIA 40xx series",8);
        Smartphone compareThat = new Smartphone(32, "Intel", 256, "NVIDIA 40xx series",8);

        assertFalse(compareThis.equals(compareThat));
    }

    @Test
    public void someTest() {
        assertTrue(((Computer)test) instanceof Computer);
    }

    @Test
    public void testIAmALaptop() {
        assertEquals("RING RING, PICK UP THE PHONE", test.phoneRinging());
    }

}
