public class Node<T> {

    Node left, right;
    int data;

    public Node()
    {
        left = null;
        right = null;
        data = 0;
    }

    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    public void setLeft(Node n)
    {
        left = n;
    }

    public void setRight(Node n)
    {
        right = n;
    }

    public Node getLeft()
    {
        return left;
    }

    public Node getRight()
    {
        return right;
    }

    public int getData()
    {
        return data;
    }
}

