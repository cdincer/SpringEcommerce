
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/view/template/Header.jsp"%>


<main role="main">
<br>
<div class="container-wrapper">
<div class="container">
<h1>All Products</h1>

<p class="lead"> Description for all products </p>

</div>
<table class="table table-striped table-hover">
<thead>
<tr class="bg-success">
<th>A1 Col</th>
<th>A2 Col</th>
<th>B1 Col</th>
<th>B2 Col</th>
<th>C1 Col</th>

</tr>
</thead>
<c:forEach items="${productList}" var="product">
<tr>
<td><img src="#" alt="image"/></td>

<td>${product.productName}</td>
<td>${product.productCategory}</td>
<td>${product.productStatus}</td>
<td>${product.productPrice}</td>

</tr>
</c:forEach>

</table>


</div>




  <!-- FOOTER -->
<%@include file="/WEB-INF/view/template/Footer.jsp" %>

</main>
<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"></script>
     <!--   <script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="js/bootstrap.bundle.min.js"></script></body> -->
      
         <script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"><\/script>')</script>
         <script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/>"></script></body>
      
</html>



