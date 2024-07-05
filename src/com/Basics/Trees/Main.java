package com.Basics.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//         BinaryTree tree = new BinaryTree();
//         tree.populate(scanner);
//         tree.prettyDisplay();

//        BST tree= new BST();
////        int[] nums= {3,5,25,234,52,1,3,6};
////        tree.populate(nums);
//        int [] sorted= {1,2,3,4,5,6,7};
//        tree.populateSorted(sorted);
//        tree.display();

        AVL tree = new AVL();
        int[] arr={1,2,3,4,5,6,7,8};
        tree.populate(arr);
        tree.display();
    }
}
