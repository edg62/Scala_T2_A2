import scala.collection.mutable.ArrayBuffer
import scala.util.Random


object Temperatura {
  def main(args: Array[String]): Unit = {
    val horaTemperatura = new Array[Int](48)
    val hora = ArrayBuffer[Int]()
    
    llenado(horaTemperatura)
    
    for (i <- 0 until horaTemperatura.length){
      if(i %2 == 0){
        print(horaTemperatura(i)+", ")
      }else {
        println(horaTemperatura(i))
      }
    }
    
    mostrarHora(horaTemperatura)
    promedio(horaTemperatura,hora)
    
    var cont = 0
    var suma = 0
    for(h <- hora){
      suma += h
      cont += 1
    }
    if(cont != 0){
      println("El promedio de las horas es: "+(suma / cont))
    }
  }
  
  def llenado(horaTemperatura:Array[Int]): Unit = {
    var r = Random
    var cont = 0
    
    for (i <- 0 until horaTemperatura.length){
      if(i %2 == 0){
        horaTemperatura(i) = cont
        cont = cont+1
      }else {
        horaTemperatura(i) = r.nextInt(50)
      }
    }
  }
  
  def mostrarHora(horaTemperatura:Array[Int]): Unit = {
    for (i <- 0 until horaTemperatura.length){
      if(i %2 == 0){
        if(horaTemperatura(i+1) == 25){
          println("se registro la temperatura de 25 a las: "+horaTemperatura(i)+" horas")
        }
      }
    }
  }
  
  def promedio(horaTemperatura:Array[Int], hora:ArrayBuffer[Int]):Unit = {
    var suma = 0
    var cont = 0
    for (i <- 0 until horaTemperatura.length){
      if(i %2 == 0){
        if(horaTemperatura(i+1) == 25){
          hora.insert(hora.length,horaTemperatura(i))
        }
      }
    }
  }
}