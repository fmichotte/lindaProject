
<%@page import="com.lindacare.msg.InputMessage"%>
<%@page import="com.lindacare.db.LikeDb"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

LikeDb zDb = LikeDb.getInstance();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <table border="1">
  <tr>
  	<th>USERID</th>
  	<th>CURRENCY FROM</th>
  	<th>CURRENCY TO</th>
  	<th>AMOUNT SELL</th>
  	<th>AMOUNT BUY</th>
  	<th>RATE</th>
  	<th>TIME PLACED</th>
  	<th>ORIGINATING COUNTRY</th>
  	<th>MESSAGE RECEIVED</th>
  </tr>
  	
  <% for (InputMessage im : zDb.getList()){ %>
	<TR>
	  	<td><%= im.getUserId() %></td>
	  	<td><%= im.getCurrencyFrom() %></td>
	  	<td><%= im.getCurrencyTo() %></td>
	  	<td><%= im.getAmountSell() %></td>
	   	<td><%= im.getAmountBuy() %></td>
	  	<td><%= im.getRate() %></td>
	  	<td><%= im.getTimePlaced() %></td>
	  	<td><%= im.getOriginatingCountry()  %></td>
	  	<td><%= im.getReceived() %></td>
  	</TR>
  	
  <%} %>
  </table>  
  </body>
</html>
