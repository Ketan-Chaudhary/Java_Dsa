package com.Basics.Trees.QuesHashMap;

import java.util.*;
import com.Basics.Trees.Questions.DFS.TreeNode;


public class VerticalOrderBinaryTree {

        public List<List<Integer>> verticalTraversal(TreeNode root) {
            // List to store the final answer
            List<List<Integer>> ans = new ArrayList<>();

            // Base case: if the tree is empty
            if (root == null) {
                return ans;
            }

            // TreeMap to hold column -> List of (row, value)
            Map<Integer, List<int[]>> map = new TreeMap<>();

            // Queue to perform BFS
            // The queue will store elements as (TreeNode, row, col)
            Queue<Object[]> queue = new ArrayDeque<>();
            queue.offer(new Object[]{root, 0, 0}); // TreeNode, row, col

            while (!queue.isEmpty()) {
                int size = queue.size();
                Map<Integer, List<int[]>> levelMap = new HashMap<>();

                for (int i = 0; i < size; i++) {
                    Object[] removed = queue.poll();
                    TreeNode node = (TreeNode) removed[0];
                    int row = (int) removed[1];
                    int col = (int) removed[2];

                    // Store the node in the levelMap
                    levelMap.putIfAbsent(col, new ArrayList<>());
                    levelMap.get(col).add(new int[]{row, node.val});

                    // Add children to the queue
                    if (node.left != null) {
                        queue.offer(new Object[]{node.left, row + 1, col - 1});
                    }
                    if (node.right != null) {
                        queue.offer(new Object[]{node.right, row + 1, col + 1});
                    }
                }

                // Process levelMap to add results to the main map
                for (Map.Entry<Integer, List<int[]>> entry : levelMap.entrySet()) {
                    int col = entry.getKey();
                    List<int[]> nodes = entry.getValue();

                    // Sort nodes by row first, then by value
                    nodes.sort((a, b) -> {
                        if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
                        return Integer.compare(a[1], b[1]);
                    });

                    // Add sorted values to the main map
                    map.putIfAbsent(col, new ArrayList<>());
                    for (int[] nodeInfo : nodes) {
                        map.get(col).add(new int[]{nodeInfo[1]}); // Corrected to just node value
                    }
                }
            }

            // Collect results from the map
            for (List<int[]> colList : map.values()) {
                List<Integer> columnValues = new ArrayList<>();
                for (int[] node : colList) {
                    columnValues.add(node[0]); // Corrected to access node[0] which stores the node value
                }
                ans.add(columnValues); // Add the list of sorted values to the result
            }

            return ans;
        }
    }