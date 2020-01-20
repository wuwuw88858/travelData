package logcollect

import com.typesafe.scalalogging.Logger


class logTest {


}
object logTest {
  def main(args: Array[String]): Unit = {

    //22:31:38.138 [main] INFO  logcollect.App$ - a
    //22:31:49.299 [main] INFO  logcollect.App$ - a
  //F:\bigData\课程\课件\kafka\logcollector\src\log\test.log
     val logger = Logger(this.getClass);

    logger.info("server ready ...... ")

  }
}
