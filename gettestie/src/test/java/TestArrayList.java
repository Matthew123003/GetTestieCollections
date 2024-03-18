import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestArrayList {

    @Test
    public void testListSize(){
        List<String> list = new ArrayList<>();
        list.add(0, "apple");
        list.add(1, "balloon");

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testGetElement(){
        List<String> list = new ArrayList<>();
        list.add(0, "apple");
        list.add(1, "balloon");

        Assert.assertEquals("apple", list.get(0));
    }

}
