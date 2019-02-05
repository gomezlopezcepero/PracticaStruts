<%-- 
    Document   : bienvenida
    Created on : 27-ene-2017, 10:49:51
    Author     : asus
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Nuevo cliente dado de alta satisfactoriamente</h2>
        
         <table border="0">
            <thead>
                <tr>
                    <th>Datos de identificación</th>
                    <th>Datos personales</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Email</td>
                    <td>Nombre</td>
                </tr>
                <tr>
                    <td> <bean:write name="LoginForm" property="email"/></td>
                    <td> <bean:write name="LoginForm" property="nombre"/></td>
                </tr>
                <tr>
                    <td>contraseña</td>
                    <td>Apellidos</td>
                </tr>
                <tr>
                    <td><bean:write name="LoginForm" property="contra"/></td>
                    <td><bean:write name="LoginForm" property="apellidos"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td>dni</td>
                </tr>
                <tr>
                    <td></td>
                    <td><bean:write name="LoginForm" property="dni"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td>IBAN</td>
                </tr>
                <tr>
                    <td></td>
                    <td><bean:write name="LoginForm" property="iban"/></td>
                </tr>
            </tbody>
        </table>
        
    </body>
</html>
