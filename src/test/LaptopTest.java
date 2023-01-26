package test;

import org.junit.Before;
import org.junit.Test;
import exercises.*;
import static org.junit.Assert.*;

public class LaptopTest {

    Laptop test= new Laptop(32, "Intel", 256, "NVIDIA 40xx series",8);;

    @Test
    public void testLaptopConstructorProperlySetsFields() {
        assertEquals(32, test.getRam());
        assertEquals("Intel", test.getProcessor());
        assertEquals(256, test.getHardDrive());
        assertEquals("NVIDIA 40xx series", test.getGpu());
        assertEquals(8,test.getBatteryLife());
    }

    @Test
    public void testTwoLaptopWithSameInformationAreNotTheSame() {
        Laptop compareThis = new Laptop(32, "Intel", 256, "NVIDIA 40xx series",8);
        Laptop compareThat = new Laptop(32, "Intel", 256, "NVIDIA 40xx series",8);

        assertFalse(compareThis.equals(compareThat));
    }

    @Test
    public void someTest() {
        assertTrue(((Computer)test) instanceof Computer);
    }

    @Test
    public void testIAmALaptop() {
        assertEquals("I am a laptop", test.iAmLaptop());
    }

}
