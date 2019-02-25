import scala.collection.mutable.ArrayBuffer


object Calificaciones {
  def main(args: Array[String]): Unit = {
		  val parcial1 = ArrayBuffer[Int](100,80,75,62,92,83)
		  val parcial2 = ArrayBuffer[Int](70,75,65,80,100,92)
		  val parcial3 = ArrayBuffer[Int](85,88,70,70,96,30)
		  val parcial4 = ArrayBuffer[Int](70,70,50,80,100,100)
		  
		  println("El promedio del parcial 1 es: "+promedioParcial(parcial1))
		  println("El promedio del parcial 2 es: "+promedioParcial(parcial2))
		  println("El promedio del parcial 3 es: "+promedioParcial(parcial3))
		  println("El promedio del parcial 4 es: "+promedioParcial(parcial4)+"\n")
		  
		  println("El promedio general es: "+promedioGeneral(parcial1,parcial2,parcial3,parcial4)+"\n")
		  
		  promedioMateria(parcial1,parcial2,parcial3,parcial4)
  }
  
  def promedioParcial(parcial: ArrayBuffer[Int]): Double={
    var suma = 0.0
    for(cal <- parcial){
      suma = suma + cal
    }
    suma = suma / 6
    suma
  }
  
  def promedioGeneral(parcial1:ArrayBuffer[Int], parcial2:ArrayBuffer[Int], parcial3:ArrayBuffer[Int], parcial4:ArrayBuffer[Int]): Double={
    var suma = 0.0
    suma = suma + promedioParcial(parcial1)
    suma = suma + promedioParcial(parcial2)
    suma = suma + promedioParcial(parcial3)
    suma = suma + promedioParcial(parcial4)
    
    suma / 4
  }
  
  def promedioMateria(parcial1:ArrayBuffer[Int], parcial2:ArrayBuffer[Int], parcial3:ArrayBuffer[Int], parcial4:ArrayBuffer[Int]): Unit={
    var suma = 0.0
    
    for(x <- 1 to 6){
      suma = suma + parcial1.remove(0)
      suma = suma + parcial2.remove(0)
      suma = suma + parcial3.remove(0)
      suma = suma + parcial4.remove(0)
      
      println("le Promedio de la materia "+x+" es: "+(suma/4))
      suma = 0.0
    }
  }
}