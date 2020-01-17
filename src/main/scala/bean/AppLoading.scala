package bean

import scala.util.Random

//商品列表
class AppList {

  var action:String =_;//动作：开始加载=1，加载成功=2，加载失败=3
  var loading_time:String =_; ////加载时长：计算下拉开始到接口返回数据的时间，（开始加载报0，加载成功或加载失败才上报时间）
  var loading_way:String =_;  //加载方式：1-读取缓存，2-从接口拉新数据   （加载成功才上报加载类型）
  var extend1:String =_;  //拓展字段1
  var extend2:String =_;  //拓展字段2
  var loading_type:String =_;//加载类型：自动加载=1，用户下拽加载=2，底部加载=3（底部条触发点击底部提示条/点击返回顶部加载）

}

object AppList {
  def apply(): AppList = new AppList();

  def generateList():AppList = {
    var appList:AppList = AppList();
    var flag = Random.nextInt(3) + 1;

    appList.action = "" + flag;

    flag = Random.nextInt(10) * Random.nextInt(7);
    appList.loading_time = flag + "";
    appList.extend1 = "";
    appList.extend2 = "";
    appList.loading_time = Random.nextInt(3) + 1 + "";
    appList;
  }
}
