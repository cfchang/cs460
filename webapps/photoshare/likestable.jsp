<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.Integer" %>
<%@ page import="java.lang.util.*" %>
<%@ page import="java.lang.String" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewTagDao" %>
<jsp:useBean id="newTagBean"
             class="edu.bu.cs.cs460.photoshare.NewTagBean" />
<jsp:setProperty name="newTagBean" property="*"/>

<%@ page import="edu.bu.cs.cs460.photoshare.CommentUnderPicDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.PictureDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.HasPicturesDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewLikeDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewUserDao" %>

<html>
<head><title>like Picture</title></head>

<body>

<!--
    1. Get the picture_id and user_id
    2. insert into Likes relational table
--> 

<%  boolean ownPic = true;
    boolean insertLike = false;
    String err = null; 
    String tempPId = request.getParameter("picture_id");
    int pictureId = Integer.parseInt(tempPId);
    NewUserDao newUserDao = new NewUserDao();
    int uid = newUserDao.getID(request.getUserPrincipal().getName());
    
    NewLikeDao newLikeDao = new NewLikeDao();
    newLikeDao.create(pictureId, uid);
    insertLike = true;
    
    int count=newLikeDao.getLikeCount(pictureId);
%>

<% if (err != null) { %>
<font color=red><b>Error: <%= err %></b></font>
<% } %>

<% if (!insertLike) { %>

<% }
   else { %>

<h2>Success! Add a user like to the likes table on the picture!</h2>
<h2>There is the likes count (<%= count %>) on this picture!</h2>

<h2>Some users also like this Picture</h2>

<!-- display all the users like this picture -->

<table>
        <% 
            List<String> userIdnames = newLikeDao.getLikeUserName(pictureId);
            
            for (String userName : userIdnames) {
	%>
                <tr>
       		    <td><%=userName%></td>
                </tr>
       	<%		
            }
        %>
</table>

<% } %>

<h4>Return to <a href="newalbum.jsp">Album and Picture Page</a></h4>
<h4>Return to <a href="index.jsp">Home Page</a></h4>
<h4>Return to <a href="main.jsp">Main Page</a></h4>

</body>
</html>
