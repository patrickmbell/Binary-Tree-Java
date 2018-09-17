public class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }

    int getKey()
    {
        return key;
    }

}
