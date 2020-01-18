package logCollectorScala

import scala.util.Random

class Test {

}

object Test {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
      println(Random.nextInt(10000));
    print("end");
  }
}
