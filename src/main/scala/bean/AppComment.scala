package bean

//用户评论

class AppComment {

  var comment_id:String =_; //评论id
  var user_id:String =_;  //用户id
  var parent_comment_id:String =_;  //父级评论
  var content:String  =_; //评论内容
  var add_time:String =_; //创建时间
  var other_comment_id:String =_; //评论相关id
  var praise_count:Int = 0; //点赞数量
  var reply_count:Int = 0;  //回复数量

}
