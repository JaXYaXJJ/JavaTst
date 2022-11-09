package ClassWork.aviHashMap;

public class HashMapClass {

    /* 0 <= key, value <= 1000 */

    final Node[] nodes = new Node[1000];

    private int getIndex(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    /*
     * [X] -> [Node] -> [Node] - [Node]
     * [] -> [Node] -> [Node] - [Node]
     */

    private Node findNode(Node bucket, int key) {
        Node node = bucket;
        Node prev = null;

        while (node != null && node.key != key) {
            prev = node;
            node = node.next;
        }
        return prev;
    }

    public void put(int key, int val) {

        int index = getIndex(key);

        if(nodes[index] == null)
            nodes[index] = new Node (-1, -1);

        Node prev = findNode(nodes[index], key);

        if (prev.next == null)
            prev.next = new Node(key, val);
        else
            prev.next.val = val;
    }

    public int get(int key) {

        int index = getIndex(key);

        if (nodes[index] == null)
            return  -1;

        Node prev = findNode(nodes[index], key);

        if (prev.next == null)
            return -1;
        else
            return prev.next.val;
    }

    public void remove(int key) {

        int index = getIndex(key);

        if (nodes[index] == null)
            return;

        Node prev = findNode(nodes[index], key);

        if (prev.next == null)
            return;

        prev.next = prev.next.next;
    }
}
