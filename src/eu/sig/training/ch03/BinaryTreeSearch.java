package eu.sig.training.ch03;

public class BinaryTreeSearch {
	
    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        checkNotNullNode(node);

    	int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            if (nodeValue < node.getValue()) {
                return goDown(node.getLeft(), nodeValue);
            } else {
                return goDown(node.getRight(), nodeValue);
            }
        }
    }
    // end::calculateDepth[]


    private static int goDown( BinaryTreeNode<Integer> node, int nodeValue ) {
        if (node == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(node, nodeValue);
        }
    }

    private static void checkNotNullNode(BinaryTreeNode<Integer> node ) {
        if(node == null){
            throw new IllegalArgumentException("A reference to argument 'node' was not specified");
        }
    }
}
