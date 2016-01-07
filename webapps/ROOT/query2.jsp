<html>
<head>
  <title>Users Query</title>
</head>
<body>
  <h1>User system</h1>
  <h3>Choose Gender:</h3>
  <form method="get">
    <input type="checkbox" name="gender" value="M">Male
    <input type="checkbox" name="gender" value="F">Female
    <input type="submit" value="Query">
  </form>
 
  <%
    String[] genders = request.getParameterValues("gender");
    if (genders != null) {
  %>
  <%@ page import = "java.sql.*" %>
  <%
      Connection conn = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/postgres", "postgres", "Connie0331"); // <== Check!
      // Connection conn =
      //    DriverManager.getConnection("jdbc:odbc:eshopODBC");  // Access
      Statement stmt = conn.createStatement();
 
      String sqlStr = "SELECT * FROM Users WHERE gender IN (";
      sqlStr += "'" + genders[0] + "'";  // First author
      for (int i = 1; i < genders.length; ++i) {
         sqlStr += ", '" + genders[i] + "'";  // Subsequent authors need a leading commas
      }
      //sqlStr += ") AND qty > 0 ORDER BY author ASC, title ASC";
      sqlStr += ")";
 
      // for debugging
      System.out.println("Query statement is " + sqlStr);
      ResultSet rset = stmt.executeQuery(sqlStr);
  %>
      <hr>
      <form method="get" action="order2.jsp">
        <table border=1 cellpadding=5>
          <tr>
            <th>User_id</th>
            <th>Email</th>
            <th>Password</th>
            <th>First_name</th>
            <th>Last_name</th>
            <th>dob</th>
            <th>hometown</th>
            <th>gender</th>
            <th>role_name</th>
          </tr>
  <%
      while (rset.next()) {
        int id = rset.getInt("user_id");
  %>
          <tr>
            <td><input type="checkbox" name="user_id" value="<%= id %>"></td>
            <td><%= rset.getString("email") %></td>
            <td><%= rset.getString("password") %></td>
            <td><%= rset.getString("first_name") %></td>
            <td><%= rset.getString("last_name") %></td>
            <td><%= rset.getString("dob") %></td>
            <td><%= rset.getString("hometown") %></td>
            <td><%= rset.getString("gender") %></td>
            <td><%= rset.getString("role_name") %></td>
          </tr>
  <%
      }
  %>
        </table>
        <br>
        <input type="submit" value="Update">
        <input type="reset" value="Clear">
      </form>
      <a href="<%= request.getRequestURI() %>"><h3>Back</h3></a>
  <%
      rset.close();
      stmt.close();
      conn.close();
    }
  %>
</body>
</html>