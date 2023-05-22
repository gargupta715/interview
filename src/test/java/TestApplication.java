import onlineTest.SpringProcessing;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplication {
    private static SpringProcessing springProcessing;
    private static String result;

    @BeforeAll
    public static void setData(){
    springProcessing = new SpringProcessing();
    result="";
    }

    @Test
    public void testAlphabet(){
      Assertions.assertEquals(springProcessing.setData("test"), "test");
    }

    @Test
    void testNumeric(){
        try{
            springProcessing.setData("test2");
        }catch (IllegalArgumentException ex){
            Assertions.assertEquals("input value conatins numeric value", ex.getMessage());
        }
    }
}
