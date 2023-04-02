import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String test1 = "Hello World!".toLowerCase(Locale.ROOT);

    Map<Character,Integer> hMLettersTest = new HashMap<>();



    @Test
    void main() {
    }

    @Test
    void textToMap() {
        Map<Character,Integer> hMlettersResult = new HashMap<>();
        hMlettersResult.put('h',1);
        hMlettersResult.put('l',3);
        hMlettersResult.put('e',1);
        hMlettersResult.put('o',2);
        hMlettersResult.put('w',1);
        hMlettersResult.put('r',1);
        hMlettersResult.put('d',1);

        Main.textToMap(test1, hMLettersTest);


        Assertions.assertEquals(hMlettersResult,hMLettersTest);



    }

    @Test
    void highFreqElem() {
        Map<Character,Integer> highFreqMapTest= new HashMap<>();
        highFreqMapTest.put('r',4);
        highFreqMapTest.put('d',5);
        highFreqMapTest.put('s',7);

        char testInt = (char) Main.highFreqElem(highFreqMapTest);

        Assertions.assertEquals('s',testInt);
    }

    @Test
    void lowFreqElem() {

        Map<Character,Integer> lowFreqMapTest= new HashMap<>();
        lowFreqMapTest.put('r',4);
        lowFreqMapTest.put('d',5);
        lowFreqMapTest.put('s',7);

        char testInt = (char) Main.lowFreqElem(lowFreqMapTest);

        Assertions.assertEquals('r',testInt);
    }
}