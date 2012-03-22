package collections

class CollectionsTest {

  List(List(1, 2), List(4, 5, 6), List(7, 8))
    .flatten
    .forall(_ >= 0)

  Stream.from(1)
    .map(math.pow(_, 2))
    .filter(_ % 2 == 0)
    .take(8)
    .force

  Some(4).find(_ > 7)

  Map("play" -> "framework",
    "scala" -> "language",
    "zauber" -> "we")
    .mapValues(_.toUpperCase)

  Set("zauber", "play", "scala", "zauber")
    .count(_.startsWith("z"))
}