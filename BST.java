public class BST<T> {

    private Node<T> root;

    public BST() {
        root = null;
    }

    public void insert(int data)
    {
        root = insert(root, data);
    }

    private Node insert(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public int max() {
        return maxHelper(root).data;
    }

    private Node maxHelper(Node r) {
        if (r.right == null) {
            return r;
        } else {
            return maxHelper(r.right);
        }
    }

    public int min() {
        return minHelper(root).data;
    }

    private Node minHelper(Node r) {
        if (r.left == null) {
            return r;
        } else {
            return minHelper(r.left);
        }
    }

    public int sum() {
        return sumHelper(root);
    }

    private int sumHelper(Node r)
    {
        int mySum, leftSum, rightSum;

        if (r == null ) {
            mySum = 0;
            return mySum;
        } else {
            leftSum  = sumHelper(r.left);
            rightSum = sumHelper(r.right);
            mySum = r.data + leftSum + rightSum;
            return mySum;
        }
    }
}


