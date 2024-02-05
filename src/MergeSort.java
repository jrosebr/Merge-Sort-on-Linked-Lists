import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeSort {

    static Node merge(Node A, Node B) {

        if (A == null) return B;
        if (B == null) return A;

        Node result_Node;
        Node current_Node;

        if (A.data <= B.data)
        {
            result_Node = new Node (A.data, null);
            current_Node = result_Node;
            A = A.next;
        }

        else
        {
            result_Node = new Node(B.data, null);
            current_Node = result_Node;
            B = B.next;
        }

        while (A != null && B != null)
        {
            if (A.data <= B.data)
            {
                current_Node.next = new Node(A.data, null);
                A = A.next;
            }

            else
            {
                current_Node.next = new Node(B.data, null);
                B = B.next;
            }

            current_Node = current_Node.next;
        }

            if (A != null)
            {
                current_Node.next = A;
            }

            else
            {
                current_Node.next = B;
            }

            return result_Node;
    }

    static Node sort(Node N)
    {
        if (N == null || N.next == null)
        {
            return N;
        }

        Node placeholder = nodeCopy(N);

        Node[] halves = split(placeholder);
        Node left = sort(halves[0]);
        Node right = sort(halves[1]);

        return merge(left, right);
    }

    private static Node nodeCopy (Node N)
    {
        Node dummy = new Node(0, null);
        Node current = dummy;
        Node originalCurrent = N;

        while (originalCurrent != null)
        {
            current.next = new Node(originalCurrent.data, null);
            current = current.next;
            originalCurrent = originalCurrent.next;
        }

        return dummy.next;
    }


    static Node merge_in_place(Node A, Node B) {

        if (A == null) return B;
        if (B == null) return A;

        Node result_node;

        if (A.data <= B.data)
        {
            result_node = A;
            A = A.next;
        }

        else
        {
            result_node = B;
            B = B.next;
        }

        Node current_Node = result_node;

        while (A != null && B != null)
        {
            if (A.data <= B.data)
            {
                current_Node.next = A;
                A = A.next;
            }

            else
            {
                current_Node.next = B;
                B = B.next;
            }
            current_Node = current_Node.next;
        }

        if (A != null)
        {
            current_Node.next = A;
        }

        else
        {
            current_Node.next = B;
        }

        return result_node;
    }

    private static Node[] split(Node N) {
        Node slow = N;
        Node fast = N.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node left = N;
        Node right = slow.next;
        slow.next = null;

        return new Node[]{left, right};
    }

    static Node sort_in_place(Node N) {
        if (N == null || N.next == null)
        {
            return N;
        }

        Node[] halves = split(N);
        Node left = sort_in_place(halves[0]);
        Node right = sort_in_place(halves[1]);

        return merge_in_place(left, right);
    }

}
