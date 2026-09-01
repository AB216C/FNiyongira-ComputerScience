package aJavaBasics;
public class Arrays {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//
//        for(int number:numbers) {
//            System.out.println(number);
//        }


        //int[]-brackets to specify that this is an array
        //numbers : The name of the array
        //new : This is required to initialize an array
        // int[5]: This allocate space for 5 integers
        //The result for the above array is 5 zeros [0,0,0,0,0]

//
//        int[] nums = new int[5];
//
//        nums[0] = 4;
//        nums[3] = -100;
//
//        for(int num:nums) {
//            System.out.println(num);
//        }

        //HARD-CODED WAY TO RUN THIS INCLUDE:

        int[] nums = {34,56,23,56,23};

        System.out.println(nums[0]);
        System.out.println(nums[4]);

        //HOW TO ACESS LAST INDEX
        //This is the same as saying index 4

        int lastIndex = nums.length -1;
        System.out.println(lastIndex);

        //Accessing every single item in the array

        for(int i=0; i<nums.length; i ++) {
            System.out.println(nums[i] + "");
        }

    }

}
