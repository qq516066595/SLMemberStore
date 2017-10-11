<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <title>SL会员管理系统</title>
    <meta name="keywords" content="SLMemberStore">
    <meta name="description" content="SLMemberStore,会员管理系统">

    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->

    <link rel="shortcut icon" href="${pageContext.request.contextPath }/bitbug_favicon.ico">
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/style.min.css?v=4.0.0" rel="stylesheet">
    <base target="iframe0" href="<%=basePath%>">
</head>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close"><i class="fa fa-times-circle"></i>
        </div>
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <span><img alt="image" class="img-circle"
                                   src="${pageContext.request.contextPath }/img/profile_small.jpg"/></span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold">Beaut-zihan</strong></span>
                                <span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                                </span>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a class="J_menuItem" href="form_avatar.html">修改头像</a>
                            </li>
                            <li><a class="J_menuItem" href="profile.html">个人资料</a>
                            </li>
                            <li><a class="J_menuItem" href="contacts.html">联系我们</a>
                            </li>
                            <li><a class="J_menuItem" href="mailbox.html">信箱</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="login.html">安全退出</a>
                            </li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        <img alt="image" class="img-circle" width="60%" height="60%"
                             src="${pageContext.request.contextPath }/img/profile_small.jpg"/>
                    </div>
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa fa-bar-chart-o"></i>
                        <span class="nav-label">后台管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                       <li>
                            <a class="J_menuItem" href="${pageContext.request.contextPath }/jsp/zhangzheng/userAdmin.jsp">用户管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="${pageContext.request.contextPath }/jsp/zhangzheng/roleAdmin.jsp">角色管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="${pageContext.request.contextPath }/jsp/zhangzheng/jurisdiction.jsp">酌情添加</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa fa-bar-chart-o"></i>
                        <span class="nav-label">会员管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="graph_echarts.html">注册新会员</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="graph_flot.html">新会员管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="tes.html">酌情添加</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">电子银行</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
<<<<<<< HEAD
                        <li><a class="J_menuItem" href="${pageContext.request.contextPath }/jsp/huaxiaoyao/remittance.jsp">汇款充值</a>
=======
                        <li><a class="J_menuItem" href="mailbox.html">汇款充值</a>
>>>>>>> fc53c0a1671890f4262718c676cc3d699d34f6e6
                        </li>
                        <li><a class="J_menuItem" href="mail_detail.html">基本账户</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="tes.html">酌情添加</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">购物管理</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li><a class="J_menuItem" href="${pageContext.request.contextPath }/jsp/gaofei/taxationForm.jsp">报单购货</a>
                        </li>
                        <li><a class="J_menuItem" href="form_validate.html">确认激活</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="tes.html">酌情添加</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">信息查询</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
<<<<<<< HEAD
                        <li><a class="J_menuItem" href="form_basic.html">奖励查询</a>
=======
                        <li><a class="J_menuItem" href="${pageContext.request.contextPath }/jsp/hubangzhen/awardpage.jsp">奖励查询</a>
>>>>>>> fc53c0a1671890f4262718c676cc3d699d34f6e6
                        </li>
                        <li><a class="J_menuItem" href="form_validate.html">推荐查询</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="tes.html">酌情添加</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">咨询管理</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li><a class="J_menuItem" href="test.jsp">公告管理</a>
                        </li>
                        <li><a class="J_menuItem" href="form_validate.html">咨询管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="tes.html">酌情添加</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-primary "><i
                        class="fa fa-bars"></i> </a>
                </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown hidden-xs">
                        <a class="right-sidebar-toggle" aria-expanded="false">
                            <i class="fa fa-tasks"></i> 主题
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content">
                    <a href="${pageContext.request.contextPath }/jsp/my_desktop/my_desktop.jsp" class="active J_menuTab"
                       data-id="${pageContext.request.contextPath }/jsp/my_desktop/my_desktop.jsp">首页</a>
                </div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="${pageContext.request.contextPath }/user/exit" class="roll-nav roll-right J_tabExit"><i
                    class="fa fa fa-sign-out"></i> 退出</a>
        </div>
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%"
                    src="${pageContext.request.contextPath }/jsp/my_desktop/my_desktop.jsp" frameborder="0"
                    data-id="${pageContext.request.contextPath }/jsp/my_desktop/my_desktop.jsp" seamless></iframe>
        </div>
        <div class="footer">
            <div class="pull-right">&copy; 2017-2020 Gawain
            </div>
        </div>
    </div>
    <!--右侧部分结束-->
    <!--右侧边栏开始-->
    <div id="right-sidebar">
        <div class="sidebar-container">
            <div class="tab-content">
                <div id="tab-1" class="tab-pane active">
                    <div class="sidebar-title">
                        <h3><i class="fa fa-comments-o"></i> 主题设置</h3>
                    </div>
                    <div class="skin-setttings">
                        <div class="title">主题设置</div>
                        <div class="setings-item">
                            <span>收起左侧菜单</span>
                            <div class="switch">
                                <div class="onoffswitch">
                                    <input type="checkbox" name="collapsemenu" class="onoffswitch-checkbox"
                                           id="collapsemenu">
                                    <label class="onoffswitch-label" for="collapsemenu">
                                        <span class="onoffswitch-inner"></span>
                                        <span class="onoffswitch-switch"></span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="setings-item">
                            <span>固定顶部</span>

                            <div class="switch">
                                <div class="onoffswitch">
                                    <input type="checkbox" name="fixednavbar" class="onoffswitch-checkbox"
                                           id="fixednavbar">
                                    <label class="onoffswitch-label" for="fixednavbar">
                                        <span class="onoffswitch-inner"></span>
                                        <span class="onoffswitch-switch"></span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="setings-item">
                                <span>
                        固定宽度
                    </span>

                            <div class="switch">
                                <div class="onoffswitch">
                                    <input type="checkbox" name="boxedlayout" class="onoffswitch-checkbox"
                                           id="boxedlayout">
                                    <label class="onoffswitch-label" for="boxedlayout">
                                        <span class="onoffswitch-inner"></span>
                                        <span class="onoffswitch-switch"></span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="title">皮肤选择</div>
                        <div class="setings-item default-skin nb">
                                <span class="skin-name ">
                         <a href="#" class="s-skin-0">
                             默认皮肤
                         </a>
                    </span>
                        </div>
                        <div class="setings-item blue-skin nb">
                                <span class="skin-name ">
                        <a href="#" class="s-skin-1">
                            蓝色主题
                        </a>
                    </span>
                        </div>
                        <div class="setings-item yellow-skin nb">
                                <span class="skin-name ">
                        <a href="#" class="s-skin-3">
                            黄色/紫色主题
                        </a>
                    </span>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
    <!--右侧边栏结束-->
</div>
<script src="${pageContext.request.contextPath }/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js?v=3.3.5"></script>
<script src="${pageContext.request.contextPath }/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath }/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath }/js/plugins/layer/layer.min.js"></script>
<script src="${pageContext.request.contextPath }/js/hplus.min.js?v=4.0.0"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/contabs.min.js"></script>
<script src="${pageContext.request.contextPath }/js/plugins/pace/pace.min.js"></script>
</body>
</html>