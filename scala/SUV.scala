import java.time.LocalDateTime

class SUV(ownerName: String,vehiclenum:String,advancePay:Int,p:parkingLot){
  val inTime = LocalDateTime.now()
  val advance = advancePay
  var value:Int = 0
  var Detail = ""
  if(p.checkCapacity(p.capacitySUV)) {
    p.capacitySUV = p.capacitySUV-1
    Detail = "Owner name -> " + ownerName + "\n" + "Vehicle number -> " + vehiclenum + "\n" + "Advance payment -> " + advancePay + "\n" + "In time ->" + inTime.toString + "\n"
    val check = p.checkSlot(p.slotSUV)
    Detail += "Slot num -> "+check+"\n"
    p.detailSUV(check) = Detail
    value = check
  }
  else println("All slots are full")
}