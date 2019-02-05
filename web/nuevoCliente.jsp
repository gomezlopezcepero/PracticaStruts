<%-- 
    Document   : nuevoCliente
    Created on : 27-ene-2017, 10:35:11
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
     
        
        <style>
            
            .error{
                
                color:red;
                
            }
            
            </style>
        
    </head>
    <body>
    <html:form action="/LoginAction">
        <table border="0">
            <thead>
                <tr>
                    <th>Datos de identificación</th>
                    <th>Datos personales</th>
                </tr>
            </thead>
            <tbody>
                <tr  class="error">
                    <td><html:errors property="email"/></td>
                    <td><html:errors property="nombre"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>Nombre</td>
                </tr>
                 
                <tr>
                    <td><html:text property="email"/></td>
                    <td><html:text property="nombre"/></td>
                </tr>
                <tr class="error">
                   <td><html:errors property="email2"/></td>
                    <td><html:errors property="apellidos"/></td>
                </tr>
                <tr>
                    <td>Confirmar email</td>
                    <td>Apellidos</td>
                </tr>
                <tr>
                    <td><html:text property="email2"/></td>
                    <td><html:text property="apellidos"/></td>
                </tr>
                <tr  class="error">
                    <td><html:errors property="contra"/></td>
                    <td><html:errors property="dni"/></td>
                </tr>
                <tr>
                    <td>contraseña</td>
                    <td>dni</td>
                </tr>
                <tr>
                    <td><html:text property="contra"/></td>
                    <td><html:text property="dni"/></td>
                </tr>
                <tr  class="error">
                    <td><html:errors property="contra2"/></td>
                    <td><html:errors property="iban"/></td>
                </tr>
                <tr>
                    <td>confirmar contraseña</td>
                    <td>IBAN</td>
                </tr>
                <tr>
                    <td><html:text property="contra2"/></td>
                    <td><html:text property="iban"/></td>
                </tr>
            </tbody>
        </table>

                 <html:submit style="margin-left: 17%" value="Registrar" />
                
        </html:form>
        
    </body>
</html>
