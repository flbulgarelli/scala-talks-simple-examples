package firststeps
import sys._
object FirstSteps extends App {
  //Que es Scala?

  //Una caluladora?
  assert(4 + 5 == 9)

  //Una impresora
  println("hmm.... parece que si...")

  //Un entorno imperativo?
  var finish = false
  while (!finish) {
    println("Estás seguro? [S/N]")
    var line = readLine()
    if (line == "S")
      finish = true;
  }
  
  //un entorno procedural?
  var contador = 0
  
  def incrementarContador() {
    contador += 1
  }
  
  for(x <- 1 to 10) {
    incrementarContador()
  }
  
  
  assert(contador == 10)
  
  //Un entorno funcional?
  val pi = 3.14
  
  //pi = 3.1415 no funciona!
  def siguiente(x:Int) = x + 1
  def cabeza[A](lista:List[A]) = lista match {
    case x::xs => x
    case Nil => error("Lista vacia!")
  }
  
  assert(cabeza(List(1,2,3)) == 1)
  
  //Un entorno orientado a objetos prototipado?
  val pato = new AnyRef {
    val moverse = { () => println("Caminando como pato") }
    val hacerCuack = { () => println("Haciendo cuack como pato") }
  }  
  
  //Es un pato!!
  pato.hacerCuack()
  pato.moverse()
  
  
  //Un entorno orientado a objetos con clases?
  
  
  
  
  
  
  

}