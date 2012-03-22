package traits

trait Commiteable[A] {
  def commit(newValue: A): Unit
}

trait Versionable {
  def currentVersion(): String
  def atVersion(version: String) =
    currentVersion == version
}

class RevisionedObject[A](initialValue: A) extends Versionable with Commiteable[A] {
  private var version = 0
  private var value = initialValue

  def currentVersion() = version.toString

  def commit(newValue: A) {
    value = newValue
    version += 1
  }
}