package io.dave.arrays;

import java.util.HashSet;

public class ArrayElementAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5};
        findOneOccurrenceElementUsingMap(arr);
    }
    public static void findOneOccurenceElement(int[] element){ // time complexity = 0(n)
        int specialElement = element[0];
        // Loop through the array using XOR operation
        for (int i = 1; i < element.length; i++) {
            specialElement^=element[i];
        }
        System.out.println("Element that appears once is "+specialElement);
    }
    public static void findOneOccurrenceElementUsingMap(int[] arr){ //time complexity = O(n^2)

        HashSet<Integer> element = new HashSet<>();
        for (int num: arr){
            if(element.contains(num)){
                element.remove(num);
            }else {
                element.add(num);
            }
        }
        System.out.println("Element that appears once is "+element.iterator().next());
    }
}
