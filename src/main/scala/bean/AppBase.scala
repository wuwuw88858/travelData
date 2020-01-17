package bean

import java.util.UUID

import scala.util.Random

//公共日志
class AppBase {

   var mobile_phone_id: String = _;// (String) 设备唯一标识

   var user_id:String =_ ; // (String) 用户uid

   var version_code:String =_ ; // (String) versionCode，程序版本号

   var version_name :String =_ ; // (String) versionName，程序版本名

   var mobile_phone_system:String =_;  //系统版本

   var language:String =_ ; // (String) 系统语言

   var mobile_phone_model :String =_ ; // (String) 手机型号

   var phone_brand:String =_ ;// (String) 手机品牌

   var time :String =_ ; // (String) 客户端日志产生时的时间

   var network :String =_ ; // (String) 网络模式
   
   

}

object AppBase {
   def apply(): AppBase = new AppBase();

   //公共字段设置
   def generateComFields(): AppBase = {

      var appBase:AppBase = AppBase();
      //设备id
      appBase.mobile_phone_id = UUID.randomUUID().toString.substring(0, 8);

      //用户id
      appBase.user_id =  UUID.randomUUID().toString.substring(0, 8);

      //程序版本号
      appBase.version_code = "" + Random.nextInt(20);

      //程序版本名称
      appBase.version_name = "1." + Random.nextInt(4) + "." + Random.nextInt(10);

      //手机系统版本号
      appBase.mobile_phone_system = "8." + Random.nextInt(3) + "." + Random.nextInt(10);


      //设置手机语言
      appBase.language = "en";

      //设置手机品牌
      var flag = Random.nextInt(7);

      flag match {
         case 0 => {
            appBase.phone_brand = "Iphone";
            appBase.mobile_phone_model = "Iphone6"
         }
         case 1 => {
            appBase.phone_brand = "Iphone";
            appBase.mobile_phone_model = "Iphone8"
         }
         case 2 => {
            appBase.phone_brand = "Iphone";
            appBase.mobile_phone_model = "IphoneX"
         }

         case 3 => {
            appBase.phone_brand = "Iphone";
            appBase.mobile_phone_model = "Iphone11 PRO"
         }
         case 4 => {
            appBase.phone_brand = "Sumsung";
            appBase.mobile_phone_model = "Sumsung" + Random.nextInt(20);
         }

         case 5 => {
            appBase.phone_brand = "小米";
            appBase.mobile_phone_model = "小米" + Random.nextInt(20);
         }

         case _ => {
            appBase.phone_brand = "华为";
            appBase.mobile_phone_model = "华为" + Random.nextInt(20);
         }
      }

      //日志产生时间
      val millis:Long = System.currentTimeMillis()
      appBase.time = "" + (millis - Random.nextInt(99999999));

      //手机网络
      var phoneNetWork = Random.nextInt(1);
      phoneNetWork match {
         case 0 => appBase.network = "4G";
         case 1 => appBase.network = "WIFI";
      }
      appBase;
   }

}
