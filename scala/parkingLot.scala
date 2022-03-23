import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks.{break, breakable}

class  parkingLot {
  var capacityTwo = 10
  var capacityHatch = 6
  var capacitySUV = 5
  var capacitySedan = 4
  var slotTwo:ListBuffer[Int]= ListBuffer()
  var slotHatch:ListBuffer[Int]= ListBuffer()
  var slotSUV:ListBuffer[Int]= ListBuffer()
  var slotSedan:ListBuffer[Int]= ListBuffer()
  var detailTwo = scala.collection.mutable.Map[Int,String]()
  var detailHatch = scala.collection.mutable.Map[Int,String]()
  var detailSUV = scala.collection.mutable.Map[Int,String]()
  var detailSedan = scala.collection.mutable.Map[Int,String]()
  var historyKey = 0
  var historyDetails = scala.collection.mutable.Map[Int,String]()
  def checkCapacity(capacity:Int): Boolean ={
    if(capacity > 0) return true
    else false
  }

  def availableSlot(): Unit ={
    println("Available slot for two wheelers is "+capacityTwo)
    println("Available slot for HatchBack is "+capacityHatch)
    println("Available slot for SUV is "+capacitySUV)
    println("Available slot for Sedan is "+capacitySedan)
  }

  def checkSlot(slot:ListBuffer[Int]): Int ={
    var counter = slot.length+1
    breakable{
      for(i <- 0 to slot.length){
        if(!slot.contains(i+1)) {
          counter = i + 1
          slot += counter
          break
        }
      }
    }
    println("Slot for this vehicle is "+counter)
    return counter
  }

  def rate(inTime:LocalDateTime,exitTime:LocalDateTime,advancePay:Int): Float ={
    var amountLeft:Float = -advancePay.toFloat
    var totalminutes = ChronoUnit.MINUTES.between(inTime,exitTime)
    var totalhours = totalminutes/60f
    var rate:Float = 0
    if(totalhours > 6) rate = ((totalhours-6)*40)+(3*30)+(3*20) // 0-3 is 20 , 3-6 is 30 , above 6 is 40
    else if(totalhours > 3) rate = (totalhours-3)*30+(3*30)
    else rate = totalhours*20
    return amountLeft+rate
  }

  def detail(detailVehicle:scala.collection.mutable.Map[Int,String],slot:Int): Unit ={
    if(detailVehicle.contains(slot))  println(detailVehicle(slot))
    else println("There is no vehicle for this particular slot")
  }
}

