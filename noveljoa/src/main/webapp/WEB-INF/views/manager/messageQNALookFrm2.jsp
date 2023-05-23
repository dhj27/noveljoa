<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title></title>
    
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/dashboard/">
    <link href="bootstrap.min.css" rel="stylesheet">

      <!-- jQuery CDN 시작 -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
     <!-- jQuery CDN 끝 -->
      <script type="text/javascript">
      $(function(){
    	  /* globals Chart:false, feather:false */
    	  (() => {
    	    'use strict'

    	    feather.replace({ 'aria-hidden': 'true' })


    	  })()
     
      });
      </script>
      
      <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
      
      .nav-item {
   margin-left: 150px; font-size: 25px; 
   
  }
    </style>
        <!-- Custom styles for this template -->
      <link href="dashboard.css" rel="stylesheet">
      
</head>
<body>

<header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
<a
			class="ml-15 mr-16 max-w-[145px] flex-shrink flex-grow basis-0 py-[13.5px] desktop:ml-0 desktop:mr-32 desktop:max-w-[174px] desktop:py-0"
			href="/project2/home/main.jsp"><img class="object-contain"
			width="157" height="60" src="/project2/_next/static/images/logo.png"
			srcSet="/static/images/logo@2x.png 2x, /static/images/logo@3x.png 3x"
			alt="소설조아 logo" /></a>

		<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0"> 
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">홈</a></li>
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">랭킹</a></li>
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">자유게시판</a></li>
</ul>

      <div class="col-md-3 text-end">
      <a class=""
				href="/project2/manager/manager_login.jsp"><img
				src="/project2/_next/static/images/key_black.png" width="24"
				height="24" style="margin-right: 30px;"></a>
				<!--  c if로 -->
        <!-- <button type="button" class="btn btn-dark me-2">로그안</button> -->
        <button type="button" class="btn btn-dark me-2" >로그아웃</button>
      </div>
    </header>

<div class="container-fluid">
  <div class="row">


    <main class="">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">자유게시판</h1>
        <div class="btn-toolbar mb-2 mb-md-0">

                    <!--  c if로 -->
    <button type="button" class="btn btn-sm btn-outline-secondary" data-bs-toggle="dropdown" aria-expanded="false">
            <span class="align-text-bottom"></span>
            글 작성
          </button>

        </div>
      </div>

      <div class="table-responsive">
        <table class="table table-hover table-sm">
           <thead class="table-dark">
            <tr>
              <th scope="col" style="width: 80px">NO</th>
              <th scope="col" style="width: 400px">제목</th>
              <th scope="col" style="width: 80px">글쓴이</th>
              <th scope="col" style="width: 80px">작성시간</th>
              <th scope="col" style="width: 80px">좋아요 수</th>
            </tr>
          </thead>
          <tbody>
           <c:forEach var="fdata" items="${ freeBoardData  }">
            <tr>
              <td>${  fdata.board_num }</td>
              <td>${  fdata.title }</td>
              <td>${  fdata.uname }</td>
              <td>${  fdata.make }</td>
              <td>${  fdata.views }</td>
            </tr>
            </c:forEach>
           
          </tbody>
        </table>
      </div>
      
    </main>
  </div>
</div>


<script src="bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
      

</body>
</html>