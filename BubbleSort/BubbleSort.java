public class BubbleSort {

  public int basicAscending(int[] collection) {
    int collectionLen = collection.length;
    int comparisons = 0;

    for (int i = 0; i < collectionLen; i++) {
      for (int j = 0; j < (collectionLen - 1); j++) {
        comparisons++;
        if (collection[j] > collection[j + 1]) {
          int temp = collection[j];
          collection[j] = collection[j + 1];
          collection[j + 1] = temp;
        }
      }
    }
    return comparisons;
  }

  public int basicDescending(int[] collection) {
    int collectionLen = collection.length;
    int comparisons = 0;

    for (int i = 0; i < collectionLen; i++) {
      for (int j = 0; j < (collectionLen - 1); j++) {
        comparisons++;
        if (collection[j] < collection[j + 1]) {
          int temp = collection[j];
          collection[j] = collection[j + 1];
          collection[j + 1] = temp;
        }
      }
    }
    return comparisons;
  }

  public int endAfterNoSwapsAscending(int[] collection) {
    int collectionLen = collection.length;
    boolean isSwapped = true;
    int comparisons = 0;
    int i = 0;

    for (i = 0; (i < collectionLen) && (isSwapped); i++) {
      isSwapped = false;
      for (int j = 0; j < (collectionLen - 1); j++) {
        comparisons++;
        if (collection[j] > collection[j + 1]) {
          int temp = collection[j];
          collection[j] = collection[j + 1];
          collection[j + 1] = temp;
          isSwapped = true;
        }
      }
    }
    return comparisons;
  }

  public int optimisedAscending(int[] collection) {
    int collectionLen = collection.length;
    int comparisons = 0;

    for (int i = 0; i < collectionLen; i++) {
      for (int j = 0; j < (collectionLen - 1 - i); j++) {
        comparisons++;
        if (collection[j] > collection[j + 1]) {
          int temp = collection[j];
          collection[j] = collection[j + 1];
          collection[j + 1] = temp;
        }
      }
    }
    return comparisons;
  }

}
