import java.time.LocalDateTime

class twoWheeler(ownerName: String,vehiclenum:String,advancePay:Int,p:parkingLot){
  val inTime = LocalDateTime.now()
  val advance = advancePay
  var value:Int = 0
  var Detail = ""
  if(p.checkCapacity(p.capacityTwo)) {
    p.capacityTwo = p.capacityTwo-1
    Detail = "Owner name -> " + ownerName + "\n" + "Vehicle number -> " + vehiclenum + "\n" + "Advance payment -> " + advancePay + "\n" + "In time ->" + inTime.toString + "\n"
    var check = p.checkSlot(p.slotTwo)
    Detail += "Slot num -> "+check+"\n"
    p.detailTwo(check) = Detail
    value = check
  }
  else println("All slots are full")
}
