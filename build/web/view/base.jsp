<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title><dec:title default="Trang chu"/></title>

        <!-- Bootstrap Core CSS -->
        <link href="<c:url value='/view/css/bootstrap.min.css'/>" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="<c:url value='/view/css/metisMenu.min.css'/>" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="<c:url value='/view/css/timeline.css' />" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="<c:url value='/view/css/startmin.css'/>" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="<c:url value='/view/css/morris.css'/>" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="<c:url value='/view/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
      
    </head>
    <body>

        <div id="wrapper">

            <!-- header -->
            <%@include file="view/header.jsp" %>

            <dec:body/>
            
            <!--footer-->
            <%@include file="view/footer.jsp" %>
        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="<c:url value='/view/js/jquery.min.js'/>"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="<c:url value='/view/js/bootstrap.min.js'/>"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="<c:url value='/view/js/metisMenu.min.js'/>"></script>

        <!-- Morris Charts JavaScript -->
        <script src="<c:url value='/view/js/raphael.min.js'/>"></script>
        <script src="<c:url value='/view/js/morris.min.js'/>"></script>
        <script src="<c:url value='/view/js/morris-data.js'/>"></script>

        <!-- Custom Theme JavaScript -->
        <script src="<c:url value='/view/js/startmin.js'/>"></script>

    </body>
</html>

