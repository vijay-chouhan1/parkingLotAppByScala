import java.time.LocalDateTime

class Hatchback(ownerName: String,vehiclenum:String,advancePay:Int,p:parkingLot){
  val inTime = LocalDateTime.now()
  val advance = advancePay
  var value:Int = 0
  var Detail = ""
  if(p.checkCapacity(p.capacityHatch)) {
    p.capacityHatch = p.capacityHatch-1
    Detail = "Owner name -> " + ownerName + "\n" + "Vehicle number -> " + vehiclenum + "\n" + "Advance payment -> " + advancePay + "\n" + "In time ->" + inTime.toString + "\n"
    val check = p.checkSlot(p.slotHatch)
    Detail += "Slot num -> "+check+"\n"
    p.detailHatch(check) = Detail
    value = check
  }
  else println("All slots are full")
}