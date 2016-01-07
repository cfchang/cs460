<html>
<head>
  <title>Users Update </title>
</head>
 
<body>
  <h1>User system</h1>
  <h2>Update done...</h2>
 
  <%
    String[] ids = request.getParameterValues("user_id");
    if (ids != null) {
  %>
  <%@ page import = "java.sql.*" %>
  <%
      Connection conn = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/postgres", "postgres", "Connie0331"); // <== Check!
      // Connection conn =
      //    DriverManager.getConnection("jdbc:odbc:eshopODBC");  // Access
      Statement stmt = conn.createStatement();
      String sqlStr;
      int recordUpdated;
      ResultSet rset;
  %>
      <table border=1 cellpadding=3 cellspacing=0>
        <tr>
          <th>User</th>
          <th>email</th>
          <th>First Name</th>
          <th>HomeTown</th>
          <th>Gender</th>
          <th>dob</th>
        </tr>
  <%
      for (int i = 0; i < ids.length; ++i) {
        // Subtract the QtyAvailable by one
        sqlStr = "UPDATE users SET hometown = 'New City' WHERE user_id = " + ids[i];
        recordUpdated = stmt.executeUpdate(sqlStr);
        // carry out a query to confirm
        sqlStr = "SELECT * FROM users WHERE user_id =" + ids[i];
        rset = stmt.executeQuery(sqlStr);
        while (rset.next()) {
  %>
          <tr>
            <td><%= rset.getInt("user_id") %></td>
            <td><%= rset.getString("email") %></td>
            <td><%= rset.getString("first_name") %></td>
            <td><%= rset.getString("hometown") %></td>
            <td><%= rset.getString("gender") %></td>
            <td><%= rset.getString("dob") %></td>
          </tr>
  <%    }
        rset.close();
      }
      stmt.close();
      conn.close();
    }
  %>
  </table>
  <a href="query2.jsp"><h3>BACK</h3></a>
</body>
</html>