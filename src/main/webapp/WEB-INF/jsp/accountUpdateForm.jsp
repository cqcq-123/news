<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'from.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- The styles -->
<link id="bs-css" href="css/bootstrap-cerulean.css" rel="stylesheet">
<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}
</style>
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/charisma-app.css" rel="stylesheet">
<link href="css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
<link href='css/fullcalendar.css' rel='stylesheet'>
<link href='css/fullcalendar.print.css' rel='stylesheet' media='print'>
<link href='css/chosen.css' rel='stylesheet'>
<link href='css/uniform.default.css' rel='stylesheet'>
<link href='css/colorbox.css' rel='stylesheet'>
<link href='css/jquery.cleditor.css' rel='stylesheet'>
<link href='css/jquery.noty.css' rel='stylesheet'>
<link href='css/noty_theme_default.css' rel='stylesheet'>
<link href='css/elfinder.min.css' rel='stylesheet'>
<link href='css/elfinder.theme.css' rel='stylesheet'>
<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
<link href='css/opa-icons.css' rel='stylesheet'>
<link href='css/uploadify.css' rel='stylesheet'>

<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

<!-- The fav icon -->
<link rel="shortcut icon" href="img/favicon.ico">
</head>

<body>
	<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> </a> <a class="brand" href="${pageContext.request.contextPath}/providerControl/index">
					CRM</a>

				<!-- theme selector starts -->
				<div class="btn-group pull-right theme-container">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-tint"></i><span class="hidden-phone"> Change
							Theme / Skin</span> <span class="caret"></span> </a>
					<ul class="dropdown-menu" id="themes">
						<li><a data-value="classic" href="#"><i
								class="icon-blank"></i> Classic</a>
						</li>
						<li><a data-value="cerulean" href="#"><i
								class="icon-blank"></i> Cerulean</a>
						</li>
						<li><a data-value="cyborg" href="#"><i class="icon-blank"></i>
								Cyborg</a>
						</li>
						<li><a data-value="redy" href="#"><i class="icon-blank"></i>
								Redy</a>
						</li>
						<li><a data-value="journal" href="#"><i
								class="icon-blank"></i> Journal</a>
						</li>
						<li><a data-value="simplex" href="#"><i
								class="icon-blank"></i> Simplex</a>
						</li>
						<li><a data-value="slate" href="#"><i class="icon-blank"></i>
								Slate</a>
						</li>
						<li><a data-value="spacelab" href="#"><i
								class="icon-blank"></i> Spacelab</a>
						</li>
						<li><a data-value="united" href="#"><i class="icon-blank"></i>
								United</a>
						</li>
					</ul>
				</div>
				<!-- theme selector ends -->

				<!-- user dropdown starts -->
				<div class="btn-group pull-right">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i><span class="hidden-phone"> admin</span>
						<span class="caret"></span> </a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a>
						</li>
						<li class="divider"></li>
						<li><a href="${pageContext.request.contextPath}/providerControl/login">Logout</a>
						</li>
					</ul>
				</div>
				<!-- user dropdown ends -->

				<div class="top-nav nav-collapse">
					<ul class="nav">
						<li><a href="#">Visit Site</a>
						</li>
						<li>
							<form class="navbar-search pull-left">
								<input placeholder="Search" class="search-query span2"
									name="query" type="text">
							</form></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<!-- topbar ends -->
	<div class="container-fluid">
		<div class="row-fluid">

			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li class="nav-header hidden-tablet">Main</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/index"><i
								class="icon-home"></i><span class="hidden-tablet">
									Dashboard</span> </a>
						</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/ui"><i
								class="icon-eye-open"></i><span class="hidden-tablet"> UI
									Features</span> </a>
						</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/form"><i
								class="icon-edit"></i><span class="hidden-tablet"> Forms</span>
						</a>
						</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/chart"><i
								class="icon-list-alt"></i><span class="hidden-tablet">
									Charts</span> </a>
						</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/typography"><i
								class="icon-font"></i><span class="hidden-tablet">
									Typography</span> </a>
						</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/gallery"><i
								class="icon-picture"></i><span class="hidden-tablet">
									Gallery</span> </a>
						</li>
						<li class="nav-header hidden-tablet">Sample Section</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/providerControl/table"><i class="icon-align-justify"></i><span class="hidden-tablet"> 供应商列表</span></a></li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/billControl/tableBill"><i class="icon-calendar"></i><span class="hidden-tablet"> 订单列表</span></a></li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/addressControl/tableAddress"><i class="icon-th"></i><span class="hidden-tablet"> 地址列表</span></a></li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/userControl/tableUser"><i class="icon-folder-open"></i><span class="hidden-tablet"> 用户列表</span></a></li>
						<li><a href="${pageContext.request.contextPath}/accountControl/tableaccount"><i class="icon-globe"></i><span class="hidden-tablet">角色列表</span></a></li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/accountControl/tableAccount"><i class="icon-star"></i><span class="hidden-tablet"> 用户管理</span></a></li>
						</li>
						<li><a href="${pageContext.request.contextPath}/providerControl/error"><i class="icon-ban-circle"></i><span
								class="hidden-tablet"> Error Page</span> </a>
						</li>
						<li><a href="${pageContext.request.contextPath}/providerControl/login"><i class="icon-lock"></i><span
								class="hidden-tablet"> Login Page</span> </a>
						</li>
					</ul>
					<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input
						id="is-ajax" type="checkbox"> Ajax on menu</label>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<!-- left menu ends -->

			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>
						You need to have <a href="http://en.wikipedia.org/wiki/JavaScript"
							target="_blank">JavaScript</a> enabled to use this site.
					</p>
				</div>
			</noscript>

			<div id="content" class="span10">
				<!-- content starts -->


				<div>
					<ul class="breadcrumb">
						<li><a href="#">Home</a> <span class="divider">/</span></li>
						<li><a href="#">Forms</a></li>
					</ul>
				</div>
				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header well" data-original-title>
							<h2>
								<i class="icon-edit"></i> 角色表单修改
							</h2>

							<div class="box-icon">
								<a href="#" class="btn btn-setting btn-round"><i
									class="icon-cog"></i> </a> <a href="#"
									class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i> </a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i>
								</a>
							</div>
						</div>
						<div class="box-content">
							<form class="form-horizontal" action="accountControl/accountID" method="post">
								<fieldset>
									<c:forEach items="${list}" var="account">
										<div>
											<input type="hidden" name="id" value="${account.id}">
										</div>
										<div class="control-group success">
											<label class="control-label" for="devCode">编号</label>
											<div class="controls">
												<input type="text" id="devCode" name="devCode" value="${account.devCode}"> <span
													class="help-inline"></span>
											</div>
										</div>
										<div class="control-group success">
											<label class="control-label" for="devName">姓名</label>
											<div class="controls">
												<input type="text" id="devName" name="devName" value="${account.devName}"> <span
													class="help-inline"></span>
											</div>
										</div>
										<div class="control-group success">
											<label class="control-label" for="devPassword">密码</label>
											<div class="controls">
												<input type="text" id="devPassword" name="devPassword" value="${account.devPassword}"> <span
													class="help-inline"></span>
											</div>
										</div>
										<div class="control-group success">
											<label class="control-label" for="devEmail">邮箱</label>
											<div class="controls">
												<div class="input-prepend">
													<span class="add-on">@</span><input id="devEmail"
																						size="16" name="devEmail" value="${account.devEmail}" type="text">
												</div>
												<p class="help-block"></p>
											</div>
										</div>
										<div class="control-group success">
											<label class="control-label" for="devInfo">信息
											</label>
											<div class="controls">
												<textarea class="cleditor" id="devInfo" name="devInfo" rows="3">${account.devInfo}</textarea>
											</div>
										</div>
										<div class="control-group success">
											<label class="control-label" for="createdBy">创建者</label>
											<div class="controls">
												<select name="createdBy" id="createdBy">
													<option value="1">经理</option>
													<option value="2">主管</option>
													<option value="3">员工</option>
												</select>
											</div>
										</div>
										<div class="control-group success">
											<label class="control-label" for="creationDate">创建时间</label>
											<div class="controls">
												<input type="text" class="input-xlarge datepicker"
													   id="creationDate" name="creationDate" value="${account.creationDate}">
											</div>
										</div>
									<div class="form-actions">
										<input type="submit" class="btn btn-primary"></input>
										<button class="btn">取消</button>
									</div>
								</fieldset>
								</c:forEach>
							</form>

						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!-- content ends -->
			</div>
			<!--/#content.span10-->
		</div>
		<!--/fluid-row-->

		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a> <a href="#"
					class="btn btn-primary">Save changes</a>
			</div>
		</div>

		<footer>
		<p class="pull-left">&copy; 2017</p>
		<p class="pull-right">&copy;</p>
		</footer>

	</div>
	<!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src="js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.min.js"></script>
	<script src="js/jquery.flot.pie.min.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="js/charisma.js"></script>
</body>
</html>
