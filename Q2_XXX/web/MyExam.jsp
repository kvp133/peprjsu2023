<%-- 
    Document   : MyExam
    Created on : Mar 13, 2024, 9:23:15 PM
    Author     : KieuVietPhuoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="execute" method="POST">
            <table border="0">
               
                <tbody>
                    <tr>
                        <td>Code:</td>
                        <td><input type="text" name="txtCode" value="" /></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="txtName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Plane schedule:</td>
                        <td><input type="date"  name="txtSchedule" value="" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="ADD" />
        </form>
        <label>List of Plane:</label>
        <table border="1">
            
            <tbody>
                <tr>
                    <td>Code</td>
                    <td>Name</td>
                    <td>Plane Schedule</td>
                </tr>
                <c:forEach items="${sessionScope.list}" var="c">
                <tr>
                    <td>${c.getCode()}</td>
                    <td>${c.getName()}</td>
                    <td>${c.getDate()}</td>
                </tr>
            </c:forEach>
                
            </tbody>
        </table>

    </body>
</html>
