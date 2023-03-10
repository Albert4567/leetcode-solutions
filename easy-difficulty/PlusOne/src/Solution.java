/*
 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
 integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer
 does not contain any leading 0's.

 Increment the large integer by one and return the resulting array of digits.
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] > 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] resultingArray = new int[digits.length + 1];
                    System.arraycopy(digits, 0, resultingArray, 1, digits.length);
                    resultingArray[0] = 1;
                    return resultingArray;
                }
            } else {
                break;
            }
        }

        return digits;
    }
}
