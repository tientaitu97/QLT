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

        <title>Startmin - Bootstrap Admin Theme</title>

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
         <!-- jQuery -->
        <script src="<c:url value='/view/js/jquery.min.js'/>"></script>
        <script src="<c:url value='/view/js/jquery.twbsPagination.min.js'/>"></script>
        <script src="<c:url value='/view/js/jquery.twbsPagination.js'/>"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="<c:url value='/view/js/bootstrap.min.js'/>"></script>
      


        <!-- Custom Fonts -->
        <link href="<c:url value='/view/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">

       
    </head>
    <body>

        <div id="wrapper container">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.html">Startmin</a>
                </div>

                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

                <ul class="nav navbar-nav navbar-left navbar-top-links">
                    <li><a href="#"><i class="fa fa-home fa-fw"></i> Website</a></li>
                </ul>

                <ul class="nav navbar-right navbar-top-links">
                    <li class="dropdown navbar-inverse">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-bell fa-fw"></i> <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-comment fa-fw"></i> New Comment
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> Message Sent
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-tasks fa-fw"></i> New Task
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i> secondtruth <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                            </li>
                            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
<!--                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-primary" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                </span>
                                </div>-->
                                <!-- /input-group -->
                            </li>
                            <li>
                                <a href="index.html" class="active"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="flot.html">Flot Charts</a>
                                    </li>
                                    <li>
                                        <a href="morris.html">Morris.js Charts</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="tables.html"><i class="fa fa-table fa-fw"></i> Tables</a>
                            </li>
                            <li>
                                <a href="forms.html"><i class="fa fa-edit fa-fw"></i> Forms</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="panels-wells.html">Panels and Wells</a>
                                    </li>
                                    <li>
                                        <a href="buttons.html">Buttons</a>
                                    </li>
                                    <li>
                                        <a href="notifications.html">Notifications</a>
                                    </li>
                                    <li>
                                        <a href="typography.html">Typography</a>
                                    </li>
                                    <li>
                                        <a href="icons.html"> Icons</a>
                                    </li>
                                    <li>
                                        <a href="grid.html">Grid</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#">Second Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Second Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level <span class="fa arrow"></span></a>
                                        <ul class="nav nav-third-level">
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                        </ul>
                                        <!-- /.nav-third-level -->
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="blank.html">Blank Page</a>
                                    </li>
                                    <li>
                                        <a href="login.html">Login Page</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div style="margin-left: 300px">
                <form action='<c:url value="/customer?action=customer"/>' method="GET">
                <div class="input-group" style="margin-top: 100px">
                    <input type="text" name="search" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn" >
                                        <a href=""><button class="btn btn-primary" type="submit">
                                           <i class="fa fa-search"></i>
                                            </button></a>
                                </span>
                                </div>
                <div style="margin-left: 30%">
                    <h1> DANH SACH KHACH HANG</h1>
                </div>
                <div style="margin-top: 100px">
                <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
                    <thead>
                        <tr>
                            <th class="th-sm">ID

                            </th>
                            <th class="th-sm">Name

                            </th>
                            <th class="th-sm">points

                            </th>
                            <th class="th-sm">Age

                            </th>
                            <th class="th-sm">Gender

                            </th>
                            <th class="th-sm">Address

                            </th>
                            <th class="th-sm">Contact

                            </th>
                            <th class="th-sm">Select Customer

                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${customer}" var="item">
                        <tr>
                            <td>${item.getId()}</td>
                            <td>${item.getPerson().getName()}</td>
                            <td>${item.getPoints()}</td>
                            <td>${item.getPerson().getAge()}</td>
                            <td>${item.getPerson().getGender()}</td>
                            <td>${item.getPerson().getAdrress().toString()}</td>
                            <td>${item.getPerson().getContact().getPhone()}</td>
                            <td><a href="<c:url value='/book?select=${item.getPerson().getName()}'/> ">
                                    <button style="background: aqua; color: black;"type="button">Select</button></a></td>
                        </tr>
                        </c:forEach>
                       
                    </tbody>
                    
                </table>
    <nav aria-label="Page navigation">
        <ul class="pagination" id="pagination">
            
        </ul>
        
    </nav>
                </div>
               
            </form>
            </div>
        </div>
        <!-- /#wrapper -->

       
        <!-- Metis Menu Plugin JavaScript -->
        <script src="<c:url value='/view/js/metisMenu.min.js'/>"></script>

        <!-- Morris Charts JavaScript -->
        <script src="<c:url value='/view/js/raphael.min.js'/>"></script>
        <script src="<c:url value='/view/js/morris.min.js'/>"></script>
        <script src="<c:url value='/view/js/morris-data.js'/>"></script>

        <!-- Custom Theme JavaScript -->
        <script src="<c:url value='/view/js/startmin.js'/>"></script>
        <script>
            $(function () {
                window.pagObj = $('#pagination').twbsPagination({
                    totalPages: 35,
                    visiblePages: 10,
                    onPageClick: function (event, page) {
                        console.info(page + ' (from options)');
                    }
                }).on('page', function (event, page) {
                    console.info(page + ' (from event listening)');
                });
            });
                </script>
    </body>
</html>
