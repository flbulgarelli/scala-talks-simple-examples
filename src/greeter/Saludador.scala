package greeter;

class Saludador {

  def saludar() = saludarA("Mundo")

  def saludarA(quien: String) = print("Hola " + quien + "!")
}