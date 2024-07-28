package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
// belajar membuat stream
public class CreateStreamTest {

  // membuat empty atau single stream
  @Test
  void testCreateEmptyOrSingleStream() {

    Stream<String> emptyStream = Stream.empty();
    // cara menjalankan stream
    emptyStream.forEach(data -> {
      System.out.println(data);
    });

    Stream<String> oneStream = Stream.of("Aidil");
    // cara menjalankan stream
    oneStream.forEach(data -> {
      System.out.println(data);
    });

    String data = "Aidil Adam";
    Stream<String> emptyOrNotStream = Stream.ofNullable(data);
    // cara menjalankan stream
    emptyOrNotStream.forEach(item -> {
      System.out.println(item);
    });

  }

  // membuat stream dari array
  @Test
  void testCreateStreamFromArray() {
    Stream<String> arrayStream = Stream.of("Aidil", "Adam", "Baik Hati");
    // cara menjalankan stream
    arrayStream.forEach(name -> System.out.println(name));

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
    // cara menjalankan stream
    integerStream.forEach(System.out::println);

    String[] array = new String[]{
        "Aidil", "Adam", "Baik"
    };
    Stream<String> streamFromArray = Arrays.stream(array);
    // cara menjalankan stream
    streamFromArray.forEach(System.out::println);
  }
  // membuat Stream dari collection
  @Test
  void testCreateStreamFromCollection() {
    Collection<String> collection = List.of("Aidil", "Adam", "Baik Hati");
    Stream<String> stringStream = collection.stream();
    // cara menjalankan stream
    stringStream.forEach(System.out::println);

    Stream<String> stringStream2 = collection.stream();
    // cara menjalankan stream
    stringStream2.forEach(System.out::println);
  }


  // membuat infinite Stream
  @Test
  void testCreateInfiniteStream() {
    Stream<String> stream = Stream.generate(() -> "Programmer Zaman NOw");
    // stream.forEach(System.out::println);

    Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
    // iterate.forEach(System.out::println);
  }
}
