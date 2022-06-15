class Main {
  public static void main(String[] args) {
    //Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // Input data
    int[] unsorted = { 11, 25, 31, 7, 88, 33, 67, 5, 12, 55, 10, 15, 30, 8, 100 };

    // Create utilities object
    Utilities utils = new Utilities();

    // Print the unsorted array to compare it
    System.out.println("Unsorted:");
    for (int i = 0; i < unsorted.length; i++) {
      System.out.print(unsorted[i] + " ");
    }

    System.out.println();
    System.out.println();

    // Create a new swapped array and print it
    System.out.println("Swapped (first and ninth index):");
    int[] swapped = utils.SwapArrayIndexes(unsorted, 0, 9);

    for (int i = 0; i < swapped.length; i++) {
      System.out.print(swapped[i] + " ");
    }

    System.out.println();
    System.out.println();

    // Create a new sorted array and prnt it
    System.out.println("Sorted:");
    int[] sorted = utils.SortArray(unsorted);

    for (int i = 0; i < sorted.length; i++) {
      System.out.print(sorted[i] + " ");
    }

    System.out.println();
  }
}