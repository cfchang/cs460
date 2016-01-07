<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewUserDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.HasPicturesDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewAlbumDao" %>

<html>
<head><title>List All Albums</title></head>

<body>
<h2>List of All Albums (registered and anonymous users)</h2>

<table>
    <tr>
        <%  
	    //NewUserDao newUserDao = new NewUserDao();
	    //int myID = newUserDao.getID(request.getUserPrincipal().getName());
	    
	    NewAlbumDao albumsDao = new NewAlbumDao();
            List<Integer> allAlbumIds = albumsDao.allAlbumsIds();
            for (Integer AlbumId : allAlbumIds) {
		String temp = albumsDao.getAlbumName(AlbumId);
        %>
               	<a href="displayPictureInAlbum2.jsp?AlbumId=<%=AlbumId%>"> <%=temp%></a><br/>
        <%} %>
    </tr>
</table>
        
<h4>Return to<a href="index.jsp">Home Page</a></h4>
<h4>Return to<a href="main.jsp">Main Page</a></h4>
        
</body>
</html>
