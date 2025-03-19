package io.yadnyesh.neetcodefreecodecamp;

import java.util.HashSet;

public class CountDuplicate {

    public boolean containsDuplicate(Integer[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

}
