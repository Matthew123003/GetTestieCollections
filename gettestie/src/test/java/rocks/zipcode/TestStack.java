package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Assert.assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testStackPeek(){
        Stack<String> stack = new Stack<>();
        stack.push("bird");
        stack.push("dog");

        Assert.assertEquals("dog", stack.peek());
    }

    @Test
    public void testStackPop(){
        Stack<String> stack = new Stack<>();
        stack.push("bird");
        stack.push("dog");

        Assert.assertEquals("dog", stack.pop());
    }
}
