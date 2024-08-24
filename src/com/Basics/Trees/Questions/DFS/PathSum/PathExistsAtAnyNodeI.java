package com.Basics.Trees.Questions.DFS.PathSum;

import com.Basics.Trees.Questions.DFS.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathExistsAtAnyNodeI {
    // sum path from any node
    int countPaths(TreeNode node , int sum){
        List<Integer> path = new ArrayList<>();
        return helper(node , sum, path);
    }

    int helper(TreeNode node , int sum , List<Integer> path){
        if (node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;

        // Number of path we can have
        ListIterator<Integer> iter = path.listIterator(path.size());
        while(iter.hasPrevious()){
            s += iter.previous();

            if (s == sum) {
                count++;
            }
        }
        // doubt
        count += helper(node.left,sum,path) + helper(node.right,sum,path);

        // backtrack
        path.remove(path.size()-1);
//        path.removeLast();
        return count;
    }
}
