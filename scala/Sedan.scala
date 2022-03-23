import java.time.LocalDateTime

class Sedan(ownerName: String,vehiclenum:String,advancePay:Int,p:parkingLot){
    val inTime = LocalDateTime.now()
    val advance = advancePay
    var value:Int = 0
    var Detail = ""
    if(p.checkCapacity(p.capacitySedan)) {
        p.capacitySedan = p.capacitySedan-1
        Detail = "Owner name -> " + ownerName + "\n" + "Vehicle number -> " + vehiclenum + "\n" + "Advance payment -> " + advancePay + "\n" + "In time ->" + inTime.toString + "\n"
        val check = p.checkSlot(p.slotSedan)
        Detail += "Slot num -> "+check+"\n"
        p.detailSedan(check) = Detail
        value = check
    }
    else println("All slots are full")
}