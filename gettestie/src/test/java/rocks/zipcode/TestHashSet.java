package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    @Test
    public void testHashSetSize(){
        Set<String> set = new HashSet<>();
        set.add("bird");
        set.add("plane");
        set.add("dog");

        Assert.assertEquals(3, set.size());

    }

    @Test
    public void testHashSetContains(){
        Set<String> set = new HashSet<>();
        set.add("bird");
        set.add("plane");
        set.add("dog");

        Assert.assertTrue(set.contains("dog"));
    }
}
