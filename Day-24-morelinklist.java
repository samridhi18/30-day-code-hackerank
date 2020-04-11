public class Day24MoreLinkedLists {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public static Node removeDuplicates(Node head) {
		if (head == null)
			return head;
		Set<Integer> s = new HashSet<Integer>();
		Node node = head;
		s.add(node.data);
		Node newNode = new Node(node.data);
		node = node.next;
		Node newHead = newNode;
		while (node != null) {
			if (!s.contains(node.data)) {
				s.add(node.data);
				newNode.next = new Node(node.data);
				newNode = newNode.next;
			}
			node = node.next;
		}
		return newHead;

	}
