package bean

import java.util.UUID

import scala.util.Random

//app start
class AppStart extends AppBase{

  var entry:String =_;//入口： push=1，widget=2，icon=3，notification=4, lockscreen_widget =5

  var acton:String =_;//状态 成功1 失败2

  var en:String =_;//启动日志的类型


  override def toString = s"AppStart($entry, $acton, $en, $user_id)"
}

object AppStart{
  def apply(): AppStart = new AppStart();

  //启动日志
  def generateStart(): AppStart = {
    var appStart:AppStart = AppStart();

    //Base

    //设备id
    appStart.mobile_phone_id = UUID.randomUUID().toString.substring(0, 8);
    //用户id
    appStart.user_id = UUID.randomUUID().toString.substring(0, 8);

    //程序版本号
    appStart.version_code = "" + Random.nextInt(20);

    //程序版本号1.2.5
    appStart.version_name = "1." + Random.nextInt(4) + "." + Random.nextInt(10);

    //手机系统版本号
    appStart.mobile_phone_system = "8." + Random.nextInt(3) + "." + Random.nextInt(10);


    //设置手机语言
    appStart.language = "en";

    //设置手机品牌
    var flag = Random.nextInt(7);

    flag match {
      case 0 => {
        appStart.phone_brand = "Iphone";
        appStart.mobile_phone_model = "Iphone6"
      }
      case 1 => {
        appStart.phone_brand = "Iphone";
        appStart.mobile_phone_model = "Iphone8"
      }
      case 2 => {
        appStart.phone_brand = "Iphone";
        appStart.mobile_phone_model = "IphoneX"
      }

      case 3 => {
        appStart.phone_brand = "Iphone";
        appStart.mobile_phone_model = "Iphone11 PRO"
      }
      case 4 => {
        appStart.phone_brand = "Sumsung";
        appStart.mobile_phone_model = "Sumsung" + Random.nextInt(20);
      }

      case 5 => {
        appStart.phone_brand = "小米";
        appStart.mobile_phone_model = "小米" + Random.nextInt(20);
      }

      case _ => {
        appStart.phone_brand = "华为";
        appStart.mobile_phone_model = "华为" + Random.nextInt(20);
      }
    }

    //日志产生时间
    val millis:Long = System.currentTimeMillis()
    appStart.time = "" + (millis - Random.nextInt(99999999));

    //手机网络
    var phoneNetWork = Random.nextInt(1);
    phoneNetWork match {
      case 0 => appStart.network = "4G";
      case 1 => appStart.network = "WIFI";
    }

    //Start

    val enrtyRandom = Random.nextInt(5) + 1;
    appStart.entry = enrtyRandom + "";
    appStart.acton = "1";
    appStart.en = "start";

    appStart;
  }
}
