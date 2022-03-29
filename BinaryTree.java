public class BinaryTree {
    // akar
    Node root;
    BinaryTree() { root = null; }

    //postorder
    public void printPostorder(Node node)
    {
        if (node == null)
            return;

        // daun kiri
        printPostorder(node.left);

        // daun kanan
        printPostorder(node.right);

        
        System.out.print(node.key + " ");
    }

    //inorder
    public void printInorder(Node node)
    {
        if (node == null)
            return;

        //daun kiri
        printInorder(node.left);

        //cetak node
        System.out.print(node.key + " ");

        //daun kanan
        printInorder(node.right);
    }

    //preorder
    public void printPreorder(Node node)
    {
        if (node == null)
            return;

        //cetak data awal
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    
    public void printPostorder() { printPostorder(root); }
    public void printInorder() { printInorder(root); }
    public void printPreorder() { printPreorder(root); }
}