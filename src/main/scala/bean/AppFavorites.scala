package bean

import java.util.UUID

import Utils.BuildingCalibrateHeightType

import scala.util.Random

//用户收藏
class AppFavorites {

  var id:String =_; //主键
  var travel_id:String =_;  //旅游地id
  var user_id:String =_;  //收藏者id
  var add_time:String =_; //创建时间

}

object AppFavorites {
  def apply(): AppFavorites = new AppFavorites();

  def generateFavourite():AppFavorites = {
    var favorites:AppFavorites = AppFavorites();
    favorites.id = UUID.randomUUID().toString.replace("-", "");

    Random.nextInt(11) match {
      case 0 => favorites.travel_id = BuildingCalibrateHeightType.place1 + "";
      case 1 => favorites.travel_id = BuildingCalibrateHeightType.place2 + "";
      case 2 => favorites.travel_id = BuildingCalibrateHeightType.place3 + "";
      case 3 => favorites.travel_id = BuildingCalibrateHeightType.place4 + "";
      case 4 => favorites.travel_id = BuildingCalibrateHeightType.place5 + "";
      case 5 => favorites.travel_id = BuildingCalibrateHeightType.place6 + "";
      case 6 => favorites.travel_id = BuildingCalibrateHeightType.place7 + "";
      case 7 => favorites.travel_id = BuildingCalibrateHeightType.place8 + "";
      case 8 => favorites.travel_id = BuildingCalibrateHeightType.place9 + "";
      case 9 => favorites.travel_id = BuildingCalibrateHeightType.place10 + "";
      case 10 => favorites.travel_id = BuildingCalibrateHeightType.place11 + "";
      case _ => favorites.travel_id = BuildingCalibrateHeightType.place12 + "";
    }
    favorites.user_id = Random.nextInt(10) + "";
    favorites.add_time = System.currentTimeMillis() - Random.nextInt(99999999) + "";
    favorites
  }

}
