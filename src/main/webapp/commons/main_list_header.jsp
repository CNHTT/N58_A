<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.extra.n58.model.User" %>
<%@ page import="com.extra.n58.utils.GsonUtils" %>
<%@ page import="com.extra.n58.utils.SessionUtils" %>
<%--
  Created by IntelliJ IDEA.
  User: 戴尔
  Date: 2017/7/24
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String  path = request.getContextPath();
    User user = new GsonUtils().fromJson((String) request.getSession().getAttribute(SessionUtils.SESSION_ADMIN_USER),User.class);
%>
<header class="main-header">
    <!-- Logo -->
    <a class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>A</b>LT</span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Admin</b>LTE</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="<%=path%>/static/images/user_160x160.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs"><%=user.getUserName()%></span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="<%=path%>/static/images/user_160x160.jpg" class="img-circle" alt="User Image">

                            <p>
                                <a id="username">Extra - Web Developer</a>
                                <small id="createTime"><%=user.getCreateTime()%></small>
                            </p>
                        </li>

                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">Profile</a>
                            </div>
                            <div class="pull-right">
                                <a href="<%=path%>/singout" class="btn btn-default btn-flat">Sign out</a>
                            </div>
                        </li>
                    </ul>
                </li>
                <!-- Control Sidebar Toggle Button -->
                <li>
                    <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="<%=path%>/static/images/logoEN.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><%=user.getUserName()%></p>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">MAIN NAVIGATION</li>


            <li class="active">
                <a href="<%=path%>/consume">
                    <i class="fa fa-th"></i> <span>Consume</span>
                    <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
                </a>
            </li>

            <li>
                <a href="<%=path%>/repeal">
                    <i class="fa fa-th"></i> <span>Repeal</span>
                    <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
                </a>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
