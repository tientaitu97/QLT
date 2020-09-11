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

        <!-- Custom Fonts -->
        <link href="<c:url value='/view/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--        [if lt IE 9]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

        <div id="wrapper">

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
                            <i class="fa fa-user fa-fw"></i> <b class="caret"></b>
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
                             <li>
                                <a href="<c:url value='/customer'/>"><i class="fa fa-bar-chart-o fa-fw"></i> Tạo Phiếu Mượn<span class="fa arrow"></span></a>
                                
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-table fa-fw"></i> Thống kê truyện mượn nhiều</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-edit fa-fw"></i> Thống kê khách hàng mượn nhiều</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> Tạo Hóa Đơn trả truyện<span class="fa arrow"></span></a>
                                
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-sitemap fa-fw"></i> Thống kê doanh thu<span class="fa arrow"></span></a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-files-o fa-fw"></i> Thống kê nhà cung cấp theo doanh chi<span class="fa arrow"></span></a>
                                
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
                                <div style="margin-left: 300px">
                                <div style="margin-top: 100px; margin-left: 30%">
                                    <h1> TẠO MỚI KHÁCH HÀNG</h1>
                                </div>
                                    <div style="margin-top: 50px">
                                        <form action="<%=request.getContextPath()%>/create" method="GET">
 
                                           <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Tên khách hàng</label>
    <div class="col-sm-10">
      <input type="text" name="nameCustomer" class="form-control" id="inputEmail3" placeholder="Nhập tên ...">
    </div>
  </div>
                                           <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Điểm</label>
    <div class="col-sm-10">
      <input type="text" name="points" class="form-control" id="inputEmail3" placeholder="Nhập điểm ...">
    </div>
  </div>
                                           <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Tuổi</label>
    <div class="col-sm-10">
      <input type="text" name="age" class="form-control" id="inputEmail3" placeholder="Nhập tuổi ...">
    </div>
  </div>
                                           <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Giới tính</label>
    <div class="col-sm-10">
      <input type="text" name="gender" class="form-control" id="inputEmail3" placeholder="Nhập giới tính ...">
    </div>
  </div>
                                           <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Địa chỉ</label>
    <div class="col-sm-10">
      <input type="text" name="address" class="form-control" id="inputEmail3" placeholder="Nhập địa chỉ ...">
    </div>
  </div>
                                            <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Liên lạc</label>
    <div class="col-sm-10">
      <input type="text" name="contact" class="form-control" id="inputEmail3" placeholder="Nhập số điện thoại ...">
    </div>
  </div>
                                    
  
    <div class="col-sm-10">
      <button id="save" type="submit" class="btn btn-primary">Lưu</button>
      <a href="<c:url value='/customer'/>"><button style="background: red"type="button" class="btn btn-primary">Quay lại</button></a>
    </div>
    </form>
  </div>

                                    </div>
           </div>
                                </div>
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
        <script>
            $(document).ready(function() {
               $(#save).onclick(function(){
                   alert("Lưu thành công");
               });
        });
        </script>

    </body>
</html>

