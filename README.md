Merge Sort on Linked Lists Student Support Code

[Question 1] What is the time and space complexity of your merge() function?

The time complexity is O(m + n) because my while loop iterates through both lists until one of them is empty.
Although, in the worst case scenario where both Nodes are the same length the time complexity is technically O(m + n) Where: m = node 1 length & n = node 2 length

The space complexity would also be O(m + n) because it creates a new Node during every iteration through the Nodes.
Again, in the worst case scenario where both Nodes are the same length makes the complexity O(m + n).


[Question 2] What is the time and space complexity of your sort() function?

The time complexity is something along the lines of O(n * log(n)).
This is due to the nodeCopy function = O(n), the split function = O(n),
and the function recursively sorting the two halves and the merging them together (we get T(n) = 2 * T(n / 2) + O(n)
Making the time complexity O(n * log(n)).

The space complexity would be O(n) because the nodeCopy function would create a copy of the inputted list, making the space taken O(n),
and the split function would be O(1) because it only one constant space. I think the recursive use of the sort function
would have a maximum of O(log(n)). All that mixed with the recursive use of the merge function which is O(n), makes the sort function's space complexity O(n)


[Question 3] What is the time and space complexity of your merge_in_place() function?

I think the time complexity is O(m + n) where: m = node 1 length & n = node 2 length (similar to the merge function).
This is because the while loop iterates through each of the shortest Node's values one time.
So in the worst case scenario where both nodes are the same length, the time complexity would be O(m + n)

The space complexity would be O(1) because it doesn't create very much new data, other than a handful of pointers.


[Question 4] What is the time and space complexity of your sort_in_place() function?

The time complexity would be O(n * log(n)). Because the split function's time complexity is O(n), the merge_in_place function's time complexity is O(m + n).
This plus the function recursively sorting the two halves and the merging them together (we get T(n) = 2 * T(n / 2) + O(n)
Overall, the sort_in_place function's time complexity is around O(n * log(n))

The space complexity would be O(log(n)). Because the space complexity of merge_in_place is a constant O(1),
the split function has a constant time complexity of O(1), and the sort_in_place function recursively calls itself
a maximum of log(n) where n is the number of nodes in the inputted list.

Therefore, when you add all these components together, the sort_in_place() function's time complexity is O(log(n))