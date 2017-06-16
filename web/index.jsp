
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Connection con=null;
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/INACAP";
            String usuario="root";
            String clave="";
            try{
                Class.forName(driver);
                con=DriverManager.getConnection(url,usuario,clave);
                out.println("USUARIO CONECTADO");
            }catch(Exception ex){
                out.println("ERROR DE CONEXION"+ex.getMessage());
            }
            %>
    </body>
</html>
