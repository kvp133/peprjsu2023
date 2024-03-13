<%-- 
    Document   : index
    Created on : Mar 13, 2024, 10:59:29 PM
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
        <label>Supplier filter:</label>
        <table border="1">
           
            <tbody>
                <tr>
                    <td>
                        <form action="show" method="POST">
                            <table border="0">
                           
                            <tbody>
                                <tr>
                                    <td>Type name:</td>
                                    <td><input type="text" name="txtTypeName" value="" /><input type="hidden" name="action" value="filterByName" /></td>
                                    <td><input type="submit" value="Filter by name" /></td>
                                </tr>
                                <tr>
                                    <td>Day of birth:</td>
                                    <td><input type="text" name="txtBod" value="" /><input type="hidden" name="action" value="filterByDay" /></td>
                                    <td><input style="width: 100%;text-align: left" type="submit" value="Filter by day" /></td>
                                </tr>
                            </tbody>
                        </table>
                        </form>
                        

                        
                    </td>
                </tr>
            </tbody>
        </table>
        <label>List of Suppliers:</label>
        <table border="1">
            
            <tbody>
                <tr>
                    <td>Code</td>
                    <td>Name</td>
                    <td>Date of birth</td>
                    <td>Gender</td>
                    <td>Type Name</td>
                </tr>
                <c:forEach items="${requestScope.listSupplier}" var="c">
                    <tr>
                    <td>${c.getSupplierID()}</td>
                    <td>${c.getSupplierName()}</td>
                    <td>${c.getBirthDate()}</td>
                    <td>
                        <c:if test="${c.isGender()}">Male</c:if>
                        <c:if test="${!c.isGender()}">Female</c:if>
                    </td>
                    <td>${c.getType().getTypeName()}</td>
                </tr>
                </c:forEach>
                
            </tbody>
        </table>

    </body>
</html>
