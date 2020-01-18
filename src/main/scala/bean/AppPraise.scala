package bean

import java.util.UUID

import Utils.BuildingCalibrateHeightType

import scala.util.Random

//点赞
class AppPraise {
  var id:String =_; //主键id
  var user_id:String =_;  //用户id
  var target_user_id:String =_; //点赞对象id
  var target_place_id:String =_; //点赞者游玩地ID
  var praise_type:String =_;  //点赞类型id 点赞类型 1问答点赞 2问答评论点赞 3 文章点赞数4 评论点赞
  var create_time:String =_;  //创建时间


}
object AppPraise {
  def apply(): AppPraise = new AppPraise();

  def generateAppPraise():AppPraise = {
    var praise:AppPraise = AppPraise();
    praise.id = UUID.randomUUID().toString.replace("-", "");
    praise.user_id = Random.nextInt(10) + "";
    praise.target_user_id = Random.nextInt(10) + "";

    var flag = Random.nextInt(12);

    flag match {
      case 0 => {
        //旅游地ID
        praise.target_place_id = BuildingCalibrateHeightType.place1 + "";
      }
      case 1 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place2 + "";
      }
      case 2 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place3 + "";
      }
      case 3 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place4 + "";
      }
      case 4 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place5 + "";
      }
      case 5 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place6 + "";
      }
      case 6 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place7 + "";

      }
      case 7 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place8 + "";
      }
      case 8 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place9 + "";
      }
      case 9 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place10 + "";
      }
      case 10 => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place11 + "";
      }
      case _ => {
        //旅游地ID
        praise.target_place_id  =  BuildingCalibrateHeightType.place12 + "";
      }
    }
    praise.praise_type = Random.nextInt(4) + 1 +"";
    praise.create_time = System.currentTimeMillis() - Random.nextInt(99999999) + "";
    praise;
  }
}
