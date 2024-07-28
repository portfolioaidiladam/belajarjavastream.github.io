package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

// belajar for each operation

public class ForEachOperationTest {
// forEach, Melakukan iterasi satu per satu data di Stream. Ini adalah terminal operation
  @Test
  void testPeekBefore() {
    List.of("Aidil", "Adam", "Baik Hati").stream()
        .map(name -> {
          System.out.println("Before Change Name to Upper : " + name);
          String upper = name.toUpperCase();
          System.out.println("Change Name to Upper : " + upper);
          return upper;
        })
        .forEach(name -> System.out.println("Final Name : " + name));
  }
  // menggunakan peek, Melakukan iterasi satu per satu data di Stream, namun mengembalikan Stream lagi,
  // dan ini bukanlah terminal operation
  @Test
  void testPeekAfter() {
      List.of("Aidil", "Adam", "Baik Hati").stream()
        .peek(name -> System.out.println("Before Change Name to Upper : " + name))
        .map(name -> name.toUpperCase())
        .peek(upper -> System.out.println("Change Name to Upper : " + upper))
        .forEach(name -> System.out.println("Final Name : " + name));
  }
}
