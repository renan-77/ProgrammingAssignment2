package com.orenan.assignments;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        int[] numbers = {41, 21, 325, 12, 24};
        Arrays.sort(numbers);
        System.out.println("The smallest value is: " + numbers[0] + " and the largest one is " + numbers[4] + ".");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("There are " + even + " EVEN numbers and " + odd + " ODD numbers.");
    }
}