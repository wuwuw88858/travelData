package bean

import java.util.UUID

import Utils.BuildingCalibrateHeightType

import scala.util.Random

//下单成功页面
class AppOrder {

  var id:String =_; //订单id
  var user_id:String =_;  //下单人id
  var people:Int = 0; //游玩人数(成人 + 儿童)
  var travel_time:String =_;  //游玩日期(月份 + 日)
  var travel_id:String =_; //游玩地ID
  var price:Double =   .0;  //总价格
  var add_time:String =_; //订单创建时间

}

object AppOrder {
  def apply(): AppOrder = new AppOrder();

  def generateAppOrder():AppOrder = {
    var appOrder:AppOrder = AppOrder();
    appOrder.id = UUID.randomUUID().toString.replace("-", "");
    appOrder.user_id = Random.nextInt(10) + "";
    appOrder.people = Random.nextInt(7) + 3;
    appOrder.travel_time = System.currentTimeMillis() - Random.nextInt(99999999) + "";

    Random.nextInt(11) match {
      case 0 => appOrder.travel_id = BuildingCalibrateHeightType.place1 + "";
      case 1 => appOrder.travel_id = BuildingCalibrateHeightType.place2 + "";
      case 2 => appOrder.travel_id = BuildingCalibrateHeightType.place3 + "";
      case 3 => appOrder.travel_id = BuildingCalibrateHeightType.place4 + "";
      case 4 => appOrder.travel_id = BuildingCalibrateHeightType.place5 + "";
      case 5 => appOrder.travel_id = BuildingCalibrateHeightType.place6 + "";
      case 6 => appOrder.travel_id = BuildingCalibrateHeightType.place7 + "";
      case 7 => appOrder.travel_id = BuildingCalibrateHeightType.place8 + "";
      case 8 => appOrder.travel_id = BuildingCalibrateHeightType.place9 + "";
      case 9 => appOrder.travel_id = BuildingCalibrateHeightType.place10 + "";
      case 10 => appOrder.travel_id = BuildingCalibrateHeightType.place11 + "";
      case _ => appOrder.travel_id = BuildingCalibrateHeightType.place12 + "";
    }
    appOrder.price = Random.nextInt(10000) + 4500;
    appOrder.add_time = System.currentTimeMillis() - Random.nextInt(99999999) + "";
    appOrder;
  }
}
