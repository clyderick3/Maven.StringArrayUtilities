package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
      // Asking for a string. Array.length - 1 returns the last element via String.
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        // i - array.length + 1   d u c k s   array.length = 5
        // array.length = 5     i = 3; == k.

        for (int i = 0; i < array.length ; i++) {
           // result -[3] -  i = array [3]
            result [i]  = array[array.length - 1 - i]; // when i = 0 the first letter will be
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        //declaring a new array to be used in comparison with a reverse array
        String [] newbie = new String[array.length];
        // initializing newbie
        newbie = StringArrayUtils.reverse(array);
        boolean a = true;
        for (int i = 0; i < array.length ; i++) {
            if (!array[i].equals(newbie[i])) {
                a = false;
            }
        }
         return a;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //Name helpful names for the booleans.
        Boolean pangramicUpperCase, pangramicLowerCase, pangramic = true;
        //Create an arrayString using an array of 26 characters.
        String arrayString = Arrays.toString(array);
        //declare a for loop the length of the alphabet
        for (int i = 0; i <= 26; i++) {
            pangramicUpperCase = arrayString.contains(Character.toString((char)('A' + i)));
            pangramicLowerCase = arrayString.contains(Character.toString((char)('a' + i)));
            if ((!pangramicUpperCase) && (!pangramicLowerCase)) {
                pangramic = false;
            }

        }
        return pangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //Check lecture and Think Java for String Array help.
        //get my counter ready
        int count = 0;
        for (String string : array) {
            if (string.equals(value)) {
                count++;
            }
        }
        return count;
    }



    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> aList = new ArrayList<>(Arrays.asList(array));
        aList.removeAll(List.of(valueToRemove));
        array = aList.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArr = new ArrayList<>();

        int n = array.length;
        if (n==0 || n==1){
            return array;

        }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = 0;
        int stringLength = array.length;
        return null;
    }


}
