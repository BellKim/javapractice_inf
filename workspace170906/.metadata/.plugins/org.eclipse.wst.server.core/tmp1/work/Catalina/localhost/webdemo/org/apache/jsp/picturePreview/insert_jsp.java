/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-24 08:16:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.picturePreview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("<!--style-->\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<!--script-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t//이미지 선택후 서브밋 가능하도록  함수 구성. \r\n");
      out.write("\t\t\t$('form').on('submit',function(){\r\n");
      out.write("\t\t\t\tvar str=$('#filepath').val();//인풋속성이기 때문에 value가 적용가능하다. 파일경로가 없으면 진행되지 않도록한다. \r\n");
      out.write("\t\t\t\tif(str.length<1){\r\n");
      out.write("\t\t\t\t\talert('이미지를선택하시죠 ');\r\n");
      out.write("\t\t\t\t\tconsole.log(str);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});/////////////////////////////////\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#filepath').on('change', function(){\r\n");
      out.write("\t\t\t\tvar str=$('#filepath').val();\r\n");
      out.write("\t\t\t\tvar patt=/(.jpg$|.gif$|.png$)/g; //$ 끝,  |~거나(or),  \r\n");
      out.write("\t\t\t\tvar result=str.match(patt);\r\n");
      out.write("\t\t\t\tif(!result){\r\n");
      out.write("\t\t\t\t\talert('jpg, gif, png만 가능합니다. ');\r\n");
      out.write("\t\t\t\t\tconsole.log(str);\r\n");
      out.write("\t\t\t\t\t//형식에 맞지안헥 입력된 파일명 초기화시킴. \r\n");
      out.write("\t\t\t\t\t$('#filepath').val('');\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t/* ArrayList List = new ArrayList();\r\n");
      out.write("\t\t\t\tlist && list.get(0); */\r\n");
      out.write("\t\t\t\tif(this.files && this.files[0]){\r\n");
      out.write("\t\t\t\t\tif(this.files[0].size>1000000){\r\n");
      out.write("\t\t\t\t\t\talert(\"1 MBBB 이하만 첨부할수 있습니다. \");\r\n");
      out.write("\t\t\t\t\t\t$('#filepath').val('');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//파일을 읽기 위한 filereader 객체 생성. 자바 아니야. 착각하지마\r\n");
      out.write("\t\t\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\t\t\t//File내용을 읽어 dataURL 형식의 문자열로 저장. \r\n");
      out.write("\t\t\t\t\treader.readAsDataURL(this.files[0]);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//파일 읽어들이기를 성공했을 때 호출되는 이벤트 핸들러 \r\n");
      out.write("\t\t\t\t\treader.onload=function(e){\r\n");
      out.write("\t\t\t\t\t\t//dlalwl tag의 src속성에 읽어들인 file 내용을 지정. \r\n");
      out.write("\t\t\t\t\t\t$('img').attr('src', e.target.result);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});/////////////////////////////////\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<!-- input 요소의 type 속성의 값이 \"file\"이면 method=\"post\" enctype=\"multipart/form-data\" 로 설정해야한다. -->\r\n");
      out.write("\t\t<form name=\"frm\" action=\"insertMain\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 추가 2번째 수업으로 넘어감. 서버로 보내기전에 프리뷰로 이미지를 보여준다. ㄴ-->\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<img width=\"100\" height=\"100\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 인풋파입이 컴부파일이 있으면 멀티파트폼데이터로해야하고 메소드 속성은 포스트로 해줘야한다.  -->\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<span> 파일 </span>\r\n");
      out.write("\t\t\t\t<input type=\"file\" name=\"filepath\" id=\"filepath\"/>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"commit\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
