<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>

<%@ page import="java.util.Date" %>
<%@ page import="java.net.InetAddress" %>
<%@ page import="lab7.WelcomeInfo" %>

<body>
<h3>This is a JSP example</h3>

<p><strong>Current Time is </strong>: <%=new Date() %></p>

<p>
<strong>System Information : </strong>
<br></br>
<% out.println("User Name: " + System.getProperty("user.name")); %>
<br>
<% out.println("User Home Folder: " + System.getProperty("user.home")); %>
<br>
<% out.println("User Time Zone: " + System.getProperty("user.timezone")); %>
<br>
<% out.println("User Language: " + System.getProperty("user.language")); %>
<br></br>
<% out.println("IP Address: " + InetAddress.getLocalHost().getHostAddress()); %>
<br>
<% out.println("Host Name: " + InetAddress.getLocalHost().getHostName()); %>
<br></br>
<% out.println("OS: " + System.getProperty("os.name")); %>
<br>
<% out.println("OS Arch: " + System.getProperty("os.arch")); %>
<br></br>
<% out.println("Java Version: " + System.getProperty("java.version")); %>
<br>
<% out.println("JRE: " + System.getProperty("java.runtime.name")); %>
<br>
<% out.println("JVM: " + System.getProperty("java.vm.name")); %>
<br>
<% out.println("Java Home: " + System.getenv("JAVA_HOME")); %>
</p>


<p>
<strong>Welcome Message : </strong>
<br></br>
<textarea readonly rows="4" cols="50" wrap="hard" disabled>
<% out.println(WelcomeInfo.str); %>
</textarea>
<textarea readonly rows="4" cols="50" wrap="hard" disabled>
<% out.println(WelcomeInfo.str3); %>
</textarea>


</body>
</html>