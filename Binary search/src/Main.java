class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        // write your code here
        return java.util.Arrays.binarySearch(nums, key);
    }
}