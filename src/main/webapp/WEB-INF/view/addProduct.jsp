
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/Header.jsp"%>


<main role="main">
	<br>
	<div class="container-wrapper">
		<div class="container">
			<h1>Admin Product Detail</h1>

			<p class="lead">Admin Single Product Add Page</p>

			<p class="lead">Fill the below information to add a product:</p>
			<form:form
				action="${pageContext.request.contextPath}/admin/addProduct"
				method="post" commandName="product" enctype="multipart/form-data">
				<div class="form-group">
					<label for="name">Product Name</label>
					<form:errors path="productName" cssStyle="color:#fff0000" />
					<form:input path="productName" id="name" class="form-Control" />
					<label for="name">Product Category</label>
					<form:input path="productCategory" id="category" class="form-Control" />
					<label for="name">Product Price</label>
				    <form:errors path="productPrice" cssStyle="color:#fff0000"/>					
					<form:input path="productPrice" id="price" class="form-Control" />
					<label for="name">Product Color</label>
					<form:input path="productColor" id="color" class="form-Control" />
					<div class="form-group"></div>
					<label class="control-label" for="productImage">Upload
						Picture</label>
					<form:input id="productImage" path="productImage" type="file"
						class="form:input-large" />
				</div>
				<input type="submit" value="Submit" class="btn btn-primary">
				<a href="<c:url value="/admin/productInventory"/>"
					class="btn btn-danger">Cancel</a>
				<br>
				<br>
			</form:form>


		</div>



	</div>


	<!-- FOOTER -->
	<%@include file="/WEB-INF/view/template/Footer.jsp"%>

</main>
<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"></script>
<!--   <script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="js/bootstrap.bundle.min.js"></script></body> -->

<script>
	window.jQuery
			|| document
					.write('<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"><\/script>')
</script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/>"></script>
</body>

</html>



