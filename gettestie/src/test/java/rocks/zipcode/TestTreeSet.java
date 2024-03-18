package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testTreeSetFirst(){
        TreeSet<String> set = new TreeSet<>();
        set.add("bird");
        set.add("dog");
        set.add("cat");

        Assert.assertEquals("bird", set.first());
    }

    @Test
    public void testTreeSetLast() {
        TreeSet<String> set = new TreeSet<>();
        set.add("bird");
        set.add("dog");
        set.add("cat");

        Assert.assertEquals("dog", set.last());
    }
}
