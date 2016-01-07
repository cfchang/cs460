<%@ page import="edu.bu.cs.cs460.photoshare.Picture" %>
<%@ page import="edu.bu.cs.cs460.photoshare.PictureDao" %>
<%@ page import="org.apache.commons.fileupload.FileUploadException" %>
<%@ page import="java.util.List" %>

<%@ page import="edu.bu.cs.cs460.photoshare.HasPicturesDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewUserDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.IsFriendsDao" %>
<%@ page import="edu.bu.cs.cs460.photoshare.NewAlbumDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head><title>Photo sharing</title></head>

<body>
<h1>Photo Sharing</h1>

<%
  if (request.getUserPrincipal() == null) {
	
%>

Hello you are browsing as a non-register user</a>

<%-- list all albums for non-register user 11/4/2015 --%>

<h3><a href="listallalbums2.jsp">View All Albums and Pictures</a></h3>

<h3><a href="displayAllPicture.jsp">Comment and View All Pictures</a></h3>

<h3><a href="topusers.jsp">Top 10 Users</a></h3>

<h3><a href="searchTag.jsp">View Photos with a Specific Tag</a></h3>

<h3><a href="populartag.jsp">View Most Popular Tag</a></h3>

<h3><a href="searchmultitags.jsp?id=1">Search with Conjunctive Tag</a></h3>

<%	
	} else {
	
%>
	
<h3><a href="/photoshare/searchfriend.jsp">Search and Add Friend</a></h3>

<h3><a href="newalbum.jsp">Album and Picture</a></h3>

<h3><a href="displayAllPicture.jsp">Write Comments</a></h3>

<h3><a href="listallalbums.jsp">Tag Pictures</a></h3>

<h3><a href="topusers.jsp">Top 10 Users</a></h3>

<h3><a href="searchTag.jsp">View Photos with a Specific Tag</a></h3>

<h3><a href="populartag.jsp">View Most Popular Tag</a></h3>

<h3><a href="searchmultitags.jsp?id=1">Search with Conjunctive Tag</a></h3>

<h3><a href="youmayalsolike.jsp">You May Also Like</a></h3>

<h3><a href="searchmultitags.jsp?id=2">Tag Recommendation</a></h3>

<%	
	}
%>

<h4><a href="main.jsp">Return to Main Page</a></h4>
</body>
</html>
