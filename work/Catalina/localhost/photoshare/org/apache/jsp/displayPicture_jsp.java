/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2015-11-07 23:17:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.Integer;
import java.lang.String;
import edu.bu.cs.cs460.photoshare.NewUserDao;
import edu.bu.cs.cs460.photoshare.HasPicturesDao;
import edu.bu.cs.cs460.photoshare.NewAlbumDao;
import edu.bu.cs.cs460.photoshare.NewTagDao;
import edu.bu.cs.cs460.photoshare.HasTagsDao;
import edu.bu.cs.cs460.photoshare.PictureDao;
import java.lang.Integer;
import edu.bu.cs.cs460.photoshare.NewCommentDao;
import edu.bu.cs.cs460.photoshare.CommentUnderPicDao;
import edu.bu.cs.cs460.photoshare.HasAlbumsDao;

public final class displayPicture_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.PictureDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewCommentDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.CommentUnderPicDao");
    _jspx_imports_classes.add("edu.bu.cs.cs460.photoshare.NewAlbumDao");
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
      edu.bu.cs.cs460.photoshare.NewCommentBean newCommentBean = null;
      newCommentBean = (edu.bu.cs.cs460.photoshare.NewCommentBean) _jspx_page_context.getAttribute("newCommentBean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (newCommentBean == null){
        newCommentBean = new edu.bu.cs.cs460.photoshare.NewCommentBean();
        _jspx_page_context.setAttribute("newCommentBean", newCommentBean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("newCommentBean"), request);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>Display Signal Picture</title></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Picture</h2>\n");
      out.write("\n");
   String tempPid = request.getParameter("picture_id");
	int pid, aid;
	if (tempPid.indexOf('=') > 0) {
		String pidS = "";
		int i;
    	for(i = 0; i < tempPid.length(); i ++) {
			if(tempPid.charAt(i) == '?'){
				break;
			}
			pidS = pidS + "" + tempPid.charAt(i);
		}
		pid = Integer.parseInt(pidS);

		String tempAid = tempPid.substring(i+1);
		for(i = 0; i < tempAid.length(); i++) {
			if(tempAid.charAt(i) == '=') {
				break;
			}
		}
		aid = Integer.parseInt(tempAid.substring(i+1));
	}else {
		pid = Integer.parseInt(tempPid);
		HasPicturesDao hasPictureDao = new HasPicturesDao();
		aid = hasPictureDao.getAlbumId(pid);
	}

      out.write("\n");
      out.write("    \n");
      out.write("<img src=\"/photoshare/img?t=1&picture_id=");
      out.print(pid);
      out.write("\"/>\n");
      out.write("\n");
      out.write("<h4>I want to <a href=\"newcomment.jsp?picture_id=");
      out.print(pid);
      out.write("\">comment</a></h4>\n");
 
	if(request.getUserPrincipal() != null) { 

      out.write("\n");
      out.write("\t    <h4>I want to <a href=\"newtag.jsp?picture_id=");
      out.print(pid);
      out.write("\">tag</a> picture</h4>\n");
      out.write("\t    <h4>I want to <a href=\"deletepicture.jsp?picture_id=");
      out.print(pid);
      out.write("?album_id=");
      out.print(aid);
      out.write("\">delete</a> this picture</h4>\n");
      out.write("\t    \n");
      out.write("\t    <!-- add new code to add the like tag to the picture (11/1/2015) -->\n");
      out.write("\t    <!-- <h4>I <a href=\"liketag.jsp?picture_id=");
      out.print(pid);
      out.write("\">like </a> this picture (Add new tag)</h4> -->\n");
      out.write("\t    <h4>I <a href=\"likestable.jsp?picture_id=");
      out.print(pid);
      out.write("\">like </a> this picture (Add to likes table)</h4>\n");
	} 
      out.write("\n");
      out.write("\n");
      out.write("<!-- add code to display all the comment under this photo -->\n");
      out.write("\n");
      out.write("<h2>Comments On This Picture</h2>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("        ");
 
	    NewUserDao newUserDao = new NewUserDao();
	    NewCommentDao newComDao = new NewCommentDao();
	    CommentUnderPicDao comUndPicDao = new CommentUnderPicDao();
            List<Integer> comIds = comUndPicDao.allComsId(pid);
			
            for (Integer comId : comIds) {
		String tempText = newComDao.getText(comId);
		// 11/3/2015
		String tempDate = newComDao.getDate(comId);
		
		int tempOwnerID = newComDao.getOwnerId(comId);
		String tempEmail = "";
		if (tempOwnerID >= 0) {
			tempEmail = newUserDao.getUsersName(tempOwnerID);
		} else {
			tempEmail = "Non-Register User";
		}
	
      out.write("\n");
      out.write("            <tr>\n");
      out.write("       \t\t<td><p>");
      out.print(tempText);
      out.write(" (left at ");
      out.print(tempDate);
      out.write(")</p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><prep>\n");
      out.write("                <td><p>Commented By: ");
      out.print(tempEmail);
      out.write("</p></td>\n");
      out.write("\t\t\t</tr></pre>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<h2>Tags on This Picture</h2>\n");
      out.write("\n");
      out.write("<!-- display all the existing tag belongs to this picture -->\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("        ");
 
	    NewTagDao newTagDao = new NewTagDao();
	    HasTagsDao hasTagsDao = new HasTagsDao();
            List<Integer> tagIds = hasTagsDao.allTId(pid);
            for (Integer tagId : tagIds) {
		String tagName = newTagDao.getTagName(tagId); 
	
      out.write("\n");
      out.write("        \t<tr>\n");
      out.write("       \t\t \t<td><a href=\"displayPicTagName.jsp?tag_Id=");
      out.print(tagId);
      out.write('"');
      out.write('>');
      out.print(tagName);
      out.write("</a></td>\n");
      out.write("                </tr>\n");
      out.write("       \t");
		
            }
        
      out.write("\n");
      out.write("</table>\n");
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
