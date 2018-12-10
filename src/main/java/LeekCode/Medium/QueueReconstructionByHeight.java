package LeekCode.Medium;

public class QueueReconstructionByHeight {
    class Node {
        int[] hk;
        Node next;
    }

    public int[][] reconstructQueue(int[][] people) {

        int size = 1;
        Node root = new Node();
        root.hk = people[0];
        Node prevNode = null;
        for (int i=1; i<people.length; i++) {
            Node node = root;
            Node node_i = new Node();
            node_i.hk = people[i];
            int hit = 0;
            boolean isInserted = false;

            while (!isInserted && hit < size && node != null) {
                int i_h = node_i.hk[0];
                int i_k = node_i.hk[1];
                int n_h = node.hk[0];
                int n_k = node.hk[1];

                if (i_k >= n_k) {
                    if (i_h <= n_h) {
                        hit++;
                        if (hit >= i_k) {
                            node.next = node_i;
                            isInserted = true;

                        }
                    }
                } else {
                    if (i_h >= n_h) {
                        // List: h:(5,0), (6,0) and you want to insert i:(7,0)
                        // move to the next node
                    } else {
                        if (node.next == null) {
                            // List: (7,0) and you want to insert (5,0)
                            node_i.next = node;
                            isInserted = true;
                            root = node_i;
                        } else {
                            prevNode.next = node_i;
                            isInserted = true;
                            // List: (5,0), (6,0) and you want to insert (7,0);
                            // node.next = node;
                            // isInserted = true;
                        }
                    }
                }
                prevNode = node;
                node = node.next;
                if (isInserted) {
                    size++;
                }
            }

            if (hit > 0 && !isInserted) {
                prevNode.next = node_i;
                size++;
            }

        }

        int[][] results = new int[people.length][2];
        Node ptr = root;
        int i = 0;
        while(ptr!=null) {
            results[i++] = ptr.hk;
            ptr = ptr.next;
        }

        return results;
    }

}
