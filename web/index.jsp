<%--
  Created by IntelliJ IDEA.
  User: 92377
  Date: 2017/10/20
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title><s:text name="login.title.lable"/></title>
</head>
<body><table align="center">
    <tr><td><s:form action="login" method="post"></tr></td>
<tr><td><s:textfield name="loginUser.account" key="login.account.lable"/></td></tr>
<tr><td><s:password name="loginUser.password" key="login.password.lable"/></td></tr>
        <tr><td><s:submit name="submit" key="login.submit.button"/></td></tr>
    <tr><td></s:form></tr></td>
    <tr><TD><a href="register.jsp" id="register"><s:text name="register" /></a></TD></tr>
</table></body>
</html>