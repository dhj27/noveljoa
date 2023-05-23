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
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark">자유게시판</a></li>
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
				<th colspan="4">제목</th>
				</tr>
			  </thead>
			  
			<tbody>
			<tr>
  			<th>아이디</th>
			<td>여**</td>
			<th>등록일</th>
			<td>2023-05-23 21:21:29</td>
			</tr>
			<tr>
			<th>조회수</th>
			<td colspan="3">8</td>
			</tr>
			<tr>
			<td colspan="4">
			경찰 두명이 서있길래 물어보니 행사 지원이란다. 그려려니하고 보니 킥보드 안전보호구및 2인 탑승...면허? 보자고도 안한다.삼십분 보다가 물었다 행사지원이라고...그럼 위법행위인 키보드는...? 이라고 물었드만 바쁘다나 뭐라나...하...난 갸들 근처오면 신호등 없는 행단보도 건너는것도 무섭드만...차량 운전자는 서행이나 서기라도 하지...행사 지원이라서...바빠서...그런거 단속 안한단다.  무면허인지도 모르는데 면허증 제시해달라는게 몇시간 걸리나? 여긴 청주대 근처이다.킥보드 단속 바빠서?  세금 내는 국민에게 할소리냐?바쁘지않게 경찰을 없에면 되겠네 그래야 조금이나마 세금 덜 내니까.윗대가리에 
<br /> 앉아 있으려면 대가리는 악세사리가 아니였으면 한다.통행권이 보장되야 안전하다고 본다, 뭔 개소리냐고? 밤 늦게다녀도 안전하다고 느끼듯이 낮에도 편안하게 다닐수 있게 해달라는 말이다.그리고 경찰이 벼슬도 아니고 만만해보이단 이유로 민원인들에게 강입적인 행동 많이 보인다.경찰이 참...권위가 어디 까지인지...만만해보이면 말까고 쉬워보이면 무시하네...민중의 지팡이 소리는 이제 들어갔나? 아니면 민중을 때리는 지팡이인가? 행사 운운하지말고 기본부터 지키자 그래야 국민들도 존중한다
			</td>
			</tr>
			</tbody>
		</table>
					
					
							
<form class="">
<div class="row">
  <div class="col-md-6">
    <textarea class="form-control" placeholder="댓글을 작성해주세요." name="body" maxlength="500"></textarea>
  </div>
  <div class="col-md-6">
    <input type="button" value="등록" class="btn btn-dark">
  </div>
</div>
</form>
		
						
<hr>
<h5>댓글 리스트</h5>
<table  class="table table-hover table-sm">
				<thead class="table-dark">
				<tr>
				<th style="width: 600px">작성자 : ㅁㄴㅇ</th>
				<th style="width: 600px">작성일 : 2023-05-23 21:21:29</th>
				<th style="width: 150px"></th>
				<th></th>
				</tr>
			  </thead>
			  
			<tbody>
			<tr>
 			<td colspan="3"> 물어보니 행사 지야 안전어보니 행사 지어보니 행사 지어보니 행사 지어보니 행사 지어보니 행사 지어보니 행사 지어보니 행사 지하다고 </td>
 			<td>
 			<input type="button" value="수정"  class="btn btn-dark">
			<input type="button" value="삭제"  class="btn btn-dark">
			</td>
			</tr>
			</tbody>
		</table>


					
</div> 



<script src="bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
			
</body>
</html>