package bean

//下单成功页面
class AppOrder {

  var id:String =_; //订单id
  var user_id:String =_;  //下单人id
  var people:Int = 0; //游玩人数(成人 + 儿童)
  var travel_time:String =_;  //游玩日期(月份 + 日)
  var place_id:String =_; //游玩地ID
  var price:Double =   .0;  //总价格
  var add_time:String =_; //订单创建时间
}
