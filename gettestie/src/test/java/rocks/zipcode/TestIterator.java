package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestIterator {

    @Test
    public void testIteratorHasNext(){
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> itr;
        list.add("bird");
        list.add("dog");
        list.add("cat");
        itr = list.iterator();

        Assert.assertTrue(itr.hasNext());
    }

    @Test
    public void testIteratorNext(){
        LinkedList<String> list = new LinkedList<>();
        Iterator<String> itr;
        list.add("bird");
        list.add("dog");
        list.add("cat");
        itr = list.iterator();

        Assert.assertEquals("bird", itr.next());
    }
}
