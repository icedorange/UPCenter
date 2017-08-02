<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/jsp/commons/include.jsp"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>箱子管理</title>
    <jsp:include page="/WEB-INF/jsp/commons/metaheader.jsp" />
    <link href="${ctx}/css/list.css" rel="stylesheet" type="text/css" />
  </head>
  <body class="skin-blue sidebar-mini">
  <div id="content" style="background-color:#ecf0f5">
    <section class="content-header">
      <h1><small>单元柜管理 &gt; 箱子管理</small></h1>
    </section>
  <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <form class="form-inline legend">
                <div class="form-group">
                  <label class="sr-only" for="province">省份/直辖市</label>
                  <select id="province" name="province" class="form-control">
                    <option value=""> --- 选择省份/直辖市 --- </option>
                    <c:forEach items="${provinceList}" var="province">
                      <option value="${province.name}" area-node="${province.node}">${province.name}</option>
                    </c:forEach>
                  </select>
                </div>
                <div class="form-group">
                  <label class="sr-only" for="city">城市</label>
                  <select id="city" name="city" class="form-control">
                    <option value=""> --- 选择城市/地区 --- </option>
                  </select>
                </div>
                <div class="form-group">
                  <label class="sr-only" for="groupName">箱子组</label>
                  <input id="groupName" name="groupName" class="form-control" type="text" placeholder="箱子组">
                  <input id="boxGroupId" name="boxGroupId" type="hidden"/>
                </div>
                <div class="form-group">
                  <label class="sr-only" for="status">状态</label>
                  <select id="status" class="form-control">
                      <option value=""> --- 选择状态 --- </option>
                      <c:forEach items="${statusList}" var="s">
                      <option value="${s}">${s.remark}</option>
                      </c:forEach>
                  </select>
                </div>
                <button type="button" class="btn btn-primary search">&nbsp;&nbsp;搜索&nbsp;&nbsp;</button>
                <button type="reset" class="btn btn-warning reset">&nbsp;&nbsp;重置&nbsp;&nbsp;</button>
              </form>
              <!-- <div class="btn-group"> -->
                <button class="btn btn-info add-btn">&nbsp;&nbsp;新增&nbsp;&nbsp;</button>
              <!-- </div> -->
            </div><!-- /.box-header -->
            <div class="box-body">
              <table id="dataList" class="table table-bordered table-hover">
                <thead>
                  <tr>
                    <th style="width:10%">内部编码（唯一）</th>
                    <th style="width:10%">箱子编码</th>
                    <th style="width:10%">省份/直辖市</th>
                    <th style="width:10%">城市/地区</th>
                    <th style="width:10%">所属箱子组</th>
                    <th style="width:10%">状态</th>
                    <th style="width:12%">创建时间</th>
                    <th style="width:12%">激活时间</th>
                    <th style="width:15%">操作</th>
                  </tr>
                </thead>
                <tbody></tbody>
              </table>
            </div><!-- /.box-body -->
          </div><!-- /.box -->
        </div><!-- /.col -->
      </div><!-- /.row -->
    </section><!-- /.content -->
</div>
    <jsp:include page="/WEB-INF/jsp/commons/metafooter.jsp" />
    <script src="${ctx}/js/jquery.myautocomplete.js<c:if test='${not empty crm}'>?${crm}</c:if>" type="text/javascript"></script>
    <script type="text/javascript" src="${ctx}/js/postbox/boxinfo/boxinfo-list.js<c:if test='${not empty crm}'>?${crm}</c:if>"></script>
  </body>
</html>
