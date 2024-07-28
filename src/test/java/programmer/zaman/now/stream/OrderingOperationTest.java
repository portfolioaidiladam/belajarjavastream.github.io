package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
//  belajar ordering operation
public class OrderingOperationTest {
// pengurutan data dalam streamnya
  @Test
  void testSorted() {
    List.of("Aidil", "Adam", "Baik Hati", "Programmer", "Zaman", "Now").stream()
        .sorted()
        .forEach(System.out::println);
  }

  @Test
  void testSortedWithComparator() {
    Comparator<String> reverseComparator = Comparator.reverseOrder();

    List.of("Aidil", "Adam", "Baik Hati", "Programmer", "Zaman", "Now").stream()
        .sorted(reverseComparator)
        .forEach(System.out::println);
  }
}
