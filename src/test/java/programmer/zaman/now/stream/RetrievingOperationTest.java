package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
// belajar retrieving operation
public class RetrievingOperationTest {
  // akan mengambil dua data pertama
  @Test
  void testLimit() {
    List.of("Aidil", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .limit(2)
        .forEach(System.out::println);
  }
  // mengambil data setelah menskip sebanyak n data
  @Test
  void testSkip() {
    List.of("Aidil", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .skip(2)
        .forEach(System.out::println);
  }
  // kalau kondisinya false bakalan di stop pengambilan datanya sampai kebelakang
  @Test
  void testTakeWhile() {
    List.of("Eko", "Edo", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .takeWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }
  // kalau kondisinya false bakalan diambil terus sampai kebelakang
  @Test
  void testDropWhile() {
    List.of("Eko", "Edo", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .dropWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  // mengambil random satu element
  @Test
  void testFindAny() {
    Optional<String> optional = List.of("Eko", "Edo", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .findAny();

    optional.ifPresent(name -> {
      System.out.println(name);
    });
  }

  // mengambil element pertama
  @Test
  void testFindFirst() {
    Optional<String> optional = List.of("Eko", "Edo", "Adam", "Baik Hati", "Budi", "Joko").stream()
        .findFirst();

    optional.ifPresent(name -> {
      System.out.println(name);
    });
  }
}
