<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    	  })();
    	  
    	 $("#cBtn").click(function(){
    		 $("#cFrm").submit();
    	 }); 
    	  
    	  
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

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .15);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
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
}
</style>
</head>



<body>
 <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
<a
			class="ml-15 mr-16 max-w-[145px] flex-shrink flex-grow basis-0 py-[13.5px] desktop:ml-0 desktop:mr-32 desktop:max-w-[174px] desktop:py-0"
			href="/noveljoa/home/main.jsp"><img class="object-contain"
			width="157" height="60" src="/noveljoa/_next/static/images/logo.png"
			srcSet="/static/images/logo@2x.png 2x, /static/images/logo@3x.png 3x"
			alt="소설조아 logo" /></a>

		<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0"> 
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">홈</a></li>
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">랭킹</a></li>
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">QNA 게시판</a></li>
</ul>

      <div class="col-md-3 text-end">
      <a class=""
				href="/noveljoa/manager/manager_login.jsp"><img
				src="/noveljoa/_next/static/images/key_black.png" width="24"
				height="24" style="margin-right: 30px;"></a>
				<!--  c if로 -->
        <!-- <button type="button" class="btn btn-dark me-2">로그안</button> -->
        <button type="button" class="btn btn-dark me-2" >로그아웃</button>
      </div>
      </header>


			 	<div class="container-fluid">
				
				<table  class="table table-hover table-sm">
				<thead class="table-dark">
				<tr>
				<th colspan="4">제목 : ${  freeBoardData2.title } </th>
				</tr>
			  </thead>
			  
			<tbody>
			<tr>
  			<th>아이디</th>
			<td>${  freeBoardData2.id }</td>
			<th>등록일</th>
			<td>${  freeBoardData2.make }</td>
			</tr>
			<tr>
			<th>조회수</th>
			<td colspan="3">${  freeBoardData2.views }</td>
			</tr>
			<tr>
			<td colspan="4">
			${  freeBoardData2.detail }
			</td>
			</tr>
			</tbody>
		</table>
					
					
							
<form class="" id="cFrm" action="memQNALookFrm_process.do">
<div class="row">
  <div class="col-md-6">
  <!-- 임시 벨류값에 세션에 저장된 아이디 값 넣어야함 -->
  <input type="hidden" name="board_num" value="${  param.board_num }">
  <input type="hidden" name="num_member" value="3">
    <textarea class="form-control" placeholder="댓글을 작성해주세요." name="detail" maxlength="500"></textarea>
  </div>
  <div class="col-md-6">
    <input type="button" value="등록" class="btn btn-dark" id="cBtn">
  </div>
</div>
</form>
		
						
<hr>
<h5>댓글 리스트</h5>
<table  class="table table-hover table-sm">
<c:forEach var="freeBoardcmt" items="${  freeBoardCMTData }" >
				<tr class="table-secondary">
				<th style="width: 600px">아이디 :  ${  freeBoardcmt.id }</th>
				<th style="width: 600px">작성일 : ${  freeBoardcmt.make }</th>
				<th style="width: 150px">${  freeBoardcmt.board_cmt_num }</th>
				<th></th>
				</tr>
			<tr>
 			<td colspan="3">  ${  freeBoardcmt.detail } </td>
 			<td>
 			<!-- <input type="button" value="답변"  class="btn btn-secondary btn-sm"> --><!-- }&num_member=에서 세션값 받아와야함 --><!-- board_num=${  param.board_num }& -->
 			<input type="button" value="수정"  class="btn btn-secondary btn-sm" onclick="location.href='modifyBoardComment.do?board_cmt_num=${  freeBoardcmt.board_cmt_num }&detail=${ freeBoardcmt.detail  }&num_member=${ freeBoardData2.num_member  }'" >
			<input type="button" value="삭제"  class="btn btn-secondary btn-sm" onclick="location.href='removeBoardComment.do?board_cmt_num=${ freeBoardcmt.board_cmt_num  }&board_num=${  param.board_num }' ">
			</td>
			</tr>
			<tr>
			<!-- <th>매니저 답장 : ayo ayo ayo ayo ayo ayo ayo ayo ayo <th> -->
			</tr>
			</c:forEach>				
			

		</table>


					
</div> 



<script src="bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
			
</body>
</html>