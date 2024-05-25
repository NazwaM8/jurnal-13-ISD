public class NodeTree<E extends Comparable<E>> {
    private NodeTree<E> leftNode;
    private E data;
    private NodeTree<E> rightNode;

    public NodeTree(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    public E getData() {
        return data;
    }

    public NodeTree<E> getLeftNode() {
        return leftNode;
    }

    public NodeTree<E> getRightNode() {
        return rightNode;
    }

    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new NodeTree<E>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        }
        else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new NodeTree<E>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
        else {
            if (leftNode == null) {
                leftNode = new NodeTree<E>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        }
    }

    @Override
    public String toString() {
        return "NodeTree [leftNode=" + leftNode + ", data=" + data + ", rightNode=" + rightNode + "]";
    }

    
    
}
