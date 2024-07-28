package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
// belajar Transformation Operation

  // mengubah menjadi Stream of integer
  @Test
  void testMap() {
    List.of("Aidil", "Adam", "Baik Hati").stream()
        .map(name -> name.toUpperCase())
        .map(upper -> upper.length())
        .forEach(length -> System.out.println(length));
  }

  // mengubah dari sebuah data menjadi stream lain
  @Test
  void testFlatMap() {
    List.of("Aidil", "Adam", "Baik Hati").stream()
        .map(name -> name.toUpperCase())
        .flatMap(upper -> Stream.of(upper, upper.length()))
            // cara mendupilikat datanya
        .flatMap(value -> Stream.of(value, value, value))
        .forEach(length -> System.out.println(length));
  }
}
