/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2015-11-07 23:21:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.Integer;
import java.util.*;
import java.lang.String;
import edu.bu.cs.cs460.photoshare.NewTagDao;
import edu.bu.cs.cs460.photoshare.CommentUnderPicDao;
import edu.bu.cs.cs460.photoshare.PictureDao;
import edu.bu.cs.cs460.photoshare.HasPicturesDao;
import edu.bu.cs.cs460.photoshare.HasAlbumsDao;
import edu.bu.cs.cs460.photoshare.HasTagsDao;
import edu.bu.cs.cs460.photoshare.NewUserDao;

public final class processmultitags_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.HasPicturesDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewTagDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.HasTagsDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.CommentUnderPicDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.PictureDao");
    _jspx_imports_classes.add("java.lang.String");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewUserDao");
    _jspx_imports_classes.add("java.lang.Integer");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>Process Conjunctive Tag Search</title></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2> Here are all the pictures that contains all the tags </h2>\n");
      out.write("\n");
 
  String err = null;
	boolean process = false;
	String inputTags = request.getParameter("tagString");
	String tempTags = request.getParameter("tagString");
	
	// Convert all tags to lowercase
	inputTags = inputTags.toLowerCase();
	tempTags = tempTags.toLowerCase();
	
	List<String> tagNames = new ArrayList<String>();
	
	while(tempTags.indexOf(' ') != -1) {
		int i = tempTags.indexOf(' ');
		tagNames.add(tempTags.substring(0, i));
		tempTags = tempTags.substring(i+1);
	}
	tagNames.add(tempTags);
	
	
	NewTagDao newTagDao = new NewTagDao();	
		
	// test through all the tag name see if all are valid		
	for(int i = 0; i < tagNames.size(); i++) {
		if (newTagDao.getTagId(tagNames.get(i)) <= 0) {
			err = "Invalid input tag name";
			break;
		}
	}
	
	HasPicturesDao hasPicturesDao = new HasPicturesDao();
	HasTagsDao hasTagsDao = new HasTagsDao();
	int tid1 = newTagDao.getTagId(tagNames.get(0));
	List<Integer> pids = hasTagsDao.allPicId(tid1);
	
	for (int i = 1; i < tagNames.size(); i ++) {
		int tempTid = newTagDao.getTagId(tagNames.get(i));
		for (int j = 0; j < pids.size(); j ++) {
			if (!hasTagsDao.pidExistInTid((int)(pids.get(j)),tempTid)) {
				pids.remove(j);
				j --;
			}
		}
	}
	
	process = true;

      out.write('\n');
      out.write('\n');
      out.write('\n');
 if (err != null) { 
      out.write("\n");
      out.write("<font color=red><b>Error: ");
      out.print( err );
      out.write("</b></font>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
 
	if (process) {  
		for (Integer pid : pids) {
			int aid = hasPicturesDao.getAlbumId(pid);

      out.write("\n");
      out.write("        \t\t<tr>\n");
      out.write("       \t\t \t\t<td><a href=\"/photoshare/displayPicture.jsp?picture_id=");
      out.print(pid);
      out.write("?album_id=");
      out.print(aid);
      out.write("\">\n");
      out.write("            \t\t<img src=\"/photoshare/img?t=1&picture_id=");
      out.print(pid);
      out.write("\"/></a>\n");
      out.write("        \t\t\t</td>\n");
      out.write("                </tr>\n");
	
		}
	}

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
 
	if((!process) && (err == null)) { 
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h2>Failed...</h2>\n");
      out.write("\n");
      out.write("\t\t<p>Please try again!</p>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("\n");
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