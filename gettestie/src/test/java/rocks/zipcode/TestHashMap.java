package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    @Test
    public void testMapHasValue(){
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "balloon");

        Assert.assertEquals("apple", map.get("a"));
    }

    @Test
    public void testMapSize(){
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "balloon");

        Assert.assertEquals(2, map.size());
    }
}
