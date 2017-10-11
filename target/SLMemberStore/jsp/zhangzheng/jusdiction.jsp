
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
  <meta name="apple-mobile-web-app-capable" content="yes"/>
  <title>H+ 后台主题UI框架 - 数据表格</title>
  <link rel="shortcut icon" href="${pageContext.request.contextPath }/bitbug_favicon.ico">
  <link href="${pageContext.request.contextPath }/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
  <link href="${pageContext.request.contextPath }/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
  <!-- Data Tables -->
  <link href="${pageContext.request.contextPath }/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath }/css/animate.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath }/css/style.min.css?v=4.0.0" rel="stylesheet">
  <link href="${pageContext.request.contextPath }/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
  <link href="${pageContext.request.contextPath }/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
  <link href="${pageContext.request.contextPath }/js/styles.css" type="text/css" rel="stylesheet"/>
  <link href="${pageContext.request.contextPath }/js/styles.css" type="text/css" rel="stylesheet"/>
  <script src="${pageContext.request.contextPath }/js/scripts/jquery-1.7.1.min.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/jquery-ui-1.8.10.custom.min.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/axQuery.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/globals.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/axutils.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/annotation.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/axQuery.std.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/doc.js"></script>
  <script src="${pageContext.request.contextPath }/js/document.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/messagecenter.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/events.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/action.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/expr.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/geometry.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/flyout.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/ie.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/model.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/repeater.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/sto.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/utils.temp.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/variables.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/drag.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/move.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/visibility.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/style.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/adaptive.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/tree.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/init.temp.js"></script>
  <script src="${pageContext.request.contextPath }/js/data.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/legacy.js"></script>
  <script src="${pageContext.request.contextPath }/js/scripts/prototype/viewer.js"></script>






  <base target="_blank">
</head>

