/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2015-11-05 22:49:06 UTC
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
import edu.bu.cs.cs460.photoshare.NewCommentDao;
import edu.bu.cs.cs460.photoshare.ValuableUser;

public final class topusers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewCommentDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.ValuableUser");
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
      out.write("\n");
      out.write("\n");
      out.write("<!-- \n");
      out.write("  1. for each uid \n");
      out.write("    2. obtain # of comment from top_com_users view\n");
      out.write("    3. obtain # of picture from going through each album uid owns\n");
      out.write("    \tand add up from num_pic_counts view \n");
      out.write("    4. insert into table TopUsers with uid and (2+3)\n");
      out.write("    5. select top 10 from TopUsers table\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<head><title>Top 10 Users</title></head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2> List of Top 10 Users </h2>\n");
      out.write("\n");

	NewUserDao newUserDao = new NewUserDao();
	NewCommentDao newCommentDao = new NewCommentDao();
	HasPicturesDao hasPicturesDao = new HasPicturesDao();
	ValuableUser valuableUser = new ValuableUser();
	
	valuableUser.deleteAll();
	
	List<Integer> uids = newUserDao.getAllUId();
	for(Integer uid : uids) {
		String user_name = newUserDao.getUsersName(uid);
		int totCom = newCommentDao.getTotalCom(uid);
		int totPic = hasPicturesDao.getTotalPic(uid);
		valuableUser.create(uid, totCom + totPic);
	}
	
	List<Integer> rankUIds = valuableUser.getRank();
	if(rankUIds.size() < 10){
		for(int i = 0; i < rankUIds.size(); i++) {
			int rankUId1 = rankUIds.get(i);
			String user_name1 = newUserDao.getUsersName(rankUId1);

      out.write("\n");
      out.write("    \t\t<h4>Rank ");
      out.print(i+1);
      out.write(". <a href=\"listuseralbum.jsp?user_id=");
      out.print(rankUId1);
      out.write('"');
      out.write('>');
      out.print(user_name1);
      out.write("</a></h4> \n");
      out.write("\n");

		}
	} else {
		int j = 0;
		for(Integer rankUId2 : rankUIds) {
			if(j < 10) {
				String user_name2 =  newUserDao.getUsersName(rankUId2);

      out.write("\n");
      out.write("\t\t\t\t<h4>Rank ");
      out.print((j+1));
      out.write(". <a href=\"listuseralbum.jsp?user_id=");
      out.print(rankUId2);
      out.write('"');
      out.write('>');
      out.print(user_name2);
      out.write("</a></h4>\n");

				j ++;
			} else{ 
				break; 
			}
		}
	}

      out.write("\t\t\t\n");
      out.write("\n");
      out.write("<h4>Return to <a href=\"index.jsp\">Home Page</a></h4>\n");
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