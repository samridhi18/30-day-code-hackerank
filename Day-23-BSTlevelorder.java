public class Day23BSTLevelOrderTraversal {
	static class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static void levelOrder(Node root) {
		if (root == null)
			System.out.println("nothing to display");
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node node = (Node) q.poll();
			System.out.print(node.data + " ");
			if (node.left != null)
				q.add(node.left);
			if (node.right != null)
				q.add(node.right);

		}
	}
