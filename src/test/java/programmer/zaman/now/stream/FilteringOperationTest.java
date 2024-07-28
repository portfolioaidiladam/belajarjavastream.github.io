package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;
// belajar filtering operation
import java.util.List;

public class FilteringOperationTest {

  @Test
  void testFilter() {
    List.of("Aidil", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .filter(name -> name.length() > 4)
        .forEach(System.out::println);
    // memunculkan yang genap saja
    List.of(1,2,3,4,5,6,7,8,9,10).stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);
  }

  @Test
  void testDistinct() {
    List.of("Aidil", "Adam", "Aidil" , "Adam", "Baik Hati", "Joko", "Baik Hati").stream()
        .distinct()
        .forEach(System.out::println);
  }
}
