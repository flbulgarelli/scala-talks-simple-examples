package greeter
import org.junit.Test

class SaludadorTest {

  @Test
  def testSaludar {
    new Saludador().saludar()
    new Saludador().saludarA("Zauber")
  }
}