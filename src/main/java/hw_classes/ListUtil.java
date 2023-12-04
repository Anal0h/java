package hw_classes;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtil {

  public static List<Integer> rangeList(int from, int to) {
    return new AbstractList<>() {
      @Override
      public Integer get(int index) {
        if (index < 0 || from + index > to - 1) {
          throw new IndexOutOfBoundsException();
        }
        return from + index;
      }

      @Override
      public int size() {
        return to - from;
      }

      @Override
      public int indexOf(Object o) {
        for (int i = from; i <= to; ++i) {
          if (o.equals(i)) {
            return i;
          }
        }
        return -1;
      }

      @Override
      public int lastIndexOf(Object o) {
        for (int i = to; i >= from; --i) {
          if (o.equals(i)) {
            return i;
          }
        }
        return -1;
      }

      @Override
      public boolean contains(Object o) {
        for (int i = from; i <= to; ++i) {
          if (o.equals(i)) {
            return true;
          }
        }
        return false;
      }
    };
  }

  public static List<Integer> medianSort(List<Integer> list) {
    if (list.isEmpty()) {
      return list;
    }
    Collections.sort(list);
    int median;
    if (list.size() % 2 == 0) {
      median = (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
    } else {
      median = list.get(list.size() / 2);
    }
    Comparator<Integer> myComparator = new MedianComparator(median);
    list.sort(myComparator);
    return list;
  }

  private static class MedianComparator implements Comparator<Integer> {
    int med;

    public MedianComparator(int med) {
      this.med = med;
    }

    @Override
    public int compare(Integer first, Integer second) {
      return Integer.compare(Math.abs(med - first), Math.abs(med - second));
    }
  }
}
