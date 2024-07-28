package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;


public class CreateStreamBuilderTest {
  // belajar Stream Builder
  @Test
  void testCreateStreamBuilder() {

    Stream.Builder<String> builder = Stream.builder();
    builder.accept("Aidil");
    builder.add("Adam").add("Baik Hati");

    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);

  }
  // belajar Stream Builder Simple
  @Test
  void testCreateStreamBuilderSimplify() {
    Stream<Object> stream = Stream.builder()
        .add("Aidil").add("Adam").add("Baik Hati").build();

    stream.forEach(System.out::println);
  }
}
