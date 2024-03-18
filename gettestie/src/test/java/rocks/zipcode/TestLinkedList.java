package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    @Test
    public void testLinkedListClear(){
        List<String> list = new LinkedList<>();
        list.add("bird");
        list.add("plane");
        list.add("dog");
        list.clear();

        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testLinkedListGet(){
        List<String> list = new LinkedList<>();
        list.add("bird");
        list.add("plane");
        list.add("dog");

        Assert.assertEquals("dog", list.get(2));
    }
}
