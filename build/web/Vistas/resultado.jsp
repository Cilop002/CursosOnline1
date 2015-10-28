<%-- 
    Document   : resultado
    Created on : 10-22-2015, 08:30:42 PM
    Author     : Cilop002
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
         if(request.getAttribute("Resultado").equals("Correcto")){
             %>
             <p>Operacion Correcta</p>
             <%
         }else{
             %>
             <p>Operacion Incorrecta</p>
             <%
         }
        %>
    </body>
</html>
