package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

    @Test
    public void testDequePush(){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");

        Assert.assertEquals("Second", stack.getFirst());
    }

    @Test
    public void testDequePop(){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");

        Assert.assertEquals("Second", stack.pop());
    }
}
