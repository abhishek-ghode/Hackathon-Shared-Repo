<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page errorPage="WEB-INF/showErrorMessage.jsp" %>
<html>
  <head>
    <title>JAW Motors</title>
  </head>
  <body>
  
    <h1>JAW Motors</h1>
    <p><%@include file="showImage.jsp"%></p>
    <a href="controller?action=viewCarList">View Inventory</a> 
  </body>
</html>



<%

	try{

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection dbConnection =  DriverManager.getConnection("jdbc:mysql://aa1me8sfcg5qx85.cxphh71ogwak.us-east-2.rds.amazonaws.com:3306/ebdb", 
						"root", "Capgemini123");
		
		out.println(dbConnection);
	}catch(Exception e){
		out.println(e.getStackTrace());
	}



%>
