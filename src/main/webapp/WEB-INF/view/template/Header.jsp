<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> 

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.6">

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/carousel/">
<!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->

    <!-- Favicons -->
<link rel="icon" href="<c:url value="/resources/img/favicons/favicon-32x32.png"/>" sizes="32x32" type="image/png">
<link rel="icon" href="<c:url value="/resources/img/favicons/favicon-16x16.png"/>" sizes="16x16" type="image/png">
<link rel="manifest" href="<c:url value="/resources/assets/img/favicons/manifest.json"/>">
<link rel="mask-icon" href="<c:url value="/resources//assets/img/favicons/safari-pinned-tab.svg"/>" color="#563d7c">

<link rel="icon" href="<c:url value="/resources/assets/img/favicons/favicon.ico"/>">

<link  href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet"/>

<meta name="msapplication-config" content="/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/carousel.css"/>" rel="stylesheet">
  </head>
  <body>
    <header>
  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">ECommerce</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="/Ecommerce">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/productList"/>">Products List</a>
        </li>
      <li class="nav-item pull-right">
          <a class="nav-link " href="<c:url value="/admin/"/>">Admin</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
      </ul>

    </div>
  </nav>
</header>