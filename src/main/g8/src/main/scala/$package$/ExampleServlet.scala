package $package$

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

class $servlet_class_name$ extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"

    layoutTemplate("index.ssp", "message" -> "Hello, World!")
  }

}
