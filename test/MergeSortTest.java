import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import com.sun.scenario.effect.Merge;
import org.junit.jupiter.api.Test;

import static java.util.Collections.sort;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void test() {

        Node node4 = new Node(1, null);
        Node node3 = new Node(5, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(0, node2);

        System.out.println(MergeSort.sort(node1));
    }

    /*
    @Test
    public void emptylist()
    {

    }
     */
}
