package bean

import java.util.UUID

import Utils.BuildingCalibrateHeightType

import scala.util.Random

//旅游产品订单页面
class AppTravelProduct {

  var product_id:String =_;  //订单生产id
  var user_id:String =_;  //用户id
  var goods_id:String =_;  //产品id
  var goods_name:String =_; //产品名称
  var goods_type:String =_; //产品类型 (1)
  var add_time:String =_; //创建时间
}

object AppTravelProduct {
  def apply(): AppTravelProduct = new AppTravelProduct();

  def generateTravelProduce():AppTravelProduct ={
    val product = AppTravelProduct();
    product.product_id = UUID.randomUUID().toString.replace("-", "");
    product.user_id = Random.nextInt(10) + "";
    product.goods_id = UUID.randomUUID().toString.replace("-", "");

    Random.nextInt(8) match {
      case 0 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type1 + "";
        Random.nextInt(2) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type1_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type1_detail2 + "";
          case _ => product.goods_name = BuildingCalibrateHeightType.travel_type1_detail3 + "";
        }
      }
      case 1 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type2 + "";
        Random.nextInt(2) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type2_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type2_detail2 + "";
          case _ => product.goods_name = BuildingCalibrateHeightType.travel_type2_detail3 + "";
        }
      }
      case 2 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type3 + "";
        Random.nextInt(3) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type3_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type3_detail2 + "";
          case 2 => product.goods_name = BuildingCalibrateHeightType.travel_type3_detail3 + "";
          case _ => product.goods_name = BuildingCalibrateHeightType.travel_type3_detail4 + "";
        }
      }
      case 3 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type4 + "";
        Random.nextInt(3) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type4_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type4_detail2 + "";
          case 2 => product.goods_name = BuildingCalibrateHeightType.travel_type4_detail3 + "";
          case _ => product.goods_name = BuildingCalibrateHeightType.travel_type4_detail4 + "";
        }
      }
      case 4 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type5 + "";
        Random.nextInt(3) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type5_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type5_detail2 + "";
          case 2 => product.goods_name = BuildingCalibrateHeightType.travel_type5_detail3 + "";
        }
      }
      case 5 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type6 + "";
        Random.nextInt(4) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type6_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type6_detail2 + "";
          case 2 => product.goods_name = BuildingCalibrateHeightType.travel_type6_detail3 + "";
          case 3 => product.goods_name = BuildingCalibrateHeightType.travel_type6_detail4 + "";
        }
      }
      case 6 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type7 + "";
        Random.nextInt(5) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type7_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type7_detail2 + "";
          case 2 => product.goods_name = BuildingCalibrateHeightType.travel_type7_detail3 + "";
          case 3 => product.goods_name = BuildingCalibrateHeightType.travel_type7_detail4 + "";
          case 4 => product.goods_name = BuildingCalibrateHeightType.travel_type7_detail5 + "";
        }
      }
      case 7 => {
        product.goods_type = BuildingCalibrateHeightType.travel_type8 + "";
        Random.nextInt(4) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type8_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type8_detail2 + "";
          case 2 => product.goods_name = BuildingCalibrateHeightType.travel_type8_detail3 + "";
          case 3 => product.goods_name = BuildingCalibrateHeightType.travel_type8_detail4 + "";

        }
      }
      case _ => {
        product.goods_type = BuildingCalibrateHeightType.travel_type1 + "";
        Random.nextInt(2) match {
          case 0 => product.goods_name = BuildingCalibrateHeightType.travel_type1_detail1 + "";
          case 1 => product.goods_name = BuildingCalibrateHeightType.travel_type1_detail2 + "";
          case _ => product.goods_name = BuildingCalibrateHeightType.travel_type1_detail3 + "";
        }
      }
    }
    product.add_time = System.currentTimeMillis() - Random.nextInt(99999999) + "";
    product;
  }
}
