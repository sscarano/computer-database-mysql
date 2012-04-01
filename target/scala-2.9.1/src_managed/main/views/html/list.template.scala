
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[scala.Tuple2[Computer, Option[Company]]],Int,String,play.api.mvc.Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[(Computer, Option[Company])], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash):play.api.templates.Html = {
        _display_ {
def /*16.2*/header/*16.8*/(orderBy: Int, title: String):play.api.templates.Html = {_display_(

Seq(format.raw/*16.41*/("""
    <th class="col"""),_display_(Seq(/*17.20*/orderBy)),format.raw/*17.27*/(""" header """),_display_(Seq(/*17.36*/if(scala.math.abs(currentOrderBy) == orderBy){/*17.83*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}})),format.raw/*17.144*/("""">
        <a href=""""),_display_(Seq(/*18.19*/link(0, Some(orderBy)))),format.raw/*18.41*/("""">"""),_display_(Seq(/*18.44*/title)),format.raw/*18.49*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Application.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
    
}};
Seq(format.raw/*1.130*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*15.37*/("""
"""),format.raw/*20.2*/("""

"""),_display_(Seq(/*22.2*/main/*22.6*/ {_display_(Seq(format.raw/*22.8*/("""
    
    <h1>"""),_display_(Seq(/*24.10*/Messages("computers.list.title", currentPage.total))),format.raw/*24.61*/("""</h1>

    """),_display_(Seq(/*26.6*/flash/*26.11*/.get("success").map/*26.30*/ { message =>_display_(Seq(format.raw/*26.43*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*28.37*/message)),format.raw/*28.44*/("""
        </div>
    """)))})),format.raw/*30.6*/("""

    <div id="actions">
        
        """),_display_(Seq(/*34.10*/helper/*34.16*/.form(action=routes.Application.list())/*34.55*/ {_display_(Seq(format.raw/*34.57*/("""
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*35.66*/currentFilter)),format.raw/*35.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        """)))})),format.raw/*37.10*/("""
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*39.48*/routes/*39.54*/.Application.create())),format.raw/*39.75*/("""">Add a new computer</a>
        
    </div>
    
    """),_display_(Seq(/*43.6*/Option(currentPage.items)/*43.31*/.filterNot(_.isEmpty).map/*43.56*/ { computers =>_display_(Seq(format.raw/*43.71*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*48.22*/header(2, "Computer name"))),format.raw/*48.48*/("""
                    """),_display_(Seq(/*49.22*/header(3, "Introduced"))),format.raw/*49.45*/("""
                    """),_display_(Seq(/*50.22*/header(4, "Discontinued"))),format.raw/*50.47*/("""
                    """),_display_(Seq(/*51.22*/header(5, "Company"))),format.raw/*51.42*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*56.18*/computers/*56.27*/.map/*56.31*/ {/*57.21*/case (computer, company) =>/*57.48*/ {_display_(Seq(format.raw/*57.50*/("""
                        <tr>
                            <td><a href=""""),_display_(Seq(/*59.43*/routes/*59.49*/.Application.edit(computer.id.get))),format.raw/*59.83*/("""">"""),_display_(Seq(/*59.86*/computer/*59.94*/.name)),format.raw/*59.99*/("""</a></td>
                            <td>
                                """),_display_(Seq(/*61.34*/computer/*61.42*/.introduced.map(_.format("dd MMM yyyy")).getOrElse/*61.92*/ {_display_(Seq(format.raw/*61.94*/(""" <em>-</em> """)))})),format.raw/*61.107*/("""
                            </td>
                            <td>
                                """),_display_(Seq(/*64.34*/computer/*64.42*/.discontinued.map(_.format("dd MMM yyyy")).getOrElse/*64.94*/ {_display_(Seq(format.raw/*64.96*/(""" <em>-</em> """)))})),format.raw/*64.109*/("""
                            </td>
                            <td>
                                """),_display_(Seq(/*67.34*/company/*67.41*/.map(_.name).getOrElse/*67.63*/ {_display_(Seq(format.raw/*67.65*/(""" <em>-</em> """)))})),format.raw/*67.78*/("""
                            </td>
                        </tr>
                    """)))}})),format.raw/*71.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*78.18*/currentPage/*78.29*/.prev.map/*78.38*/ { page =>_display_(Seq(format.raw/*78.48*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*80.35*/link(page))),format.raw/*80.45*/("""">&larr; Previous</a>
                    </li> 
                """)))}/*82.18*/.getOrElse/*82.28*/ {_display_(Seq(format.raw/*82.30*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*86.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*88.36*/(currentPage.offset + 1))),format.raw/*88.60*/(""" to """),_display_(Seq(/*88.65*/(currentPage.offset + computers.size))),format.raw/*88.102*/(""" of """),_display_(Seq(/*88.107*/currentPage/*88.118*/.total)),format.raw/*88.124*/("""</a>
                </li>
                """),_display_(Seq(/*90.18*/currentPage/*90.29*/.next.map/*90.38*/ { page =>_display_(Seq(format.raw/*90.48*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*92.35*/link(page))),format.raw/*92.45*/("""">Next &rarr;</a>
                    </li> 
                """)))}/*94.18*/.getOrElse/*94.28*/ {_display_(Seq(format.raw/*94.30*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*98.18*/("""
            </ul>
        </div>
        
    """)))}/*102.6*/.getOrElse/*102.16*/ {_display_(Seq(format.raw/*102.18*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))})),format.raw/*108.6*/("""

        
""")))})),format.raw/*111.2*/("""

            """))}
    }
    
    def render(currentPage:Page[scala.Tuple2[Computer, Option[Company]]],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash) = apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def f:((Page[scala.Tuple2[Computer, Option[Company]]],Int,String) => (play.api.mvc.Flash) => play.api.templates.Html) = (currentPage,currentOrderBy,currentFilter) => (flash) => apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 31 21:40:05 ART 2012
                    SOURCE: /home/sas/dev/apps/computer-database/app/views/list.scala.html
                    HASH: 142e3999d5abf786dbccf1c41b89ef6286baed7a
                    MATRIX: 573->1|762->628|776->634|868->667|919->687|948->694|988->703|1043->750|1128->811|1180->832|1224->854|1258->857|1285->862|1323->258|1334->262|1614->129|1643->256|1671->516|1701->626|1729->878|1762->881|1774->885|1808->887|1854->902|1927->953|1969->965|1983->970|2011->989|2057->1002|2169->1083|2198->1090|2250->1111|2324->1154|2339->1160|2387->1199|2422->1201|2519->1267|2554->1280|2734->1428|2822->1485|2837->1491|2880->1512|2965->1567|2999->1592|3033->1617|3081->1632|3232->1752|3280->1778|3333->1800|3378->1823|3431->1845|3478->1870|3531->1892|3573->1912|3686->1994|3704->2003|3717->2007|3728->2031|3764->2058|3799->2060|3902->2132|3917->2138|3973->2172|4007->2175|4024->2183|4051->2188|4158->2264|4175->2272|4234->2322|4269->2324|4315->2337|4447->2438|4464->2446|4525->2498|4560->2500|4606->2513|4738->2614|4754->2621|4785->2643|4820->2645|4865->2658|4984->2762|5139->2886|5159->2897|5177->2906|5220->2916|5324->2989|5356->2999|5441->3065|5460->3075|5495->3077|5665->3215|5769->3288|5815->3312|5851->3317|5911->3354|5948->3359|5969->3370|5998->3376|6073->3420|6093->3431|6111->3440|6154->3450|6258->3523|6290->3533|6371->3595|6390->3605|6425->3607|6591->3741|6658->3789|6678->3799|6714->3801|6852->3907|6896->3919
                    LINES: 19->1|21->16|21->16|23->16|24->17|24->17|24->17|24->17|24->17|25->18|25->18|25->18|25->18|27->6|27->6|33->1|35->5|36->11|38->15|39->20|41->22|41->22|41->22|43->24|43->24|45->26|45->26|45->26|45->26|47->28|47->28|49->30|53->34|53->34|53->34|53->34|54->35|54->35|56->37|58->39|58->39|58->39|62->43|62->43|62->43|62->43|67->48|67->48|68->49|68->49|69->50|69->50|70->51|70->51|75->56|75->56|75->56|75->57|75->57|75->57|77->59|77->59|77->59|77->59|77->59|77->59|79->61|79->61|79->61|79->61|79->61|82->64|82->64|82->64|82->64|82->64|85->67|85->67|85->67|85->67|85->67|88->71|95->78|95->78|95->78|95->78|97->80|97->80|99->82|99->82|99->82|103->86|105->88|105->88|105->88|105->88|105->88|105->88|105->88|107->90|107->90|107->90|107->90|109->92|109->92|111->94|111->94|111->94|115->98|119->102|119->102|119->102|125->108|128->111
                    -- GENERATED --
                */
            