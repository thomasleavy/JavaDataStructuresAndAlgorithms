public class SortingApp {

  public static String toString(int collection[]) {
    String temp = "[";
    for (int i = 0; i < collection.length; i++) {
      temp += collection[i];
      if (i < (collection.length - 1)) {
        temp += ", ";
      }
    }
    temp += "]";
    return temp;
  }

  public static void bubbleSort() {
    int collection[];
    int iterations;
    BubbleSort bubble = new BubbleSort();

    collection = new int[] { 2, 1, 7, 8, 4 };
    iterations = bubble.basicAscending(collection);
    collection = new int[] { 2, 1, 7, 8, 4 };
    iterations = bubble.basicDescending(collection);
    collection = new int[] { 2, 1, 7, 8, 4 };
    iterations = bubble.endAfterNoSwapsAscending(collection);
    collection = new int[] { 2, 1, 7, 8, 4 };
    iterations = bubble.optimisedAscending(collection);

  }

  public static void insertionSort() {
    int collection[];
    int iterations;
    InsertionSort insert = new InsertionSort();

    collection = new int[] { 2, 1, 7, 8, 4 };
    iterations = insert.ascending(collection);
    collection = new int[] { 2, 1, 7, 8, 4 };
    iterations = insert.descending(collection);

  }

  public static void main(String[] args) {
    bubbleSort();
    insertionSort();
  }
}
