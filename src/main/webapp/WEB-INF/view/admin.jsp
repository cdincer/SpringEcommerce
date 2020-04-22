<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/view/template/Header.jsp"%>

    <title>Product List - Bootstrap</title>

<main role="main">
<br>
<div class="container-wrapper">
<div class="container">

<h1>Administrator Page</h1>

<p class="lead"> This is the administrator page</p>

<c:if test="${pageContext.request.userPrincipal.name !=null}">
<h2>
Welcome:${pageContext.request.userPrincipal.name} | <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
</h2>
</c:if>
<p>Here you can view,check and modify the product inventory!</p>

<h3>
<a href="<c:url value="/admin/productInventory"/>">Product Link</a>
</h3>

</div>



</div>




  <!-- FOOTER -->
<%@include file="/WEB-INF/view/template/Footer.jsp" %>

</main>
<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"></script>
     <!--   <script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="js/bootstrap.bundle.min.js"></script></body> -->
      
         <script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"><\/script>')</script>
         <script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/>"></script></body>
      
</html>



