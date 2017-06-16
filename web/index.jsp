
<%@page import="cl.negocio.Course"%>
<%@page import="cl.accesodato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           Course cor=new Course();
           cor.setNAME("programacion 10");
           cor.setDESCRIPTION("taller avanzado");
           cor.setSTATE("activo");
           cor.save();


            %>
    </body>
</html>
