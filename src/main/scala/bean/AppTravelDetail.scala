package bean

import java.util.UUID

import Utils.BuildingCalibrateHeightType

import scala.util
import scala.util.Random


//旅游地详情日志 https://www.meet99.com/lvyou-panyu.html
class AppTravelDetail {

  var entry:String =_;//页面入口来源：应用首页=1、push=2、详情页相关推荐=3
  var action:String  =_;//动作：开始加载=1，加载成功=2（pv），加载失败=3, 退出页面=4
  var travel_place_id:String =_;//旅游地ID（服务端下发的ID）
  var travel_place_name:String =_;//旅游地名称
  var travel_place_area:String =_;//旅游地省份
  var show_type:String =_; //旅游场景样式：0、无图1、一张大图2、两张图3、三张小图4、一张小图5、一张大图两张小图    来源于详情页相关推荐的商品，上报样式都为0（因为都是左文右图）
  //页面停留时长：从商品开始加载时开始计算，到用户关闭页面所用的时间。
  // 若中途用跳转到其它页面了，则暂停计时，待回到详情页时恢复计时。
  // 或中途划出的时间超过10分钟，则本次计时作废，不上报本次数据。如未加载成功退出，则报空。
  var stay_time:String =_;

  //加载时长：计算页面开始加载到接口返回数据的时间 （开始加载报0，加载成功或加载失败才上报时间
  var loading_time:String =_;

}

object AppTravelDetail{
  def apply(): AppTravelDetail = new AppTravelDetail()

  def generateTravelDetail(): AppTravelDetail ={
   var appTravelDetail:AppTravelDetail = AppTravelDetail();
    var flag = Random.nextInt(3) + 1;

    //页面入口来源
    appTravelDetail.entry = flag + "";

    //动作
    appTravelDetail.action= "" + Random.nextInt(4) + 1 ;


    flag = Random.nextInt(12);

    flag match {
      case 0 => {
        //旅游地ID
        appTravelDetail.travel_place_id = BuildingCalibrateHeightType.place1 + "";
        appTravelDetail.travel_place_name = "长隆欢乐世界";
        appTravelDetail.travel_place_area = "广东省";
      }
      case 1 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place2 + "";
        appTravelDetail.travel_place_name = "佛山南山古灶";
        appTravelDetail.travel_place_area = "广东省";
      }
      case 2 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place3 + "";
        appTravelDetail.travel_place_name = "故宫";
        appTravelDetail.travel_place_area = "北京市";
      }
      case 3 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place4 + "";
        appTravelDetail.travel_place_name = "九寨沟";
        appTravelDetail.travel_place_area = "四川省";
      }
      case 4 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place5 + "";
        appTravelDetail.travel_place_name = "丽江古城";
        appTravelDetail.travel_place_area = "云南省";
      }
      case 5 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place6 + "";
        appTravelDetail.travel_place_name = "西湖";
        appTravelDetail.travel_place_area = "浙江省";
      }
      case 6 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place7 + "";
        appTravelDetail.travel_place_name = "泰山";
        appTravelDetail.travel_place_area = "山东省";
      }
      case 7 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place8 + "";
        appTravelDetail.travel_place_name = "八达岭";
        appTravelDetail.travel_place_area = "北京市";
      }
      case 8 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place9 + "";
        appTravelDetail.travel_place_name = "天安门";
        appTravelDetail.travel_place_area = "北京市";
      }
      case 9 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place10 + "";
        appTravelDetail.travel_place_name = "鼓浪屿岛";
        appTravelDetail.travel_place_area = "福建省";
      }
      case 10 => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place11 + "";
        appTravelDetail.travel_place_name = "湘西凤凰古城";
        appTravelDetail.travel_place_area = "湖南省";
      }
      case _ => {
        //旅游地ID
        appTravelDetail.travel_place_id =  BuildingCalibrateHeightType.place12 + "";
        appTravelDetail.travel_place_name = "东方明珠";
        appTravelDetail.travel_place_area = "上海市";
      }
    }

    flag = Random.nextInt(6);
    appTravelDetail.show_type = "" + flag;
    appTravelDetail.stay_time = "" + Random.nextInt(10) * Random.nextInt(7);
    appTravelDetail.loading_time = "" + Random.nextInt(10) * Random.nextInt(7);

    appTravelDetail;

  }
}
