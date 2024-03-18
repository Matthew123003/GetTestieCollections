package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testTreeMapGet(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0, "bird");
        map.put(1, "dog");

        Assert.assertEquals("bird", map.get(0) );
    }

    @Test
    public void testTreeMapContainsKey(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "bird");
        map.put(1, "dog");
        map.put(2, "cat");

        Assert.assertTrue(map.containsKey(1));
    }

    @Test
    public void testTreeMapContainsValue(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "bird");
        map.put(1, "dog");
        map.put(2, "cat");

        Assert.assertTrue(map.containsValue("dog"));
    }
    @Test
    public void testTreeMapSize(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "bird");
        map.put(1, "dog");
        map.put(2, "cat");

        Assert.assertEquals(3, map.size());
    }
}
