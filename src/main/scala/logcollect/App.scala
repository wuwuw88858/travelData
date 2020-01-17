package logcollect

import java.util.UUID

import bean.{AppBase, AppStart}
import com.alibaba.fastjson.{JSONArray, JSONObject}
import com.google.gson.Gson
import org.slf4j.{Logger, LoggerFactory}

import scala.util.Random


/**
 * 制造日志信息
 *
 */
object App   {
  var logger:Logger = LoggerFactory.getLogger(App.getClass);
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
//          logger.info(appStartStr);
        }
        case 1 =>{
          val gson = new Gson;
         val jsonObject = new JSONObject()
          val jsonArray = new JSONArray();

          jsonObject.put("ap", "app");
          val appBase:String = gson.toJson(AppBase.generateComFields(), classOf[AppBase]);
          jsonArray.add(appBase);
          jsonObject.put("em", jsonArray);

          if (Random.nextBoolean()) {

          }

          logger.info(jsonObject.toJSONString);

        }
      }

    }
  }






}
