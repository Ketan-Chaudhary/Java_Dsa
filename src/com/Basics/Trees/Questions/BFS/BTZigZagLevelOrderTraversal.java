package com.Basics.Trees.Questions.BFS;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BTZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Using Deque because it maintains head as well as tail
        // so we can add or remove from both front and back
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }

                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    // here when the order is reversed
                    // we will first insert the right element and then left one

                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}
