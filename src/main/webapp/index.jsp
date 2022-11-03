<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/1
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="true" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>考勤记录信息列表</h1>
<table>
    <tbody id="b">

    </tbody>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>
    $.get("http://localhost:8080/queryAll",data=>{
        let html=`
         <tr>
        <td>编号</td>
        <td>pm10</td>
        <td>pm25</td>
        <td>状态</td>


    </tr>
        `
        for (let i=0;i<data.length;i++){
            let id=data[i].id
            let pm10=data[i].pm10
            let pm25=data[i].pm25
            let monitoringStation=data[i].monitoringStation

            html+=`
            <tr>
            <td>${id}</td>
            <td>${pm10}</td>
            <td>${pm25}</td>
            <td>${monitoringStation}</td>

        </tr>
            `
        }
        $("#b").html(html)
    },"JSON")
</script>
</html>
