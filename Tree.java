public class Tree<E extends Comparable<E>> {
    private NodeTree<E> root;
    public Tree() {
        root = null;
    }

    public void insertNode(E insertValue) {
        System.out.print(insertValue + " ");   
        if (root == null) {
            root = new NodeTree<E>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    private void preorderHelper(NodeTree<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); 
        preorderHelper(node.getLeftNode()); 
        preorderHelper(node.getRightNode());
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void inorderHelper(NodeTree<E> node) {
        if (node == null) {
            return;
        }

        inorderHelper(node.getLeftNode());
        System.out.printf("%s ", node.getData());
        inorderHelper(node.getRightNode());
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void postorderHelper(NodeTree<E> node) {
        if (node == null) {
            return;
        }

        postorderHelper(node.getLeftNode());
        postorderHelper(node.getRightNode());
        System.out.printf("%s ", node.getData());
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    private boolean searchBSTHelper(NodeTree<E> node, E key) {
        boolean result = false;

        if (node != null) {
            if (key.equals(node.getData())) {
                result = true;
            } else if (key.compareTo(node.getData()) < 0) {
                result = searchBSTHelper(node.getLeftNode(), key);
            } else {
                result = searchBSTHelper(node.getRightNode(), key);
            }
        }
        return result;
    }

    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);

        if (hasil) {
            System.out.println(key + " ada dalam tree");
        } else {
            System.out.println(key + " tidak ada dalam tree");
        }
    }


}
