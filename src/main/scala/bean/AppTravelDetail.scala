package bean


//商品详情日志
class AppTravelDetail {

  val entry:String = "";//页面入口来源：应用首页=1、push=2、详情页相关推荐=3
  val action:String  = "";//动作：开始加载=1，加载成功=2（pv），加载失败=3, 退出页面=4
  val travel_place_id:String = "";//旅游地ID（服务端下发的ID）
  val travel_place_name:String = "";//旅游地名称
  val travel_place_area:String = "";//旅游地省份
  val showType:String = ""; //旅游场景样式：0、无图1、一张大图2、两张图3、三张小图4、一张小图5、一张大图两张小图    来源于详情页相关推荐的商品，上报样式都为0（因为都是左文右图）
  //页面停留时长：从商品开始加载时开始计算，到用户关闭页面所用的时间。
  // 若中途用跳转到其它页面了，则暂停计时，待回到详情页时恢复计时。
  // 或中途划出的时间超过10分钟，则本次计时作废，不上报本次数据。如未加载成功退出，则报空。
  val news_staytime:String = "";

  //加载时长：计算页面开始加载到接口返回数据的时间 （开始加载报0，加载成功或加载失败才上报时间
  val loading_time:String = "";
  //加载失败码：把加载失败状态码报回来（报空为加载成功，没有失败）
  val type1:String = "";
  //分类id
  val category:String = "";

}
