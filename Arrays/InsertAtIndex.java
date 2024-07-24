class Solution {
    // Function to insert an element at a specific index in the array
    void insertAtIndex(int[] arr, int sizeOfArray, int index, int element) {
        // Shift elements to the right from the index to the end
        for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the element at the specified index
        arr[index] = element;
    }
}
