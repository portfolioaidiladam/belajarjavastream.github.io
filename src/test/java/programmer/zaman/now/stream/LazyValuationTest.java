package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {
// walaupun menambahkan sebanyak apapun operasinya sebenernya si streamnya tidak akan di eksekusi
  @Test
  void testIntermediateOperation() {

    List<String> names = List.of("Aidil", "Adam", "Baik Hati");

    Stream<String> upper = names.stream()
        .map(name -> {
          System.out.println("Change " + name + " to UPPERCASE");
          return name.toUpperCase();
        });

  }
  // untuk mentriger streamnya berjalan
  // stream akan melakukan satu persatu aliran data dalam memprosesnya
  @Test
  void testTerminalOperation() {

    List<String> names = List.of("Aidil", "Adam", "Baik Hati");

    names.stream()
        .map(name -> {
          System.out.println("Change " + name + " to UPPERCASE");
          return name.toUpperCase();
        })
        .map(upper -> {
          System.out.println("Change " + upper + " to Mr.");
          return "Mr." + upper;
        })
            // agar berjalan perlu ini
        .forEach(mr -> {
          System.out.println(mr);
        });

  }
}
