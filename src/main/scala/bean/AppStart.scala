package bean

//app start
class AppStart extends AppBase{

  val entry:String = "";//入口： push=1，widget=2，icon=3，notification=4, lockscreen_widget =5
  val open_and_type:String = "";  //开屏广告类型:  开屏原生广告=1, 开屏插屏广告=2
  val acton:String = "";//状态 成功1 失败2
  val loading_time:String = ""; //加载时长：计算下拉开始到接口返回数据的时间，（开始加载报0，加载成功或加载失败才上报时间）
  val detail:String = ""; //失败码，
  val detailMsg:String = "";  //失败的message
  val en:String = "";//启动日志的类型

}
