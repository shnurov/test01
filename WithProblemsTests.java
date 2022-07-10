import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private final String CONST = "const";
    private final static String bd = "test";

    @Test
    public void equalsOneToOne(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        CONST = "const";
        assertEquals("const", CONST);
    }

    @Test
    public static void equalsOneToOne(){
        assertEquals(1, 1);
    }



    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd == new String("test")) {
            res = "test";
        }

        assertEquals("test", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = List.of("2", "fin", "bin");
        for (String element: sourceData){
            sourceData.remove(element);
        }
        assertFalse(sourceData.contains("1"));
    }


}