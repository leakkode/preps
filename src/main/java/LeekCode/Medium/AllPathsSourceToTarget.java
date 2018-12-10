package LeekCode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllPathsSourceToTarget {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> path = new ArrayList();

        path.add(0);
        dfsSearch(graph, 0, res, path);

        return res;
    }

    private static void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length - 1) {
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }


    public static void traverse(int[][] graph, int node, Stack<Integer> list, List<List<Integer>> listOfLists) {

        // base condition:
        if (graph[node].length <= 0) {
            list.add(node);
            listOfLists.add((List<Integer>)list.clone());
            list.pop();
            return;
        }

        // action:
        // this means for each edge of Node node.
        for (int i=0; i<graph[node].length; i++) {
            list.push(node);
            int nextNode = graph[node][i];
            traverse(graph, nextNode, list, listOfLists);
            list.pop();
        }
    }


    public static void work(List<int[]> list) {
        int[][] input = new int[list.size()][];
        for (int i=0; i<list.size(); i++) {
            input[i] = list.get(i);
        }


//        List<List<Integer>> lists = new ArrayList();
//        traverse(input, 0, new Stack(), lists);

        List<List<Integer>> lists = allPathsSourceTarget(input);

        System.out.print("[");
        for (int i=0; i<lists.size(); i++) {
            System.out.print("[");
            for (int j=0; j<lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j));
                if (j+1!=lists.get(i).size()) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i+1!=lists.size()) {
                System.out.print(",");
            }
        }
        System.out.println("] ");
    }
}