<body class="gray-bg">
<!-- 权限 (动态面板) -->
<div style="z-index: 20" id="u149" class="ax_动态面板" data-label="权限">
  <div id="u149_state0" class="panel_state" data-label="State1">

    <!-- Unnamed (形状) -->
    <div id="u150" class="ax_形状">
      <img id="u150_img" class="img " src="${pageContext.request.contextPath }/img/u150.png"/>
      <!-- Unnamed () -->
      <div id="u151" class="text"></div>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u152" class="ax_文本">
      <img id="u152_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u153" class="text">
        <p><span style="font-family:'Applied Font Bold', 'Applied Font';">权限管理</span></p>
      </div>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u154" class="ax_文本">
      <img id="u154_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u155" class="text">
        <p><span style="font-family:'Applied Font Bold', 'Applied Font';">角色：</span></p>
      </div>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u156" class="ax_文本">
      <img id="u156_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u157" class="text">
        <p><span style="font-family:'Applied Font Bold', 'Applied Font';">权限</span><span style="font-family:'Applied Font Bold', 'Applied Font';">选择</span><span style="font-family:'Applied Font Bold', 'Applied Font';">：</span></p>
      </div>
    </div>

    <!-- Unnamed (水平线) -->
    <div id="u158" class="ax_水平线">
      <img id="u158_start" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u158_start"/>
      <img id="u158_end" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u158_end"/>
      <img id="u158_line" class="img " src="${pageContext.request.contextPath }/img/u158_line.png" alt="u158_line"/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u159" class="ax_复选框">
      <label for="u159_input">
        <!-- Unnamed () -->
        <div id="u160" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">系统配置</span></p>
        </div>
      </label>
      <input id="u159_input" type="checkbox" value="checkbox"/>
    </div>

    <!-- Unnamed (水平线) -->
    <div id="u161" class="ax_水平线">
      <img id="u161_start" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u161_start"/>
      <img id="u161_end" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u161_end"/>
      <img id="u161_line" class="img " src="${pageContext.request.contextPath }/img/u161_line.png" alt="u161_line"/>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u162" class="ax_文本">
      <img id="u162_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u163" class="text">
        <p><span style="font-family:'Applied Font Regular', 'Applied Font';">系统设置</span></p>
      </div>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u164" class="ax_复选框">
      <label for="u164_input">
        <!-- Unnamed () -->
        <div id="u165" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">登录日志</span></p>
        </div>
      </label>
      <input id="u164_input" type="checkbox" value="checkbox"/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u166" class="ax_复选框">
      <label for="u166_input">
        <!-- Unnamed () -->
        <div id="u167" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">操作日志</span></p>
        </div>
      </label>
      <input id="u166_input" type="checkbox" value="checkbox"/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u168" class="ax_复选框">
      <label for="u168_input">
        <!-- Unnamed () -->
        <div id="u169" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">角色管理</span></p>
        </div>
      </label>
      <input id="u168_input" type="checkbox" value="checkbox"/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u170" class="ax_复选框">
      <label for="u170_input">
        <!-- Unnamed () -->
        <div id="u171" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">权限分配</span></p>
        </div>
      </label>
      <input id="u170_input" type="checkbox" value="checkbox"/>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u172" class="ax_文本">
      <img id="u172_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u173" class="text">
        <p><span style="font-family:'Applied Font Regular', 'Applied Font';">我的桌面</span></p>
      </div>
    </div>

    <!-- Unnamed (水平线) -->
    <div id="u174" class="ax_水平线">
      <img id="u174_start" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u174_start"/>
      <img id="u174_end" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u174_end"/>
      <img id="u174_line" class="img " src="${pageContext.request.contextPath }/img/u174_line.png" alt="u174_line"/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u175" class="ax_复选框">
      <label for="u175_input">
        <!-- Unnamed () -->
        <div id="u176" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">最新通告</span></p>
        </div>
      </label>
      <input id="u175_input" type="checkbox" value="checkbox" checked/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u177" class="ax_复选框">
      <label for="u177_input">
        <!-- Unnamed () -->
        <div id="u178" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">待处理任务</span></p>
        </div>
      </label>
      <input id="u177_input" type="checkbox" value="checkbox" checked/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u179" class="ax_复选框">
      <label for="u179_input">
        <!-- Unnamed () -->
        <div id="u180" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">工作</span><span style="font-family:'Applied Font Regular', 'Applied Font';">安排与</span><span style="font-family:'Applied Font Regular', 'Applied Font';">提醒</span></p>
        </div>
      </label>
      <input id="u179_input" type="checkbox" value="checkbox" checked/>
    </div>

    <!-- Unnamed (复选框) -->
    <div id="u181" class="ax_复选框">
      <label for="u181_input">
        <!-- Unnamed () -->
        <div id="u182" class="text">
          <p><span style="font-family:'Applied Font Regular', 'Applied Font';">我的便签</span></p>
        </div>
      </label>
      <input id="u181_input" type="checkbox" value="checkbox" checked/>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u183" class="ax_文本">
      <img id="u183_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u184" class="text">
        <p><span style="font-family:'Applied Font Regular', 'Applied Font';">.........</span></p>
      </div>
    </div>

    <!-- Unnamed (图片) -->
    <div id="u185" class="ax_图片">
      <img id="u185_img" class="img " src="${pageContext.request.contextPath }/img/u452.png"/>
      <!-- Unnamed () -->
      <div id="u186" class="text"></div>
    </div>

    <!-- Unnamed (水平线) -->
    <div id="u187" class="ax_水平线">
      <img id="u187_start" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u187_start"/>
      <img id="u187_end" class="img " src="${pageContext.request.contextPath }/img/transparent.gif" alt="u187_end"/>
      <img id="u187_line" class="img " src="${pageContext.request.contextPath }/img/u187_line.png" alt="u187_line"/>
    </div>

    <!-- Unnamed (图片) -->
    <div id="u188" class="ax_图片">
      <img id="u188_img" class="img " src="${pageContext.request.contextPath }/img/u167.png"/>
      <!-- Unnamed () -->
      <div id="u189" class="text"></div>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u190" class="ax_文本">
      <img id="u190_img" class="img " src="${pageContext.request.contextPath }/img/transparent.gif"/>
      <!-- Unnamed () -->
      <div id="u191" class="text">
        <p><span style="font-family:'Applied Font Regular', 'Applied Font';">人事专员</span></p>
      </div>
    </div>

    <!-- Unnamed (形状) [footnote] -->
    <div id="u190_ann" class="annotation"></div>

    <!-- Unnamed (形状) -->
    <div id="u192" class="ax_形状">
      <img id="u192_img" class="img " src="${pageContext.request.contextPath }/img/u192.png"/>
      <!-- Unnamed () -->
      <div id="u193" class="text">
        <p><span style="font-family:'Applied Font Regular', 'Applied Font';">保存</span></p>
      </div>
    </div>

    <!-- Unnamed (形状) -->
    <div id="u194" class="ax_形状">
      <img id="u194_img" class="img " src="${pageContext.request.contextPath }/img/u192.png"/>
      <!-- Unnamed () -->
      <div id="u195" class="text">
        <p><span style="font-family:'Applied Font Regular', 'Applied Font';">取消</span></p>
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
    });
</script>

</body>
</html>


