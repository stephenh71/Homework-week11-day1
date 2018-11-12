import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before () {
        printer = new Printer (50, 500, 100);
    }

    @Test
    public void refill(){
        assertEquals(500, printer.refill());
    }

    @Test
    public void print(){
        assertEquals("Print successful. 10 sheets of paper left and 60 toner left", printer.print(20,2));
    }

    @Test
    public void print2(){
        assertEquals("Print unsuccessful, check paper (only 50 sheets left) and toner (only 100 left)", printer.print(100,4));
    }

    @Test
    public void print3(){
        assertEquals("Print unsuccessful, check paper (only 50 sheets left) and toner (only 100 left)", printer.print(30,3));
    }
}
