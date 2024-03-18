package rocks.zipcode;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void testComparable1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");
        list.add("cat");
        String x = list.get(0);
        String y = list.get(3);

        Assert.assertEquals(0, x.compareTo(y));

    }

    @Test
    public void testComparable2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");
        list.add("cat");
        String x = list.get(0);
        String y = list.get(2);

        Assert.assertEquals(1, x.compareTo(y));
    }
}
