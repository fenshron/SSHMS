<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<link rel="stylesheet"	href="common/js/plugins/webUI/jquery-easyui-1.3.5/themes/default/easyui.css" type="text/css"></link>
<link rel="stylesheet"	href="common/js/plugins/webUI/jquery-easyui-1.3.5/themes/icon.css"	type="text/css"></link>
<script type="text/javascript"	src="common/js/plugins/webUI/jquery-1.7.2.js"></script>
<script type="text/javascript"	src="common/js/plugins/webUI/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="common/js/plugins/webUI/jquery-easyui-1.3.5/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="common/js/MyJs/easyUI.extend.forHiu.js"></script>

<script type="text/javascript" src="common/js/MyJs/hiu.utils.js"></script>

<!-- 日期控件，要加<%=basePath%>使用项目路径，否则会无法使用 -->
<script type="text/javascript" src="<%=basePath%>common/js/plugins/component/DatePicker/WdatePicker.js"></script>


