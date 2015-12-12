
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<!--"""),_display_(/*4.10*/play20/*4.16*/.welcome(message, style = "Java")),format.raw/*4.49*/("""-->
HELLO WORLD
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 00:13:50 SGT 2015
                  SOURCE: C:/Users/Marc Lau Eng Huat/Desktop/FYP/playopenshift/app/views/index.scala.html
                  HASH: d10f18b5cf65217db0c45dfd5ade40795c89de4b
                  MATRIX: 745->1|857->18|885->21|916->44|955->46|986->51|1017->56|1031->62|1084->95|1130->112
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6
                  -- GENERATED --
              */
          