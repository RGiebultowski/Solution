package com.company;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution exec = new Solution();
        exec.solution(19543);
        exec.solution(-50523);
        exec.solution(-5000);

    }
}

class Solution{
    public int solution(int number){

        String numberToDelete = "5";
        String stringValue = "";
        int zero = 0;
        int value;
        boolean flag = false;

        String stringNumber = String.valueOf(number);

        if (stringNumber.length() <= 0){
            return zero;
        }
        String[] arr = stringNumber.split("");

        for(int i = 0; i < arr.length; i++){
            if (arr[i].equals("-")){
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = "";
            }
            if (arr[i].equals(numberToDelete)){
                arr[i] = "";
                flag = true;
            }
        }

        for (int y = 0; y < arr.length; y++){
            stringValue += arr[y];
        }

        value = Integer.parseInt(stringValue);
        if (flag){
            System.out.println(value);
            return value;
        }
        System.out.println(zero);
        return zero;
    }
}
