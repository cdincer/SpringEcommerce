<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/view/template/Header.jsp"%>


<main role="main">
	<br>
	<div class="container-wrapper">
		<div class="container">
			<h1>Product Detail</h1>

			<p class="lead">Single product page</p>

		</div>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Here is the detail information of the product!</p>
        </div>

        <div class="container" ng-app = "cartApp">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${product.productId}.png" /> " alt="image"
                             style="width:100%"/>
                </div>

                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                    <p>
                       <strong>Manufacturer</strong> : ${product.productManufacturer}
                    </p>
                    <p>
                        <strong>Category</strong> : ${product.productCategory}
                    </p>
            
                    <h4>${product.productPrice} USD</h4>

                    <br>

                    <c:set var="role" scope="page" value="${param.role}" />
                    <c:set var="url" scope="page" value="/productList" />
                    <c:if test="${role='admin'}">
                        <c:set var="url" scope="page" value="/admin/productInventory" />
                    </c:if>

                    <p ng-controller="cartCtrl">
                        <a href="<c:url value="${url}" />" class="btn btn-secondary">Back</a>
                        <a href="#" class="btn btn-warning btn-large"
                           ng-click="addToCart('${product.productId}')"><span
                                class="glyphicon glyphicon-shopping-cart"></span>Order
                            Now</a>
                        <a href="<spring:url value="/cart" />"
                           class="btn btn-primary"><span class="glyphicon glyphicon-hand-right"></span>View Cart</a>
                    </p>
                </div>
            </div>
        </div>

        <script src="<c:url value="/resources/js/controller.js" /> "></script>

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



