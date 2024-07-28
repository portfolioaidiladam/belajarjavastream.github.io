package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

// belajar check Operation balikannya boolean
public class CheckOperationTest {
  // apakah ada salah satu data yang match dengan kondisi
  @Test
  void testAnyMatch() {
    boolean match = List.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10).stream()
        .anyMatch(number -> number > 20);

    System.out.println(match);
  }
  // apakah semua data match dengan kondisi
  @Test
  void testAllMatch() {
    boolean match = List.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10).stream()
        .allMatch(number -> number > 0);

    System.out.println(match);
  }
  // apakah semua data tidak match dengan kondisi
  @Test
  void testNoneMatch() {
    boolean match = List.of(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10).stream()
        .noneMatch(number -> number > 100);

    System.out.println(match);
  }
}
