package bean

import scala.util.Random

//旅游页面广告
class AppAd {

  var entry:String =_;  //入口旅游页面=1  应用首页=2 商品详情页=3
  var action:String =_; //动作：请求广告=1 取缓存广告=2  广告位展示=3 广告展示=4 广告点击=5
  var status:String =_;  //状态 成功 = 1 失败= 2
  var fail_code:String =_; //失败码
  var sources:String =_;  //广告来源:热门推荐=1 自驾推荐=2 优惠推荐=3
  var behavior:String =_;//用户行为：    主动获取广告=1    被动获取广告=2
  var news_type:String =_; //Type: 1- 图文 2-图集 3-段子 4-GIF 5-视频 6-调查 7-纯文 8-视频+图文  9-GIF+图文  0-其他
  var show_type:String =_;  //内容样式无图(纯文字)=6 一张大图=1  三站小图+文=4 一张小图=2 一张大图两张小图+文=3 图集+文 = 5

}

object AppAd {
  def apply(): AppAd = new AppAd();

  def generateAppAd():AppAd = {
    val appAd = AppAd();

    appAd.entry = Random.nextInt(3) + 1 + "";
    appAd.action = Random.nextInt(5) + 1 + "";
    appAd.status = Random.nextInt(2) + 1 + "";

    var flag = Random.nextInt(10);
    flag match {
      case 1 => appAd.fail_code = "102";
      case 2 => appAd.fail_code = "201";
      case 3 => appAd.fail_code = "325";
      case 4 => appAd.fail_code = "433";
      case _ => appAd.fail_code = "";
    }
    appAd.sources = Random.nextInt(3) + 1 + "";
    appAd.behavior = Random.nextInt(2) + 1 + "";
    appAd.news_type = Random.nextInt(10) + "";
    appAd.show_type = Random.nextInt(6) + "";
    appAd;
  }
}
