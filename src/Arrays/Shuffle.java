package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Shuffle {

    private int[] array;
    private int[] original;

    public Shuffle(int[] nums) {
        array=nums;
        original=nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array=original;
        original=original.clone();
        return array;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> list= Arrays.stream(array).boxed().collect(Collectors.toList());

        Collections.shuffle(list);
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        return array;
    }
}
