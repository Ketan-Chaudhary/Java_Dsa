package leetcode;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][]arr={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
        static public int[][] flipAndInvertImage(int[][] image) {
            for(int[] rows:image){
                for (int i = 0; i < (image[0].length + 1) / 2; i++){
                    int temp = rows[i] ^ 1;// compliment of the digit
                    rows[i] = rows[image[0].length - i - 1] ^ 1;
                    rows[image[0].length - i - 1] = temp;
                }
            }
            return image;
        }
    }
