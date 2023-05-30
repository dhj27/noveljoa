<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
 
 $(document).ready(function() {
	    $('#searchInput').keypress(function(event) {
	        if (event.which === 13) { 
	            event.preventDefault();
	            searchBoard();
	        }
	    });

	    $('#searchButton').click(function() {
	        searchBoard();
	    });

	    function searchBoard() {
	        var id = $('#searchInput').val();
	        var form = $('<form action="messageQNABoardFrm.do" method="get"></form>');
	        form.append('<input type="text" name="id" value="' + id + '">');
	        form.appendTo('body').submit().remove();
	    }
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
</style>
    <!-- Custom styles for this template -->
  <link href="dashboard.css" rel="stylesheet">
</head>
<body>

<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6" href="dashBoardFrm.do">소설조아</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
<div class="input-group">
    <input id="searchInput" class="form-control form-control-dark rounded-0 border-0" type="text" placeholder="아이디 조회" aria-label="Search">
    <button id="searchButton" class="btn btn-dark rounded-0" type="button">검색</button>
</div>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="navbar-nav">
    <div class="nav-item text-nowrap">
      <a class="nav-link px-3" href="managerLogout.do">Sign out</a>
    </div>
  </div>
</header>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="position-sticky pt-3 sidebar-sticky">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="dashBoardFrm.do">
              <span data-feather="home" class="align-text-bottom"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="memberManagerFrm.do">
              <span data-feather="users" class="align-text-bottom"></span>
             Member
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="managerNovelFrm.do">
              <span data-feather="book-open" class="align-text-bottom"></span>
              Novel
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="messageQNABoardFrm.do">
              <span data-feather="clipboard" class="align-text-bottom"></span>
              Q&A Board
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="commentManagerFrm.do">
              <span data-feather="message-square" class="align-text-bottom"></span>
              Comment
            </a>
          </li>
        </ul>
     
      </div>
    </nav>

    <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Q&A Board</h1>
      </div>

      <div class="table-responsive">
        <table class="table table-hover table-sm">
           <thead class="table-dark">
            <tr>
              <th scope="col">번호</th>
              <th scope="col">제목</th>
              <th scope="col">아이디</th>
              <th scope="col">작성일</th>
              <th scope="col">조회수</th>
              <th scope="col">답변 여부</th>
            </tr>
          </thead>
          <c:if test="${empty boardList }">
			<tr>
			<td colspan="7"><c:out value="${param.id }"/>글이 존재하지 않습니다.</td>
         	</tr>
          </c:if>
         <c:forEach var="qnaList" items="${boardList}">
			<tr>
			<td><input type="button" class="btn btn-dark btn-sm" value="${qnaList.boardNum }" onclick="location.href='messageQNALookFrm.do?boardNum=${qnaList.boardNum}'"></td>
			<td><c:out value="${qnaList.boardTitle }"/></td>
			<td><c:out value="${qnaList.id }"/></td>
			<td><fmt:formatDate value="${qnaList.createDate}" pattern="yyyy.MM.dd HH:mm" /></td>
			<td><c:out value="${qnaList.views }"/></td>
			<td>
			<c:choose>
			    <c:when test="${qnaList.reply == 0}">미등록</c:when>
			    <c:when test="${qnaList.reply >= 1}">등록</c:when>
			</c:choose>
			</td>
			</tr>
		</c:forEach>
          
        </table>
      </div>
    </main>
  </div>
</div>


<script src="bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
      

</body>
</html>