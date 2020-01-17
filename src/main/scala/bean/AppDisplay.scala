package bean

import java.util.UUID

import scala.util.Random

//旅游地点击日志
class AppDisplay {

  var action:String =_; //动作：曝光商品=1，点击商品=2，
  var travel_place_id:String =_;  //旅游地ID（服务端下发的ID）
  var place:String =_;//顺序（第几条商品，第一条为0，第二条为1，如此类推）
  var extend1:String =_;
  var travel_category:String =_; //旅游类型分类ID（服务端定义的分类ID）


}

object AppDisplay {
  def apply(): AppDisplay = new AppDisplay();

  def generateDisplay():AppDisplay = {

    var boolFlag:Boolean = Random.nextInt(10) < 7;
    var disPlay:AppDisplay = AppDisplay();

    //动作：曝光商品=1，点击商品=2
    if(boolFlag) {
      disPlay.action = "1";
    } else {
      disPlay.action = "2";
    }

    //旅游地id
    disPlay.travel_place_id = UUID.randomUUID().toString.substring(0, 9);
    
    //顺序
    var flag = Random.nextInt(6);
    disPlay.place = "" + flag;

    //
    flag = Random.nextInt(100);
    disPlay.travel_category = "" + flag;

    disPlay;
  }
}