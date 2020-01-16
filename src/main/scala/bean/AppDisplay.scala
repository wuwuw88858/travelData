package bean

//旅游地点击日志
class AppDisplay {

  val action:String = ""; //动作：曝光商品=1，点击商品=2，
  val travel_place_id:String = "";  //旅游地ID（服务端下发的ID）
  val place:String = "";//顺序（第几条商品，第一条为0，第二条为1，如此类推）
  val extend1:String = "";
  val travel_category:String = ""; //旅游类型分类ID（服务端定义的分类ID）


}
