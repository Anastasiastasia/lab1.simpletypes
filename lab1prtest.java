import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class lab1prtest {                                    
    
    @Test                                                       
                                                               
    public void testcalculatePoisk () {                                       
        double inputX = 2.54;
    int inputK = 2;
    double expected = Math.sin(inputX);
    assertEquals(expected, lab1pr.calculatePoisk(inputX, inputK), 0.001);}
    @Test   
    public void testcalculatePoisk2 () {                         
    double inputX = -2;
    int inputK = 5;
    double expected = Math.sin(inputX);
    assertEquals(expected, lab1pr.calculatePoisk(inputX, inputK), 0.0001);
}
@Test
public void testCalculatePoisk() {
    double inputX = 0.5;
    int inputK = 5;
    double expected = Math.sin(inputX);
    assertEquals(expected, lab1pr.calculatePoisk(inputX, inputK), 0.0001);
}
}
