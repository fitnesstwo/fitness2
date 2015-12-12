
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Marc Lau Eng Huat/Desktop/FYP/playopenshift/conf/routes
// @DATE:Sun Dec 13 00:13:49 SGT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
