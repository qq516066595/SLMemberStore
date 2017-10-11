<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/11
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp">
    <title>H+ 后台主题UI框架 - 主页</title>

    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->

    <link rel="shortcut icon" href="${pageContext.request.contextPath }/bitbug_favicon.ico">
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/style.min.css?v=4.0.0" rel="stylesheet">
    <link rel="stylesheet"
          href="file:///F:/%E5%89%8D%E7%AB%AF%E7%B4%A0%E6%9D%90/%E5%90%8E%E5%8F%B0%E6%A8%A1%E6%9D%BF/%E6%80%BB%E4%BD%93/%E8%8A%B1%E4%BA%86money%E7%9A%84%E9%AB%98%E7%BA%A7%E5%90%8E%E5%8F%B0%E7%AE%A1%E7%90%86%E6%A8%A1%E6%9D%BF/js/plugins/layer/skin/layer.css"
          id="layui_layer_skinlayercss">
    <script src="file:///F:/%E5%89%8D%E7%AB%AF%E7%B4%A0%E6%9D%90/%E5%90%8E%E5%8F%B0%E6%A8%A1%E6%9D%BF/%E6%80%BB%E4%BD%93/%E8%8A%B1%E4%BA%86money%E7%9A%84%E9%AB%98%E7%BA%A7%E5%90%8E%E5%8F%B0%E7%AE%A1%E7%90%86%E6%A8%A1%E6%9D%BF/js/plugins/layer/extend/layer.ext.js"
            id="layui_layer_extendlayerextjs"></script>
</head>
<body>
<div class="col-sm-6">
    <div class="tabs-container">
        <ul class="nav nav-tabs">
            <li class="active"><a data-toggle="tab" href="#tab-1" aria-expanded="true"> 第一个选项卡</a>
            </li>
            <li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="false">第二个选项卡</a>
            </li>
        </ul>
        <div class="tab-content">
            <div id="tab-1" class="tab-pane active">
                <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper form-inline" role="grid">
                    <table class="table table-striped table-bordered table-hover dataTables-example dataTable" id="DataTables_Table_0"
                           aria-describedby="DataTables_Table_0_info">
                        <thead>
                        <tr role="row">
                            <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="2" colspan="1"
                                aria-label="渲染引擎：激活排序列升序" style="width: 207px;">日期
                            </th>
                            <th tabindex="0" aria-controls="DataTables_Table_0" rowspan="2" colspan="1">新推荐人数</th>
                            <th tabindex="0" aria-controls="DataTables_Table_0" rowspan="2" colspan="1">总碰局数</th>
                            <th tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="3">区域左区</th>
                            <th tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="3">区域右区</th>
                        </tr>
                        <tr role="row">
                            <th>总人数</th>
                            <th>新安置人数</th>
                            <th>剩余碰数</th>
                            <th>总人数</th>
                            <th>新安置人数</th>
                            <th>剩余碰数</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="gradeU odd">
                            <td class="">Other browsers</td>
                            <td class="sorting_1">All others</td>
                            <td class=" ">-</td>
                            <td class="center ">-</td>
                            <td class="center ">U</td>
                            <td class=" ">-</td>
                            <td class="center ">-</td>
                            <td class="center ">U</td>
                            <td class="center ">U</td>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="tab-2" class="tab-pane">
                <div class="panel-body">
                    <strong>移动设备优先</strong>
                    <p>在 Bootstrap 2 中，我们对框架中的某些关键部分增加了对移动设备友好的样式。而在 Bootstrap 3 中，我们重写了整个框架，使其一开始就是对移动设备友好的。这次不是简单的增加一些可选的针对移动设备的样式，而是直接融合进了框架的内核中。也就是说，Bootstrap 是移动设备优先的。针对移动设备的样式融合进了框架的每个角落，而不是增加一个额外的文件。</p>
                </div>
            </div>
        </div>


    </div>
</div>

<button class="btn btn-primary btn-sm" data-toggle="modal" href="awardpage.jsp#edit">编辑</button>
<div id="edit" class="modal fade" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
                <div class="ibox float-e-margins">
                    <form name="update"
                          action="${pageContext.request.contextPath }/jsp/system_management/updateDictionaries"
                          method="post">
                        <div class="ibox-title" style="border-top: 0px;">
                            <h5>修改字典</h5>
                            <small style="color: red; float: right" id="message"></small>
                        </div>
                        <div class="ibox-content">
                            <input type="hidden" name="id" id="insertId"/>
                            名称：<input id="parentNameC" class="parentName" type="text" value=""/>&nbsp;&nbsp;
                            排序：<input id="parentSortC" class="parentSort" type="number" value="" step="1"/>
                            <hr/>
                            <div id="editBox">

                            </div>
                            <hr/>
                            <input type="checkbox" id="addChildrens" value="添加子字典"/>
                            <label for="addChildrens" id="addChildren">添加子字典</label>
                            <div id="addChildrenBox">

                            </div>
                        </div>
                        <div>
                            <input style="float: right" type="submit" class="btn btn-primary btn-sm" value="保存"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath }/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js?v=3.3.5"></script>
<script src="${pageContext.request.contextPath }/js/plugins/jeditable/jquery.jeditable.js"></script>
<script src="${pageContext.request.contextPath }/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath }/js/plugins/dataTables/dataTables.bootstrap.js"></script>
<script src="${pageContext.request.contextPath }/js/content.min.js?v=1.0.0"></script>
<script>
    $(document).ready(function () {
        $(".dataTables-example").dataTable();
        var oTable = $("#editable").dataTable();
    });
</script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/stats.js" charset="UTF-8"></script>
</body>
</html>
