/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-22 18:21:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1461348808000L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1461348817000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"de\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>BIG Bid - Anmelden</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/styles/style.css\">\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources//scripts/jquery.js\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources//scripts/framework.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body data-decimal-separator=\",\" data-grouping-separator=\".\">\n");
      out.write("\n");
      out.write("<a href=\"#productsheadline\" class=\"accessibility\">Zum Inhalt springen</a>\n");
      out.write("\n");
      out.write("<header aria-labelledby=\"bannerheadline\">\n");
      out.write("  <img class=\"title-image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/big-logo-small.png\" alt=\"BIG Bid logo\">\n");
      out.write("\n");
      out.write("  <h1 class=\"header-title\" id=\"bannerheadline\">\n");
      out.write("    BIG Bid\n");
      out.write("  </h1>\n");
      out.write("  <nav aria-labelledby=\"navigationheadline\">\n");
      out.write("    <h2 class=\"accessibility\" id=\"navigationheadline\">Navigation</h2>\n");
      out.write("    <ul class=\"navigation-list\">\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"main-container\">\r\n");
      out.write("    <main aria-labelledby=\"formheadline\">\r\n");
      out.write("        <form class=\"form\" method=\"post\" action=\"login\">\r\n");
      out.write("            <h2 id=\"formheadline\" class=\"registration-headline\">Anmelden</h2>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <label class=\"form-label\" for=\"email-input\">\r\n");
      out.write("                    Email\r\n");
      out.write("                </label>\r\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email-input\" required class=\"form-input\">\r\n");
      out.write("                <span id=\"email-error\" class=\"error-text\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <label class=\"form-label\" for=\"password-input\">\r\n");
      out.write("                    Passwort\r\n");
      out.write("                </label>\r\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password-input\" required class=\"form-input\" minlength=\"4\"\r\n");
      out.write("                       maxlength=\"12\">\r\n");
      out.write("                <span id=\"password-error\" class=\"error-text\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-row form-row-center\">\r\n");
      out.write("                <button class=\"button button-submit\">\r\n");
      out.write("                    Anmelden\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </main>\r\n");
      out.write("</div>\r\n");
      out.write("<footer>\n");
      out.write("  &copy; 2016 BIG Bid\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/scripts/bigBid.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/header.jsp(25,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("      <li>\n");
        out.write("        <form action=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/logout\" method=\"post\">\n");
        out.write("          <input class=\"button\" type=\"submit\" value=\"Logout\" accesskey=\"l\" />\n");
        out.write("          </form>\n");
        out.write("      </li>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
