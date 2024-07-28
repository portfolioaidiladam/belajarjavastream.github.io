package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// belajar collectors

public class CollectorsTest {

  Stream<String> getStream(){
    return Stream.of("Aidil", "Adam", "Baik Hati");
  }
  // mengcollect semua data yang ada dalam streamnya lalu dikonversikan menjadi list
  @Test
  void testCollection() {
    // ini muttable bisa dirubah listnya, kalau set tidak dijamin urut jadi bisa berubah ubah terus
    Set<String> set = getStream().collect(Collectors.toSet());
    System.out.println(set);
    // ini ummutable tidak bisa dirubah lagi listnya, kalau set tidak dijamin urut jadi bisa berubah ubah terus
    Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
    System.out.println(immutableSet);

    // ini muttable bisa dirubah listnya
    List<String> list = getStream().collect(Collectors.toList());
    System.out.println(list);
    // ini ummutable tidak bisa dirubah lagi listnya
    List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
    System.out.println(immutableList);
  }

  @Test
  void testMap() {
    Map<String, Integer> map = getStream().collect(Collectors.toMap(
        name -> name,
        name -> name.length()
    ));
    System.out.println(map);
  }
}
