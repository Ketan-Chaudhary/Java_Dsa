package com.Basics.Trees.Questions.DFS.PathSum;

import com.Basics.Trees.Questions.DFS.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathExistsAtAnyNodeII {
    // sum path from any node
    List<List<Integer>> countPaths(TreeNode node , int sum){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        return paths;
    }

    void helper(TreeNode node , int sum , List<Integer> path, List<List<Integer>> paths){
        if (node == null) {
            return;
        }

        path.add(node.val);

        if(node.val == sum && node.left == null && node.right == null){
            paths.add(new ArrayList<>(path));
        } else{
            helper(node.left, sum - node.val, path,paths);
            helper(node.right, sum - node.val, path,paths);
        }

        // backtrack
        path.remove(path.size()-1);
//        path.removeLast();
    }
}
