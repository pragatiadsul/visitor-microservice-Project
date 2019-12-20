<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

    <title>Create an account</title>

<jsp:include page="head_files.jsp"/>

<div class="container">
<div class="row">
<div class="col-xs-12">

    <form:form method="POST" modelAttribute="visitor" class="form-signin">
       
        <h2 class="form-signin-heading">Create your account</h2>
        
        <spring:bind path="name">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="name" class="form-control" placeholder="name" autofocus="true"></form:input>
                <form:errors path="name"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="email" path="email" class="form-control" placeholder="email"></form:input>
                <form:errors path="email"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="mobileNo">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="mobileNo" path="mobileNo" class="form-control" placeholder="mobileNo"></form:input>
                <form:errors path="mobileNo"></form:errors>
            </div>
        </spring:bind>
        
         <spring:bind path="address">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="address" path="address" class="form-control" placeholder="address"></form:input>
                <form:errors path="address"></form:errors>
            </div>
        </spring:bind>
        
        
         <spring:bind path="idProof">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="idProof" path="idProof" class="form-control" placeholder="idProof"></form:input>
                <form:errors path="idProof"></form:errors>
            </div>
        </spring:bind>
        
        
         <spring:bind path="contactPersonName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="contactPersonName" path="contactPersonName" class="form-control" placeholder="contactPersonName"></form:input>
                <form:errors path="contactPersonName"></form:errors>
            </div>
        </spring:bind>
        
         <spring:bind path="contactPersonEmail">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="contactPersonEmail" path="contactPersonEmail" class="form-control" placeholder="contactPersonEmail"></form:input>
                <form:errors path="contactPersonEmail"></form:errors>
            </div>
        </spring:bind>
        
        
         <spring:bind path="reasonForVisit">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="reasonForVisit" path="reasonForVisit" class="form-control" placeholder="reasonForVisit"></form:input>
                <form:errors path="reasonForVisit"></form:errors>
            </div>
        </spring:bind>
        
        
         <spring:bind path="contactPersonMobileNo">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="contactPersonMobileNo" path="contactPersonMobileNo" class="form-control" placeholder="contactPersonMobileNo"></form:input>
                <form:errors path="contactPersonMobileNo"></form:errors>
            </div>
        </spring:bind>
        
        <button class="btn btn-primary btn-lg btn-block" type="submit">Submit</button>
    </form:form>

</div>
</div>
</div><!-- /container -->
<jsp:include page="footer.jsp"/>
