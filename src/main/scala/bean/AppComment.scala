package bean

//用户评论

class AppComment {

  val comment_id:String = ""; //评论id
  val user_id:String = "";  //用户id
  val parent_comment_id:String = "";  //父级评论
  val content:String  = ""; //评论内容
  val add_time:String = ""; //创建时间
  val other_comment_id:String = ""; //评论相关id
  val praise_count:Int = 0; //点赞数量
  val reply_count:Int = 0;  //回复数量

}
