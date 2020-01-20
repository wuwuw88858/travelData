package logcollect

import bean._
import com.alibaba.fastjson.{JSONArray, JSONObject}
import com.google.gson.Gson
import com.typesafe.scalalogging.Logger

import scala.reflect.ClassTag
import scala.util.Random


/**
 * 制造日志信息
 *
 */
object App   {
   val logger = Logger(this.getClass);
  private var random:String = Random.nextInt(100).toString();
  private var s_mid:String =_;  //设备id
  private var s_uid:String =_;  //用户id
  private var places_id:String =_;  //旅游地id
  var delay:Long = 0L;  //发送的延迟时间
  var loopLen:Int = 0; //循环遍历次数
  def main(args: Array[String]): Unit = {
    // 参数一：控制发送每条的延时时间，默认是0
    if (args.length > 0)
      delay = args(0).toLong
    else
      delay = 10;

    // 参数二：循环遍历次数
    if(args.length > 1)
      loopLen = args(1).toInt
    else
      loopLen = 10;

    generateLog(delay, loopLen);

  }
  //生成数据
  def generateLog(delay:Long, loopLen:Int) {

    var a = 0;
    for (a <- 0 to loopLen) {
      var flag:Int = Random.nextInt(2);

      //
      flag match {
        case 0 => {
          val gson = new Gson;
          var appStart:AppStart = AppStart.generateStart();

          val appStartStr:String = gson.toJson(appStart, classOf[AppStart]);
             logger.info(appStartStr);
        }
        case 1 =>{
          val gson = new Gson;
         val jsonObject = new JSONObject()
          val jsonArray = new JSONArray();

          jsonObject.put("ap", "app");
          val appBase:String = gson.toJson(AppBase.generateComFields(), classOf[AppBase]);
          jsonObject.put("cm", appBase);

          //点击
          jsonArray.add(packEvnetJson("travel_display", gson.toJson(AppDisplay.generateDisplay(), classOf[AppDisplay])));

          //列表
          jsonArray.add(packEvnetJson("travel_list", gson.toJson(AppList.generateList(), classOf[AppList])));

          //详情
          jsonArray.add(packEvnetJson("travel_detail", gson.toJson(AppTravelDetail.generateTravelDetail(), classOf[AppTravelDetail])));
          jsonObject.put("event", jsonArray);

          //下单
          if (Random.nextBoolean()) {
            jsonArray.add(packEvnetJson("travel_order", gson.toJson(AppOrder.generateAppOrder(), classOf[AppOrder])));
          }

          //收藏
          if (Random.nextBoolean()) {
            jsonArray.add(packEvnetJson("travel_order", gson.toJson(AppOrder.generateAppOrder(), classOf[AppOrder])));
          }
          //评论
          if (Random.nextBoolean()) {
            jsonArray.add(packEvnetJson("travel_comment", gson.toJson(AppComment.generateAppComment(), classOf[AppComment])));
          }
          //广告
          if (Random.nextBoolean()) {
            jsonArray.add(packEvnetJson("travel_advr", gson.toJson(AppAd.generateAppAd(), classOf[AppAd])));
          }
          //购买产品
         if (Random.nextBoolean()) {
            jsonArray.add(packEvnetJson("travel_product", gson.toJson(AppTravelProduct.generateTravelProduce(), classOf[AppTravelProduct])));
          }
          //点赞
          if (Random.nextBoolean()) {
            jsonArray.add(packEvnetJson("travel_praise", gson.toJson(AppPraise.generateAppPraise(), classOf[AppPraise])));
          }

          val millis = System.currentTimeMillis();
          logger.info(millis + "|" + jsonObject.toJSONString);

        }
      }

    }
  }


  //21:49:25.337 [main] INFO  logcollect.App$
  def packEvnetJson[T:ClassTag](eventName:String, t: T):JSONObject = {
    val obj = new JSONObject();
    obj.put("ett", (System.currentTimeMillis() - Random.nextInt(99999999)) + "");
    obj.put("event_name", eventName);
    obj.put("action", t);
    obj;
  }

}
