
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/Header.jsp"%>


<main role="main">
	<br>
	<div class="container-wrapper">
		<div class="container">
			<h1>Product Detail</h1>

			<p class="lead">Single product page</p>

		</div>


		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<img src="#" alt="image" style="width: 100%: height:300px" />

				</div>
				<div class="col-md-5">
					<h3>Product Name</h3>
					<p>Product Description</p>
					<p>Product Manufacturer</p>
					<p>Product Category</p>
					<p>Product Status</p>

				</div>
			</div>
		</div>


	</div>




	<!-- FOOTER -->
	<%@include file="/WEB-INF/view/template/Footer.jsp"%>

</main>
<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"></script>
<!--   <script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="js/bootstrap.bundle.min.js"></script></body> -->

<script>
	window.jQuery||document.write('<script src="<c:url value="/resources/js/jquery-3.4.1.slim.min.js"/>"><\/script>')
</script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/>"></script>
</body>

</html>



