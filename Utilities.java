public class Utilities {
  int tempNumber;

  public int[] SwapArrayIndexes(int[] arr, int firstIndex, int secondIndex) {
    tempNumber = arr[firstIndex];
    arr[firstIndex] = arr[secondIndex];
    arr[secondIndex] = tempNumber;
    // Return the swapped array
    return arr;
  }

  public int[] SortArray(int[] arr) {
    // For loop to loop through each array index
    for (int i = 0; i < arr.length; i++) {
      // Second for loop to loop through a second time to compare numbers
      for (int j = 0; j < arr.length; j++) {
        // Check if the index j is bigger than i and if it is swap them
        if (arr[i] < arr[j]) {
          // Use the Swap method to switch the numbers
          SwapArrayIndexes(arr, i, j);
        }
      }
    }
    // Return the sorted array
    return arr;
  }
}