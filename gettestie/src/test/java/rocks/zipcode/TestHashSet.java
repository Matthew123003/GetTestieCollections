package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    @Test
    public void testHashSetSize(){
        HashSet<String> set = new HashSet<>();
        set.add("bird");
        set.add("plane");
        set.add("dog");

        Assert.assertEquals(3, set.size());

    }

    @Test
    public void testHashSetContains(){
        HashSet<String> set = new HashSet<>();
        set.add("bird");
        set.add("plane");
        set.add("dog");

        Assert.assertTrue(set.contains("dog"));
    }

    @Test
    public void TestHashSetAddAll(){
        Collection<String> set = new HashSet<>();
        String[] added = {"Bird", "Dog", "Cat"};
        set.add("Cheetah");
        set.add("Lion");
        set.add("Wildabeast");
        Collection<String> list = Arrays.asList(added);
        set.addAll(list);

        Assert.assertEquals(6, set.size());
    }
}
