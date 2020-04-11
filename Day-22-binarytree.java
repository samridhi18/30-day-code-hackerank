public class Day22BinarySearchTrees {
	static class Node {
		Node left, right;
		int data;
		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static int getHeight(Node root) {
		return (root == null) ? -1 : Math.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
	}
