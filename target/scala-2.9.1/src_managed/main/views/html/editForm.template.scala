
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq(format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Edit computer</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq(format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq(/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq(/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            
            """),_display_(Seq(/*19.14*/select(
                computerForm("company"), 
                Company.options, 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*24.14*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*30.23*/routes/*30.29*/.Application.list())),format.raw/*30.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*33.6*/("""
    
    """),_display_(Seq(/*35.6*/form(routes.Application.delete(id), 'class -> "topRight")/*35.63*/ {_display_(Seq(format.raw/*35.65*/("""
        <input type="submit" value="Delete this computer" class="btn danger">
    """)))})),format.raw/*37.6*/("""
    
""")))})),format.raw/*39.2*/("""
"""))}
    }
    
    def render(id:Long,computerForm:Form[Computer]) = apply(id,computerForm)
    
    def f:((Long,Form[Computer]) => play.api.templates.Html) = (id,computerForm) => apply(id,computerForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 31 21:42:50 ART 2012
                    SOURCE: /home/sas/dev/apps/computer-database/app/views/editForm.scala.html
                    HASH: 14744262d71b1c582d38d5a2eb57a9bef9cae8b8
                    MATRIX: 521->1|646->62|678->86|752->41|780->60|808->135|840->138|851->142|884->144|957->187|1001->222|1036->224|1118->275|1199->334|1244->348|1333->415|1378->429|1471->500|1529->527|1768->744|1975->920|1990->926|2031->945|2117->1000|2158->1011|2224->1068|2259->1070|2374->1154|2412->1161
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|32->11|32->11|32->11|36->15|36->15|37->16|37->16|38->17|38->17|40->19|45->24|51->30|51->30|51->30|54->33|56->35|56->35|56->35|58->37|60->39
                    -- GENERATED --
                */
            