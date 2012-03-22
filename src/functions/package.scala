import java.util.Date

package object functions {
  
  val next = (x:Int) => x + 1
  val takeSubstring = (string:String, maxPosition:Int) => string.substring(0,maxPosition)
  
  val next2 = (_:Int) + 1
  val takeSubstring2 = (_:String).substring(0, (_:Int))

  val beforeNow =  (aDate:Date) => aDate.before(new Date)
  
}