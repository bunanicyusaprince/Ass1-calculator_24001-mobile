
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Test {
    private Icalculator calculator =new Calculator();

    @org.junit.Test
    public void testSum(){
        int a = 5;
        int b = 6;
        int sum = calculator.addition(a,b);

        assertEquals(11,sum);

    }
    @org.junit.Test
    public void testsub(){
        int a = 8;
        int b = 6;
        int subtraction = calculator.substraction(a,b);
        assertEquals(2,subtraction);
    }
    @org.junit.Test
    public  void testmult(){
        int a = 4;
        int b = 2;
        int mutiplication = calculator.multiplication(a,b);
        assertEquals(8,mutiplication);
    }
    @org.junit.Test
    public void testdiv(){
        int a = 4;
        int b = 2;
        int division = calculator.division(a,b);
        assertEquals(2,division);
    }

}
