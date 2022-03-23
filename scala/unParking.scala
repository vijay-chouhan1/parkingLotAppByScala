import java.time.LocalDateTime

class unParking(p:parkingLot,vehicle:AnyRef){
  p.historyKey += 1
  val exitTime = LocalDateTime.now()
  vehicle match {
    case two : twoWheeler =>{
      p.capacityTwo += 1
      val rate = p.rate(two.inTime,exitTime,two.advance)
      println("Please pay left amount "+rate)
      p.historyDetails(p.historyKey) = two.Detail+"Exit Time -> "+exitTime+"\n"+"Total amount -> "+rate+"\n"
      var index=p.slotTwo.indexOf(two.value)
      p.slotTwo.contains(index)
      p.detailTwo.remove(two.value)
    }
    case sedan : Sedan =>{
      p.capacitySedan += 1
      val rate = p.rate(sedan.inTime,exitTime,sedan.advance)
      println("Please pay left amount "+rate)
      p.historyDetails(p.historyKey) = sedan.Detail+"Exit Time -> "+exitTime+"\n"+"Total amount -> "+rate+"\n"
      var index=p.slotSedan.indexOf(sedan.value)
      p.slotSedan.contains(index)
      p.detailSedan.remove(sedan.value)
    }
    case suv : SUV =>{
      p.capacitySUV += 1
      val rate = p.rate(suv.inTime,exitTime,suv.advance)
      println("Please pay left amount "+rate)
      p.historyDetails(p.historyKey) = suv.Detail+"Exit Time -> "+exitTime+"\n"+"Total amount -> "+rate+"\n"
      var index=p.slotSUV.indexOf(suv.value)
      p.slotSUV.contains(index)
      p.detailSUV.remove(suv.value)
    }
    case hatch : Hatchback =>{
      p.capacityHatch += 1
      val rate = p.rate(hatch.inTime,exitTime,hatch.advance)
      println("Please pay left amount "+rate)
      p.historyDetails(p.historyKey) = hatch.Detail+"Exit Time -> "+exitTime+"\n"+"Total amount -> "+rate+"\n"
      var index=p.slotSedan.indexOf(hatch.value)
      p.slotSedan.contains(index)
      p.detailHatch.remove(hatch.value)
    }
  }
}