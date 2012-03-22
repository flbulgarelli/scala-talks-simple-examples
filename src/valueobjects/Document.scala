package valueobjects

class Document(
  val title: String,
  val authorName: String,
  val content: String) {

  def isLarge() = content.length > 1000
}