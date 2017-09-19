<%--
  Created by IntelliJ IDEA.
  User: CT
  Date: 2017/8/13
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path =request.getContextPath();
%>

<!-- jQuery 3 -->
<script type="text/javascript"  src="<%=path%>/static/js/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script type="text/javascript"  src="<%=path%>/static/js/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script type="text/javascript" src="<%=path%>/static/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script type="text/javascript" src="<%=path%>/static/js/raphael.min.js"></script>
<script type="text/javascript"  src="<%=path%>/static/js/morris.min.js"></script>
<!-- Sparkline -->
<script type="text/javascript" src="<%=path%>/static/js/jquery.sparkline.min.js"></script>

<!-- jvectormap -->
<script type="text/javascript" src="<%=path%>/static/js/jquery-jvectormap-1.2.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script type="text/javascript" src="<%=path%>/static/js/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script type="text/javascript" src="<%=path%>/static/js/moment.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/daterangepicker.js"></script>

<!-- datepicker -->
<script type="text/javascript" src="<%=path%>/static/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script type="text/javascript" src="<%=path%>/static/js/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script type="text/javascript" src="<%=path%>/static/js/bootstrap-paginator.js"></script>

<!-- DataTables -->
<script type="text/javascript" src="<%=path%>/static/js/jquery.dataTables.min.js"></script>

<script type="text/javascript" src="<%=path%>/static/js/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script type="text/javascript" src="<%=path%>/static/js/fastclick.js"></script>
<!-- AdminLTE App -->
<script type="text/javascript" src="<%=path%>/static/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script type="text/javascript" src="<%=path%>/static/js/main.js"></script>
