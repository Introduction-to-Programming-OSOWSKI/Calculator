package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals(115, App.calculate("add", 15, 100), "ADDITION FAILED");
       assertEquals(40, App.calculate("subtract", 50, 10), "SUBTRACTION FAILED");
       assertEquals(36, App.calculate("multiply", 3, 12), "MULTIPLICATION FAILED");
       assertEquals(2.5f, App.calculate("divide", 10, 4), "DIVISION FAILED");
   }

}
