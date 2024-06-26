public class InsertionSort {

  public int ascending(int[] collection) {
    int comparisons = 0;

    for (int i = 1; i < collection.length; i++) {
      int key = collection[i];
      int j;
      for (j = (i - 1); (j >= 0) && (collection[j] > key); j--) {
        comparisons++;
        collection[j + 1] = collection[j];
      }
      collection[j + 1] = key;
    }
    System.out.println("This was completed with a total of " + comparisons + " iterations!");
    return comparisons;
  }

  public int descending(int[] collection) {
    int comparisons = 0;

    for (int i = 1; i < collection.length; i++) {
      int key = collection[i];
      int j;
      for (j = (i - 1); (j >= 0) && (collection[j] < key); j--) {
        comparisons++;
        collection[j + 1] = collection[j];
      }
      collection[j + 1] = key;
    }
    System.out.println("This was completed with a total of " + comparisons + " iterations!");
    return comparisons;
  }
}
