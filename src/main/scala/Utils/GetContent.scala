package Utils




import scala.collection.mutable.StringBuilder
import scala.util.Random
import scala.math._
class GetContent {

}

object GetContent {
  def getContent():String = {

    val stringBuilder = new StringBuilder;
    var i = 0;
    for ( i <- 1 to  20) {
        stringBuilder +=ContentJava.getSingleContent();
    }
    stringBuilder.toString();
  }

}
