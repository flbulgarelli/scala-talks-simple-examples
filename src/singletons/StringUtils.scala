package singletons

object StringUtils {

  def isNullOrEmpty(value: String) = value == null || value == ""
}