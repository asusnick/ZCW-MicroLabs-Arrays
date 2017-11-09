package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {
        String output = "*** Output ***";
        for (String a : inputArray) {
            output += "\n" + a;
        }
        return output;
    }

    public String lastElement(String[] inputArray) {
        int a = inputArray.length;
        String output = "*** Output ***\n";
        output += inputArray[a - 1];
        return output;
    }

    public String lastButOneElement(String[] inputArray) {
        int a = inputArray.length;
        String output = "*** Output ***\n";
        output += inputArray[a - 2];
        return output;
    }

    public String reverseTheElements(String[] inputArray) {
        int a = inputArray.length;
        String output = "*** Output ***";
        for (int i = a - 1; i >= 0; i--) {
            output += String.format("\n" + inputArray[i]);
        }
        return output;
    }

    public boolean isPalindrome(String[] inputArray){
        int a = inputArray.length;
        for (int i = 0; i < a/2; i++){
            if (inputArray[i] != inputArray[a-1-i])
                return false;
        }
        return true;
    }

    public String compress(int[] nums) {
        int a = nums.length;
        String output = "*** Output ***";
        for (int i = 0; i < a; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                output += String.format("\n" + ": " + nums[i]);
            }
        }
        return output;
    }

    public String methodPack(char[] letters){
        int a = letters.length;
        String output = "*** Output ***\n" + ": ";
        for (int i = 0; i < a; i++){
            if (i != 0 && letters[i] != letters[i - 1]){
                output += ", ";
            }
            output += letters[i];
        }
        return output;
    }
}
