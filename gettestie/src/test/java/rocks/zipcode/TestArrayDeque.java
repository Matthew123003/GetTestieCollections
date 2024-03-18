package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

    @Test
    public void testDequePush(){
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");

        Assert.assertEquals("Second", stack.getFirst());
    }

    @Test
    public void testDequePop(){
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");

        Assert.assertEquals("Second", stack.pop());
    }
}
