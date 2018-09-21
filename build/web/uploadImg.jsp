<%-- 
    Document   : uploadImg
    Created on : 24/03/2018, 02:28:51 AM
    Author     : orbis
--%>



<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.*"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItem"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%

FileItemFactory file_factory = new DiskFileItemFactory();
        ServletFileUpload servlet_up = new ServletFileUpload(file_factory);
        java.util.List<FileItem> items = servlet_up.parseRequest(request);
        String img = "";
        for(int i=0;i<items.size();i++){
        
        FileItem item = (FileItem) items.get(0);
        if(!item.isFormField()){
        File archivo_server = new File
//        ("C:\\Users\\orbis\\Documents\\NetBeansProjects\\Tienda\\web\\img\\"+item.getName());
          (request.getServletContext().getRealPath("/")+"img/"+item.getName());
            try {
                item.write(archivo_server);
            } catch (Exception e) {
                System.out.println("error al guardar img "+e);
                        PrintWriter jp = response.getWriter();
                        jp.print("error :" + e );
            }
            img =item.getName();
        }
        }
%>
<jsp:forward page="RegisterProducts.jsp">
    <jsp:param name="img" value="<%=img%>"></jsp:param>
</jsp:forward>    