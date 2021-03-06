<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@page import="com.banvien.tpk.core.Constants" %>

<head>
    <title><fmt:message key="whm.machinecomponent.title"/></title>
    <meta name="heading" content="<fmt:message key="whm.machinecomponent.title"/>"/>
</head>

<c:url var="url" value="/whm/machinecomponent/edit.html"/>
<c:url var="backUrl" value="/whm/machinecomponent/list.html"/>
<form:form commandName="item" action="${url}" method="post" id="itemForm" class="form-horizontal" novalidate="novalidate">
    <div id="container-fluid data_content_box">
        <div class="row-fluid data_content">

            <c:if test="${!empty errorMessage}">
                <div class="alert alert-error">
                    <a class="close" data-dismiss="alert" href="#">x</a>
                        ${errorMessage}
                </div>
                <div style="clear:both;"></div>
            </c:if>
            <c:if test="${!empty successMessage}">
                <div class="alert alert-success">
                    <a class="close" data-dismiss="alert" href="#">x</a>
                        ${successMessage}
                </div>
                <div style="clear:both;"></div>
            </c:if>

            <div class="content-header">
                <c:choose>
                    <c:when test="${not empty item.pojo.machineComponentID}">
                        <fmt:message key="whm.machinecomponent.edit"/>
                    </c:when>
                    <c:otherwise>
                        <fmt:message key="whm.machinecomponent.new"/>
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="clear"></div>
            <div class="row-fluid">
                <div class="pane_info">
                    <div class="pane_title"><fmt:message key="whm.machinecomponent.info"/></div>
                    <div class="pane_content">
                        <div class="control-group">
                                <%--<label class="control-label"><fmt:message key="whm.machine.name"/></label>--%>
                                <%--<div class="controls">--%>
                                <%--<form:select path="pojo.machine.machineID" cssClass="required" cssStyle="width: 360px;">--%>
                                <%--<option value="-1">---Chọn---</option>--%>
                                <%--<c:forEach items="${machines}" var="machine">--%>
                                <%--<option value="${machine.machineID}" <c:if test="${machine.machineID eq item.pojo.machine.machineID}">selected</c:if>>--%>
                                <%--${machine.name} - ${machine.code}--%>
                                <%--</option>--%>
                                <%--</c:forEach>--%>
                                <%--</form:select>--%>
                                <%--</div>--%>

                            <label class="control-label"><fmt:message key="label.name"/></label>
                            <div class="controls">
                                <form:input path="pojo.name" cssClass="required nohtml nameValidate" size="25" maxlength="45"/>
                                <form:errors path="pojo.name" cssClass="error-inline-validate"/>
                            </div>
                            <label class="control-label"><fmt:message key="label.code"/></label>
                            <div class="controls">
                                <form:input path="pojo.code" cssClass="nohtml nameValidate" size="25" maxlength="45"/>
                            </div>

                            <label class="control-label"><fmt:message key="label.description"/></label>
                            <div class="controls">
                                <form:textarea path="pojo.description" cssClass="nohtml nameValidate" rows="5" cols="25"/>
                            </div>


                                <%--<label class="control-label"><fmt:message key="label.no.reserve"/></label>--%>
                                <%--<div class="controls">--%>
                                <%--<form:input path="pojo.reserve" cssClass="nohtml width0" size="3" maxlength="45"/>--%>
                                <%--</div>--%>

                                <%--<label class="control-label"><fmt:message key="whm.last.maintenance.date"/></label>--%>
                                <%--<div class="controls">--%>
                                <%--<div class="input-append date" >--%>
                                <%--<fmt:formatDate var="lastMaintenanceDate" value="${item.pojo.lastMaintenanceDate}" pattern="dd/MM/yyyy"/>--%>
                                <%--<input name="pojo.lastMaintenanceDate" id="lastMaintenanceDate" class="prevent_type text-center width5" value="${lastMaintenanceDate}" type="text" />--%>
                                <%--<span class="add-on" id="lastMaintenanceDateIcon"><i class="icon-calendar"></i></span>--%>
                                <%--</div>--%>
                                <%--</div>--%>

                                <%--<label class="control-label"><fmt:message key="whm.no.next.maintenance.day"/></label>--%>
                                <%--<div class="controls">--%>
                                <%--<form:input path="pojo.nextMaintenance" cssClass="nohtml width0" size="3" maxlength="45"/> <fmt:message key="label.no.day"/>--%>
                                <%--</div>--%>

                            <label class="control-label">
                                <fmt:message key="label.status"/>
                            </label>
                            <div class="controls" style="margin-top: 5px;">
                                <label class="label-inline"><form:radiobutton path="pojo.status" value="${Constants.MACHINE_NORMAL}" cssClass="radioCls"/>&nbsp;<fmt:message key="label.normal"/></label>
                                <label class="label-inline"><form:radiobutton path="pojo.status" value="${Constants.MACHINE_WARNING}" cssClass="radioCls"/>&nbsp;<fmt:message key="label.need.maintenance"/></label>
                                <label class="label-inline"><form:radiobutton path="pojo.status" value="${Constants.MACHINE_STOP}" cssClass="radioCls"/>&nbsp;<fmt:message key="label.machine.stop"/></label>

                            </div>
                            <div class="controls">
                                <security:authorize ifAnyGranted="MAY_THIET_BI">
                                    <c:if test="${empty item.pojo.machine.confirmStatus || item.pojo.machine.confirmStatus < Constants.MACHINE_SUBMIT}">
                                        <a onclick="$('#itemForm').submit();" class="btn btn-success btn-green" style="cursor: pointer;">
                                            <fmt:message key="button.save"/>
                                        </a>
                                    </c:if>
                                </security:authorize>
                                <div style="display: inline">
                                    <form:hidden path="crudaction" id="crudaction" value="insert-update"/>
                                    <form:hidden path="pojo.machineComponentID"/>
                                    <a href="${backUrl}" class="cancel-link">
                                        <fmt:message key="button.cancel"/>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form:form>



<script type="text/javascript">
    $(document).ready(function(){

        var lastMaintenanceDateVar = $("#lastMaintenanceDate").datepicker({
            format: 'dd/mm/yyyy',
            onRender: function(date){
            }}).on('changeDate', function(ev) {
                    lastMaintenanceDateVar.hide();
                }).data('datepicker');

        $('#lastMaintenanceDateIcon').click(function() {
            $('#lastMaintenanceDate').focus();
            return true;
        });
    });
</script>
