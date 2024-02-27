import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import org.junit.jupiter.api.Test;


import static java.util.Collections.sort;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void sort_singlelist()
    {
        Node singleNode = new Node(0, null);

        Node sort_list = MergeSort.sort(singleNode);

        assertEquals("0", sort_list.toString());
        assertEquals("0", singleNode.toString());
    }

    @Test
    public void sort_in_place_singlelist()
    {
        Node singleNode = new Node(0, null);

        Node sort_list = MergeSort.sort_in_place(singleNode);

        assertEquals("0", sort_list.toString());
        assertEquals(sort_list.toString(), singleNode.toString());
        assertEquals("0", singleNode.toString());
    }

    @Test
    public void merge_singlelist()
    {
        Node singleNode1 = new Node(0, null);
        Node singleNode2 = new Node(1, null);

        Node sort_list = MergeSort.merge(singleNode1, singleNode2);

        assertEquals("0, 1", sort_list.toString());
        assertEquals("0", singleNode1.toString());
        assertEquals("1", singleNode2.toString());
    }

    @Test
    public void merge_in_place_singlelist()
    {
        Node singleNode1 = new Node(0, null);
        Node singleNode2 = new Node(1, null);

        Node sort_list = MergeSort.merge_in_place(singleNode1, singleNode2);

        assertEquals("0, 1", sort_list.toString());
        assertEquals(sort_list.toString(), singleNode1.toString());
        assertEquals("1", singleNode2.toString());
    }

    @Test
    public void empty_sort_test()
    {
        int[] A = {};
        Node a = Utils.array_to_list(A);

        Node ans = MergeSort.sort(a);
        assertTrue(Utils.is_sorted(ans));
    }

    @Test
    public void empty_merge_test()
    {
        int[] A = {};
        int[] B = {};
        Node a = Utils.array_to_list(A);
        Node b = Utils.array_to_list(B);

        Node ans = MergeSort.merge(a, b);
        assertTrue(Utils.is_sorted(ans));
    }

    @Test
    public void empty_sort_in_place_test()
    {
        int[] A = {};
        Node a = Utils.array_to_list(A);

        Node ans = MergeSort.sort_in_place(a);
        assertTrue(Utils.is_sorted(ans));
    }

    @Test
    public void empty_merge_in_place_test()
    {
        int[] A = {};
        int[] B = {};
        Node a = Utils.array_to_list(A);
        Node b = Utils.array_to_list(B);

        Node ans = MergeSort.merge_in_place(a, b);
        assertTrue(Utils.is_sorted(ans));
    }

    @Test
    public void normal_sort_test()
    {
        Node n1 = new Node(0, new Node(2, new Node(4, new Node(1, null))));

        Node sorted_Node = MergeSort.sort(n1);

        assertEquals("0, 2, 4, 1", n1.toString());
        assertEquals("0, 1, 2, 4", sorted_Node.toString());
    }

    @Test
    public void normal_sort_in_place_test()
    {
        Node n1 = new Node(0, new Node(2, new Node(4, new Node(1, null))));

        Node sorted_Node = MergeSort.sort_in_place(n1);

        assertEquals("0, 1, 2, 4", sorted_Node.toString());
        assertEquals(sorted_Node.toString(), n1.toString());
    }

    @Test
    public void normal_merge_test()
    {
        Node n1 = new Node(1, new Node(2, new Node(4, new Node(5, null))));
        Node n2 = new Node(0, new Node(5, new Node(6, new Node(7, null))));

        Node sorted_Node = MergeSort.merge(n1, n2);

        assertEquals("1, 2, 4, 5", n1.toString());
        assertEquals("0, 5, 6, 7", n2.toString());
        assertEquals("0, 1, 2, 4, 5, 5, 6, 7", sorted_Node.toString());
    }

    @Test
    public void normal_merge_in_place_test()
    {
        Node n1 = new Node(1, new Node(2, new Node(4, new Node(5, null))));
        Node n2 = new Node(0, new Node(5, new Node(6, new Node(7, null))));


        Node sorted_Node = MergeSort.merge_in_place(n1, n2);

        assertEquals("0, 1, 2, 4, 5, 5, 6, 7", sorted_Node.toString());
        assertEquals("1, 2, 4, 5, 5, 6, 7", n1.toString());
        assertEquals("0, 1, 2, 4, 5, 5, 6, 7", n2.toString());
    }

    @Test
    public void random_sort_test()
    {
        for (int j = 1; j < 10; ++j)
        {
            Random rand = new Random();

            Node starter_Node = new Node(10, null);
            Node starter_Copy = starter_Node;
            Node current_Node = starter_Node;

            for (int i = 0; i < 9; ++i) {
                int rand_int1 = rand.nextInt(100);

                Node random_Node = new Node(rand_int1, null);

                current_Node.next = random_Node;
                current_Node = current_Node.next;
            }

            Node original_Node = starter_Node;

            Node sorted_node = MergeSort.sort(starter_Node);

            assertTrue(Utils.is_sorted(sorted_node));
            assertEquals(starter_Copy, starter_Node);
        }
    }

    @Test
    public void random_sort_in_place_test()
    {
        for (int j = 1; j < 10; ++j)
        {
            Random rand = new Random();

            Node starter_Node = new Node(10, null);
            Node starter_Copy = starter_Node;

            Node current_Node = starter_Node;

            for (int i = 0; i < 9; ++i) {
                int rand_int1 = rand.nextInt(100);

                Node random_Node = new Node(rand_int1, null);

                current_Node.next = random_Node;
                current_Node = current_Node.next;
            }

            Node original_Node = starter_Node;

            Node sorted_node = MergeSort.sort_in_place(starter_Node);

            assertTrue(Utils.is_sorted(sorted_node));
            assertTrue(Utils.is_sorted(original_Node));
            assertEquals(starter_Node.toString(), starter_Copy.toString());
        }
    }

    @Test
    public void test()
    {
        sort_singlelist();
        sort_in_place_singlelist();
        merge_singlelist();
        merge_in_place_singlelist();
        normal_sort_test();
        normal_sort_in_place_test();
        normal_merge_test();
        normal_merge_in_place_test();
        random_sort_test();
        random_sort_in_place_test();
        empty_sort_test();
        empty_merge_test();
        empty_sort_in_place_test();
        empty_merge_in_place_test();
    }
}
