
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq(/*14.27*/routes/*14.33*/.Application.index())),format.raw/*14.53*/("""">
                    Play 2.0 sample application &mdash; Computer database
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq(/*21.14*/content)),format.raw/*21.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 31 21:42:50 ART 2012
                    SOURCE: /home/sas/dev/apps/computer-database/app/views/main.scala.html
                    HASH: 6da78b864eb8add205e5d92d8539308a4a652fac
                    MATRIX: 502->1|589->16|766->163|780->169|845->212|948->285|962->291|1018->325|1173->449|1188->455|1230->475|1445->659|1474->666
                    LINES: 19->1|22->1|28->7|28->7|28->7|29->8|29->8|29->8|35->14|35->14|35->14|42->21|42->21
                    -- GENERATED --
                */
            