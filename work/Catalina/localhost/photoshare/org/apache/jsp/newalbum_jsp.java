/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2015-11-05 22:13:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.servlet.*;
import java.lang.*;
import edu.bu.cs.cs460.photoshare.NewUserDao;
import edu.bu.cs.cs460.photoshare.NewAlbumDao;
import edu.bu.cs.cs460.photoshare.HasAlbumsDao;

public final class newalbum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.lang");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewAlbumDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewUserDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.HasAlbumsDao");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      edu.bu.cs.cs460.photoshare.NewUserBean newUserBean = null;
      newUserBean = (edu.bu.cs.cs460.photoshare.NewUserBean) _jspx_page_context.getAttribute("newUserBean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (newUserBean == null){
        newUserBean = new edu.bu.cs.cs460.photoshare.NewUserBean();
        _jspx_page_context.setAttribute("newUserBean", newUserBean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("newUserBean"), request);
      out.write('\n');
      out.write('\n');
      out.write('\n');
      edu.bu.cs.cs460.photoshare.NewAlbumBean newAlbumBean = null;
      newAlbumBean = (edu.bu.cs.cs460.photoshare.NewAlbumBean) _jspx_page_context.getAttribute("newAlbumBean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (newAlbumBean == null){
        newAlbumBean = new edu.bu.cs.cs460.photoshare.NewAlbumBean();
        _jspx_page_context.setAttribute("newAlbumBean", newAlbumBean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("newAlbumBean"), request);
      out.write('\n');
      out.write('\n');
      out.write('\n');
      edu.bu.cs.cs460.photoshare.HasAlbumsBean hasAlbumsBean = null;
      hasAlbumsBean = (edu.bu.cs.cs460.photoshare.HasAlbumsBean) _jspx_page_context.getAttribute("hasAlbumsBean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (hasAlbumsBean == null){
        hasAlbumsBean = new edu.bu.cs.cs460.photoshare.HasAlbumsBean();
        _jspx_page_context.setAttribute("hasAlbumsBean", hasAlbumsBean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("hasAlbumsBean"), request);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>Album and Pictures</title></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Create a New Album </h2>\n");
      out.write("\n");
      out.write("<form action=\"/photoshare/createnewalbum.jsp?NewAlbumName=\" target=\"_self\" method=\"get\">\n");
      out.write("  Album Name: <input type=\"text\" name=\"NewAlbumName\"/>\n");
      out.write("  <input type=\"submit\" value=\"Create\"/><br/>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<h2>Delete an Album</h2>\n");
      out.write("\n");
      out.write("<form action=\"/photoshare/deletealbum.jsp?deleteAlbumName=\" target=\"_self\" method=\"get\">\n");
      out.write(" Album Name: <input type=\"text\" name=\"deleteAlbumName\"/>\n");
      out.write("         <input type=\"submit\" value=\"Delete\"/><br/>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<h2>Upload Picture to an Album</a></h2>\n");
      out.write("\n");
      out.write("<form action=\"/photoshare/uploadpicture.jsp?upLoadPicAlbumName=\" target=\"_self\" method=\"get\">\n");
      out.write(" Album Name: <input type=\"text\" name=\"upLoadPicAlbumName\"/>\n");
      out.write("       \t<input type=\"submit\" value=\"Go\"/><br/>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<form action=\"/photoshare/listallalbums.jsp\" target=\"_self\"> \n");
      out.write("\t<input type=\"submit\" value=\"List of Albums\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<h4>Return to <a href=\"index.jsp\">Home Page</a></h4>\n");
      out.write("<h4>Return to <a href=\"main.jsp\">Main Page</a></h4>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
