package day1;

import java.util.HashSet;

public  class Duplicate{

    public static boolean Duplicate1(int[] nums)
    {

        HashSet<Integer> du = new HashSet<>();
        for (int x : nums) {
            if (du.contains(x)) {
                return true;
            }
            du.add(x);
        }
        return false;

                }


}
