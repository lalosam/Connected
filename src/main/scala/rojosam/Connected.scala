package rojosam

import org.slf4j.{MDC, LoggerFactory}

/**
  * Created by eduardo on 2/21/16.
  */
object Connected {

  val LOG = LoggerFactory.getLogger(this.getClass)


  def main(args: Array[String]): Unit ={
    MDC.put("environment","envtest3")
    println("TEST1")
    LOG.info("test")
  }

}
