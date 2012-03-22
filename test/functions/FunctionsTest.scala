package functions
import org.junit.Test
import org.junit.Assert

class FunctionsTest {
  
  @Test
  def testFunctions {
    assert(next(2) == 3)
    assert(takeSubstring("zauberlabs", 6) == "zauber")
  }

}