import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3};
        Integer[] nums2 = {4, 5, 6};
        Integer[] mergedInts = GenericArrayUtility.MergeArray(nums1, nums2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedInts));

        // String example
        String[] words1 = {"Apple", "Banana"};
        String[] words2 = {"cherry", "Date"};
        String[] mergedStrings = GenericArrayUtility.MergeArray(words1, words2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStrings));

    }
}