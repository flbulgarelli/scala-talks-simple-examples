package caseclasses

abstract class IssueState {
  def happyState() = this match {
    case InProgress(100) => true
    case Resolved(_) => true
    case _ => false
  }
}
case class New() extends IssueState

case class InProgress(val progressRate: Double) extends IssueState

case class Resolved(val commitId: String) extends IssueState
