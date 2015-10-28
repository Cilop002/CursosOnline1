<%-- 
    Document   : insertar
    Created on : 10-22-2015, 08:30:30 PM
    Author     : Cilop002
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de docentes</title>
    </head>
    <body>
        <form action="ServletOfertaInsert" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Codigo de Oferta</td>
                        <td><input type="text" name="txtCod"></td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <td><input type="text" name="txtPrecio"></td>
                    </tr>
                    
                        <td><input type="submit" value="Aceptar"</td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
