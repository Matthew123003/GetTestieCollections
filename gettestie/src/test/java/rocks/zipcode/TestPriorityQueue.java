package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    @Test
    public void testPriorityQueuePeek() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("bird");
        queue.add("dog");

        Assert.assertEquals("bird", queue.peek());
    }

    @Test
    public void testPriorityQueuePoll(){
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("bird");
        queue.add("dog");

        Assert.assertEquals("bird", queue.poll());
    }

    @Test
    public void testPriorityQueueSize(){
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("bird");
        queue.add("dog");
        queue.poll();

        Assert.assertEquals(1, queue.size());
    }

}
