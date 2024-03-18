package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    @Test
    public void testVectorElementAt(){
        Vector<String> vector = new Vector<>();
        vector.add("bird");
        vector.add("dog");
        vector.add("cat");

        Assert.assertEquals("dog", vector.elementAt(1));
    }

    @Test
    public void testVectorLastIndexOf(){
        Vector<String> vector = new Vector<>();
        vector.add("bird");
        vector.add("dog");
        vector.add("cat");

        Assert.assertEquals(1, vector.lastIndexOf("dog"));
    }
}
