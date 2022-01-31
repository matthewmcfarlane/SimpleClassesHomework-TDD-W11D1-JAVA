import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(50, 4);
        assertEquals(300, printer.getPaper());
        assertEquals(300, printer.getToner());
    }


}
