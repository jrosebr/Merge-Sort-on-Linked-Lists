import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeSort {

    static Node merge(Node A, Node B) {

        LinkedList<Node> return_list = new LinkedList<>();


        return return_list.getFirst();
    }

    static Node sort(Node N) {

        ArrayList<Integer> data_list = new ArrayList<>();
        ArrayList<Node> node_list = new ArrayList<>();
        LinkedList<Node> final_list = new LinkedList<>();

        Node n = N;

        //Creates an ArrayList of the values of nodes
        while (n != null)
        {
            data_list.add(n.getData());
            node_list.add(n);
            n = n.getNext();
        }



        System.out.println(N);
        System.out.println(n);
        System.out.println(data_list);
        System.out.println(node_list);

        return null;
    }

    static Node merge_in_place(Node A, Node B) {
        // YOUR CODE GOES HERE
        return null;  // DELETE THIS LINE
    }

    static Node sort_in_place(Node N) {
        // YOUR CODE GOES HERE
        return null;  // DELETE THIS LINE
    }

}
