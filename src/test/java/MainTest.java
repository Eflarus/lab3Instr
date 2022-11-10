import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Calculator calc = new Calculator();

    @Test
    void add(){
        assertEquals(2, calc.add(1,1));
    }
    @Test
    void sub(){
        assertEquals(0, calc.sub(1,1));
    }
    @Test
    void div(){
        assertEquals(2, calc.div(4,2));
    }
    @Test
    void mul(){
        assertEquals(4, calc.mul(2,2));
    }

}