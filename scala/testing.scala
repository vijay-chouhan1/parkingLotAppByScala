
object testing {
  val p = new parkingLot
  val t1 = new twoWheeler("Vijay","RJ 21 3456",50,p)
  val t2 = new twoWheeler("ayush","RJ 19 6656",100,p)

  val num1 = p.capacityTwo
  val t3 = new twoWheeler("harsh","RJ 14 7546",150,p)
  val num2 = p.capacityTwo
  val num3 = p.detailTwo.size
  val num4 = p.historyDetails.size
  val u1 = new unParking(p,t1)
  val num5 = p.capacityTwo
  val num6 = p.detailTwo.size
  val num7 = p.historyDetails.size
}
