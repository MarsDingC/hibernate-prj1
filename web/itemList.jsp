<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 92377
  Date: 2017/11/17
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<div style="text-align: left;">商品列表</div>
<table border=1>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>说明</th>
        <th>单价</th>
    </tr>
    <s:iterator value="items">
        <tr>
            <td><s:property value="isbn"/></td>
            <td><s:property value="title"/></td>
            <td><s:property value="description"/></td>
            <td><s:property value="cost"/></td>
        </tr>
    </s:iterator></table>
</body>
</html>
