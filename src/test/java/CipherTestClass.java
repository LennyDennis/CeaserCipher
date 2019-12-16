import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTestClass {

    @Test
    public void instance_getInstance_returnTrue(){
        Cipher newCipher = new Cipher("L",3);
        assertEquals(true, newCipher instanceof Cipher);
    }

    @Test
    public void stringTest_getStringTest_returnText(){
        Cipher newCipher = new Cipher("text",2);
        assertEquals("text",newCipher.getText());
    }


}