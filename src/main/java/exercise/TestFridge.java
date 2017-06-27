package exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by paul on 27.06.17.
 */
public class TestFridge {
    @Test public void testFridgeCotainer(){
        FridgeGen<InternalOrgan> fridge = new FridgeGen<InternalOrgan>();
        Heart heart = new Heart();
        Kidney kidney = new Kidney();

        fridge.acceptItem(kidney);
        fridge.acceptItem(heart);
        assertEquals(fridge.returnItem(),kidney);
    }
}
