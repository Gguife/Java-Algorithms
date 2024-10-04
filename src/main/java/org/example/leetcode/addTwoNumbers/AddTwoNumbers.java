package org.example.leetcode.addTwoNumbers;

import java.util.Arrays;

public class AddTwoNumbers {
    public static int[] addTwoNumbers(int[] l1, int[] l2){
        int maxLength = Math.max(l1.length, l2.length);
        int[] result = new int[maxLength + 1];
        int carry = 0;

        for(int i = 0; i < maxLength; i++){
            int sum = carry;

            if(i < l1.length){
                sum += l1[l1.length - 1 - i];
            }

            if(i < l2.length){
                sum += l2[l2.length - 1 - i];
            }

            result[result.length - 1 - i] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;

        if(result[0] == 0){
            return Arrays.copyOfRange(result, 1, result.length);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};

        int[] result = addTwoNumbers(l1, l2);

        System.out.println(Arrays.toString(result));
    }
}
