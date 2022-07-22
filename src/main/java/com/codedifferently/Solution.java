package com.codedifferently;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * You will be given an integer called number and an array called possibleFamilyMembers
     * your jobs is to find the number's family members. A family member is any value that's with in
     * 1 of any other number in the family.
     * <p>
     * So for example if the number = 4, and the possibleFamilyMembers is [1,4,3,5]
     * The actualFamilyMembers would be [3,4,5]
     * 3 is 1 away from 4
     * 4 is equal to 4
     * 4 is 1 away from 5
     * while
     * 1 is not included because the closest releation to 1 is 3 and that's 2 away.
     *
     * @param number
     * @param possibleFamilyMembers
     * @return
     */
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers) {
        List<Integer> family = new ArrayList<>();
        //sort the array
        Arrays.sort(possibleFamilyMembers);
        //if array contains number add number to family
        if (Arrays.asList(possibleFamilyMembers).contains(number)) {
            family.add(number);
        } else {

        }
        return null;
    }
}
