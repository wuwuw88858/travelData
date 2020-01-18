package bean

import Utils.GetContent

import scala.util.Random
import scala.collection.mutable.StringBuilder;
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

object AppComment {
  def apply(): AppComment = new AppComment();

  def generateAppComment():AppComment = {
    var appComment: AppComment = AppComment();

    appComment.comment_id = "" + Random.nextInt(10);
    appComment.user_id = "" + Random.nextInt(10);
    appComment.parent_comment_id = "" + Random.nextInt(5);

    appComment.content = GetContent.getContent();
    appComment.add_time = System.currentTimeMillis() - Random.nextInt(99999999) + "";
    appComment.other_comment_id = Random.nextInt(10) + "";
    appComment.praise_count = Random.nextInt(2000);
    appComment.reply_count = Random.nextInt(200);
    appComment;

  }

}
