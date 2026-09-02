import java.util.*;

public class Q_257 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }

        String currentPath = path.isEmpty()
                ? String.valueOf(node.val)
                : path + "->" + node.val;

        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }

        dfs(node.left, currentPath, result);
        dfs(node.right, currentPath, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("[]");
            sc.close();
            return;
        }

        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if (value != -1) {
                nodes[i] = new TreeNode(value);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nodes[i] == null) {
                continue;
            }

            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;

            if (leftIndex < n) {
                nodes[i].left = nodes[leftIndex];
            }

            if (rightIndex < n) {
                nodes[i].right = nodes[rightIndex];
            }
        }

        Q_257 obj = new Q_257();

        List<String> answer = obj.binaryTreePaths(nodes[0]);

        System.out.println(answer);

        sc.close();
    }
}