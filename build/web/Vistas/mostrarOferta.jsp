<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrar
    Created on : 10-27-2015, 05:59:50 PM
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
        <jsp:useBean id="ej" scope="request" class="Ejb.EjbOferta" />
        <h1>Listado de ofertas</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo Oferta</th>
                    <th>Precio de la Oferta</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="items" items="${ej.lista}">
                    <tr>
                        <td>${items.getCodOferta()}</td>
                        <td>${items.getPrecio()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
