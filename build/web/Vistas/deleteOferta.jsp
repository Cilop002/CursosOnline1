<%-- 
    Document   : deleteOferta
    Created on : 10-25-2015, 10:15:26 PM
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
        <form action="ServletOfertaDelete" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Seleccione el código de oferta que desea eliminar</td>
                        <td><input type="text" name="txtCodDel"></td>
                    </tr>
                    
                        <td><input type="submit" value="Aceptar"</td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
