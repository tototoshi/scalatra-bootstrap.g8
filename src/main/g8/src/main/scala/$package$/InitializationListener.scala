package $package$

import javax.servlet._

import scalikejdbc._
import LoanPattern._

class InitializationListener extends ServletContextListener {

  def contextInitialized(event: ServletContextEvent): Unit = {
    val banner = """|
                    | ##      ## ######## ##        ######   #######  ##     ## ######## ####
                    | ##  ##  ## ##       ##       ##    ## ##     ## ###   ### ##       ####
                    | ##  ##  ## ##       ##       ##       ##     ## #### #### ##       ####
                    | ##  ##  ## ######   ##       ##       ##     ## ## ### ## ######    ##
                    | ##  ##  ## ##       ##       ##       ##     ## ##     ## ##
                    | ##  ##  ## ##       ##       ##    ## ##     ## ##     ## ##       ####
                    |  ###  ###  ######## ########  ######   #######  ##     ## ######## ####
                    |""".stripMargin

    println(banner)
  }

  def contextDestroyed(event: ServletContextEvent): Unit = {
    val banner = """|
                    | ########  ##    ## ######## ####
                    | ##     ##  ##  ##  ##       ####
                    | ##     ##   ####   ##       ####
                    | ########     ##    ######    ##
                    | ##     ##    ##    ##
                    | ##     ##    ##    ##       ####
                    | ########     ##    ######## ####
                    |""".stripMargin

    println(banner)
  }

}
