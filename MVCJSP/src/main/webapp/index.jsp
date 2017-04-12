<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Data</h1>
        <jsp:useBean id="items"
                     class="biepjv.servletmvc.model.Data" 
                     scope ="application">

        </jsp:useBean>
        <table border ="1">

            <c:forEach var="item" items="${items.data}">

                <tr>
                    <td>
                        ${item}
                    </td>
                </tr>
            </c:forEach>

        </table>

        <form action="login.do" method="POST">
            <input type="text" name="username" />
            <input type="submit" value="Login" />
        </form>


        <form action="add.do" method="POST">
            <input type="text" name="element" value=""  />
            <input type="submit" value="Add" />
        </form>


    </body>
</html>

