package valueobjects
import org.junit.Test

class DocumentTest {

  @Test
  def testDocument {
    val document = new Document("Lucene in Action", "McCandless", "Preface. I started with Lucene....")
    
    //Notar que == es equivalencia y no identidad
    assert(document.title == "Lucene in Action")
    //No funciona:
    //document.title = "foo"
    assert(!document.isLarge())
  }

}