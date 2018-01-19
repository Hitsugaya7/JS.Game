import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

public class FirstServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String lng = req.getParameter("lang");
        Locale locale = new Locale("ru", "");
        if(lng != null){
            locale = new Locale(lng, "");
        }
        ResourceBundle bundle = ResourceBundle.getBundle("local", locale);

        String value = getInitParameter("build");
        String build1="", build2="", build3="";
        if(new String(value).equals("1") == true){
            build1 = "block";
            build2 = "none";
            build3 = "none";
        }
        if(new String(value).equals("2") == true){
            build1 = "none";
            build2 = "block";
            build3 = "none";
        }
        if(new String(value).equals("3") == true){
            build1 = "none";
            build2 = "none";
            build3 = "block";
        }
        /////////////////////////////////
        String value1 = getInitParameter("fot");
        String fot1="", fot2="", fot3="";
        if(new String(value1).equals("11") == true){
            fot1 = "block";
            fot2 = "none";
            fot3 = "none";
        }
        if(new String(value1).equals("22") == true){
            fot1 = "none";
            fot2 = "block";
            fot3 = "none";
        }
        if(new String(value1).equals("33") == true){
            fot1 = "none";
            fot2 = "none";
            fot3 = "block";
        }
        String id="1";

        out.println("<html>\n" +
                "\t<head>\n" +
                "\t\t<title></title>\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\t\t\tfunction show(n){\n" +
                "\t\t\t\tif(n == 1){\n" +
                "\t\t\t\t\tdocument.getElementById('tab1').style.display = 'block';\n" +
                "\t\t\t\t\tdocument.getElementById('tab2').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('tab3').style.display = 'none';\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tif(n == 2){\n" +
                "\t\t\t\t\tdocument.getElementById('tab1').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('tab2').style.display = 'block';\n" +
                "\t\t\t\t\tdocument.getElementById('tab3').style.display = 'none';\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tif(n == 3){\n" +
                "\t\t\t\t\tdocument.getElementById('tab1').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('tab2').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('tab3').style.display = 'block';\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tif(n == 11){\n" +
                "\t\t\t\t\tdocument.getElementById('fo1').style.display = 'block';\n" +
                "\t\t\t\t\tdocument.getElementById('fo2').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('fo3').style.display = 'none';\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tif(n == 22){\n" +
                "\t\t\t\t\tdocument.getElementById('fo1').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('fo2').style.display = 'block';\n" +
                "\t\t\t\t\tdocument.getElementById('fo3').style.display = 'none';\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tif(n == 33){\n" +
                "\t\t\t\t\tdocument.getElementById('fo1').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('fo2').style.display = 'none';\n" +
                "\t\t\t\t\tdocument.getElementById('fo3').style.display = 'block';\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t</script>\n" +
                "\t\t<style type=\"text/css\">\n" +
                "body\n" +
                "{\n" +
                "\tbackground-image: url('https://i.pinimg.com/736x/9c/4f/73/9c4f7306ba1cf7aca55d3b69ee8e937d--scrapbooking-set-of.jpg');\n" +
                "}\n" +
                "#divleft\n" +
                "{\n" +
                "\tfloat: left;\n" +
                "\tmargin-left: 5px;\n" +
                "\tmargin-top:55px;\n" +
                "\t\n" +
                "}\n" +
                "#divmain\n" +
                "{\n" +
                "\tmargin:50px 100px;\n" +
                "\tborder: 1px solid #060606;\n" +
                "\theight: 453px;\n" +
                "\twidth: 1240px;\n" +
                "\tbackground-color: #C114E6;\n" +
                "\t\n" +
                "\n" +
                "}\n" +
                "#divmainfoto\n" +
                "{\n" +
                "\tfloat: left;\n" +
                "\tmargin-left: 10px;\n" +
                "\tmargin-top: 3px;\n" +
                "}\n" +
                "\n" +
                ".foto\n" +
                "{\n" +
                "\tborder:3px solid #C5C5C5;\n" +
                "}\n" +
                "\n" +
                "#addtobusket\n" +
                "{\n" +
                "\tfloat: right;\n" +
                "\twidth: 100px;\n" +
                "\tbackground-color: #0B0B0B;\n" +
                "\tcolor:white;\n" +
                "\theight: 40px;\n" +
                "}\n" +
                "#nameofgods\n" +
                "{\n" +
                "\tmargin-top: 20px;\n" +
                "\tfont-family: 'Century Gothic', 'gothic', sans-serif;\n" +
                "\tfont-weight: bold;\n" +
                "\tfont-size: 30px;\n" +
                "\tmargin-left: 532px;\n" +
                "\tbackground-color: #E4FF00;\n" +
                "\twidth: 520px;\n" +
                "\tpadding: 15px 89px;\n" +
                "\tcolor:#269714;\n" +
                "\tborder-radius: 15px;\n" +
                "}\n" +
                ".tabs_box\n" +
                "{\n" +
                "\tmargin-left: 532px;\n" +
                "\twidth: 700px;\n" +
                "\tbackground: #BBBBBB;\n" +
                "\theight: 300px;\n" +
                "\tmargin-top: 33px;\n" +
                "\tborder-radius: 10px;\n" +
                "\t\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".tab-h\n" +
                "{\n" +
                "\tdisplay: table-cell;\n" +
                "\tborder:2px solid #0024FF;\n" +
                "\tpadding:10px 0px;\n" +
                "\twidth: 300px;\n" +
                "\ttext-align: center;\n" +
                "\tbackground-color: #EE0C0C;\n" +
                "\tcolor:#13E470;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".tabs-body\n" +
                "{\n" +
                "\tdisplay: table;\n" +
                "\tborder-left: 2px solid #0024FF;\n" +
                "\tborder-right : 2px solid #0024FF;\n" +
                "\tborder-bottom: 2px solid #0024FF;\n" +
                "\theight: 296px;\n" +
                "\twidth: 697px;\n" +
                "\tbackground-color: #FEFB00;\n" +
                "\tcolor: #FC0295;\n" +
                "\tposition: relative;\n" +
                "\tz-index: 1;\n" +
                "\t\n" +
                "}\n" +
                ".tab-b\n" +
                "{\n" +
                "\tdisplay: none;\n" +
                "\tmargin-top: 10px;\n" +
                "\n" +
                "}\n" +
                ".df\n" +
                "{\n" +
                "\tdisplay: none;\n" +
                "\n" +
                "}\n" +
                ".tabs\n" +
                "{\n" +
                "\tmargin-left:532px;\n" +
                "\tmargin-right: 8px;\n" +
                "}\n" +
                ".active\n" +
                "{\n" +
                "\tborder-bottom: 2px dashed white;\t\n" +
                "}\n" +
                ".tabs-header\n" +
                "{\n" +
                "\tposition: relative;\n" +
                "\tz-index: 2;\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".select\n" +
                "{\n" +
                "\tbackground-color: #0DFD07;\n" +
                "\tpadding: 3px 15px;\n" +
                "\tfont-family: 'Century Gothic', 'gothic', sans-serif;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".size\n" +
                "{\n" +
                "\tfloat:left;\n" +
                "\tborder:1px solid #9E9E9E;\n" +
                "\ttext-align: center;\n" +
                "\tpadding-top: 5px;\n" +
                "\tpadding-bottom: 5px;\n" +
                "\tbackground-color: white;\n" +
                "\twidth: 40px;\n" +
                "}\n" +
                "\n" +
                ".size:hover\n" +
                "{\n" +
                "\tbackground-color: #FF0285;\n" +
                "\tcolor:black;\n" +
                "\tcursor: pointer;\n" +
                "}\n" +
                "\t\t</style>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\n" +
                "\t\t<div id=\"divmain\">\n" +
                "\t\t\t<div>\n" +
                "\t\t\t\t<form>\n" +
                "\t\t\t\t\t<select class=\"select\" name=\"lang\" id=\"lan\">\n" +
                "\t\t\t\t\t\t<option value=\"ru\">"+bundle.getString("rus_lang")+"</option>\n" +
                "\t\t\t\t\t\t<option value=\"en\">"+bundle.getString("eng_lang")+"</option>\n" +
                "\t\t\t\t\t\t<option value=\"de\">"+bundle.getString("deu_lang")+"</option>\n" +
                "\t\t\t\t\t</select>\n" +
                "\t\t\t\t\t<button type=\"submit\">"+bundle.getString("change")+"</button>\n" +
                "\t\t\t\t\t<button type=\"\" id=\"addtobusket\">"+bundle.getString("basket")+"</button>\n" +
                "\t\t\t\t</form>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div id=\"divleft\">\n" +
                "\t\t\t\t<div ><img src=\"1.jpg\" class=\"foto\" onclick=\"show(11)\" width=\"100\" height=\"100\"></div>\n" +
                "\t\t\t\t<div ><img src=\"2.jpg\" class=\"foto\" onclick=\"show(22)\"width=\"100\" height=\"100\"></div>\n" +
                "\t\t\t\t<div ><img src=\"3.jpg\" class=\"foto\" onclick=\"show(33)\" width=\"100\" height=\"100\"></div>\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t<div id=\"divmainfoto\">\n" +
                "\t\t\t\t<div id=\"fo1\" class=\"df\" style=\"display: "+fot1+"\"><img src=\"1.jpg\" class=\"foto\" width=\"400\" height=\"400\"></div>\n" +
                "\t\t\t\t<div id=\"fo2\" class=\"df\" style=\"display: "+fot2+"\"><img src=\"2.jpg\" class=\"foto\" width=\"400\" height=\"400\"></div>\n" +
                "\t\t\t\t<div id=\"fo3\" class=\"df\" style=\"display: "+fot3+"\"><img src=\"3.jpg\" class=\"foto\" width=\"400\" height=\"400\"></div>\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t<div id=\"nameofgods\">"+bundle.getString("ring")+"</div>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t<div class=\"tabs\">\n" +
                "\t\t\t\t<div class=\"tabs-header\">\n" +
                "\t\t\t\t\t<div class=\"tab-h\"  onclick=\"show(1)\">" + bundle.getString("des") + "</div>\n" +
                "\t\t\t\t\t<div class=\"tab-h\"  onclick=\"show(2)\">" + bundle.getString("char") + "</div>\n" +
                "\t\t\t\t\t<div class=\"tab-h\"  onclick=\"show(3)\">"+bundle.getString("rev")+"</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<div class=\"tabs-body\">\n" +
                "\t\t\t\t\t<div class=\"tab-b\" id=\"tab1\" style=\"display:" + build1 + "\">\n" +
                "\t\t\t\t\t\t"+bundle.getString("ring")+"\n" +
                "\t\t\t\t\t\t<p><a href=\"https://www.gold585.ru/upload/pdf/size_585.pdf\" target=\"_blank\">"+bundle.getString("size")+"</a> </p>\n" +
                "\t\t\t\t\t\t<div class=\"size\">16.5</div>\n" +
                "\t\t\t\t\t\t<div class=\"size\">17</div>\n" +
                "\t\t\t\t\t\t<div class=\"size\">17.5</div>\n" +
                "\t\t\t\t\t\t<div class=\"size\">18.5</div>\n" +
                "\t\t\t\t\t\t<div class=\"size\">19</div>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t<div class=\"tab-b\" id=\"tab2\" style=\"display:" + build2 + "\">\n" +
                "\t\t\t\t\t\t<p>"+bundle.getString("product")+": "+bundle.getString("ring")+"</p>\n" +
                "\t\t\t\t\t\t<p>"+bundle.getString("prod_weight")+": 1.69</p>\n" +
                "\t\t\t\t\t\t<p>"+bundle.getString("try")+": 585</p>\n" +
                "\t\t\t\t\t\t<p>"+bundle.getString("insert")+": "+bundle.getString("garnet")+"</p>\n" +
                "\t\t\t\t\t\t<p>"+bundle.getString("insertion_w")+": 0,9410</p>\n" +
                "\t\t\t\t\t\t<p>"+bundle.getString("insertion_d") +": 7*5</p>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t<div class=\"tab-b\" id=\"tab3\" style=\"display:" + build3 + "\">\n" +
                "\t\t\t\t\t\t"+bundle.getString("rev_1"+id)+","+bundle.getString("rev_2")+","+bundle.getString("rev_3")+", "+bundle.getString("rev_4")+"\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\t\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t</body>\n" +
                "</html>\n" +
                "\n");
    }
}
