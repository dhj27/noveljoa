<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.104.2">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" />
<meta name="next-head-count" content="2" />
<link rel="preconnect" href="https://fonts.gstatic.com"
	crossorigin="anonymous" />
<link rel="stylesheet"
	data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&amp;display=swap" />
<link rel="preload"
	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css"
	as="style" />
<link rel="stylesheet"
	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css"
	data-n-g="" />
<link rel="stylesheet" type="text/css"
	href="/noveljoa/_next/static/css/login.css" />
<link rel="canonical" href="dashboard.js">
<link href="bootstrap.min.css" rel="stylesheet">

<script src="bootstrap.bundle.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js"
	integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE"
	crossorigin="anonymous"></script>

<!-- jQuery CDN 시작 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script>
function updateFrm() {
    var managerCmt = $('textarea[name="managerCmt"]').val();
    var boardNum = '${param.boardNum}';

    $.ajax({
        url: 'modifyComment.do',
        method: 'GET',
        data: {
            managerCmt: managerCmt
        },
        success: function(response) {
            alert("댓글이 수정되었습니다.");
            window.location.href = 'messageQNALookFrm.do?boardNum=' + boardNum;
        },
        error: function(xhr, status, error) {
            alert("댓글 수정에 실패하였습니다.");
        }
    });
}//updateFrm

</script>
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
</style>
<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
</head>
<body>
	<div id="__next" data-reactroot="">
		<div
			style="display: none; background-color: canvas; color-scheme: light"></div>
		<div class="lightMode h-full">
			<div class="flex flex-col h-full">
				<div class="z-1"></div>

<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow" >
  <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6" href="#">소설조아</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
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
						<!-- <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4"> -->


						<main class="flex-1">

							
					</div>


					<div style="margin-top: 200px"
						class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 px-18 mt-32 desktop:mt-47">
						<div class="flex flex-col flex-1"></div>
					</div>

					<div
						class="flex flex-col my-0 mx-auto min-h-full w-full max-w-[700px] bg-subBackground text-mainText">



						<div class="flex flex-col">
							<div
								class="border-commentFormLine border-t-1 bg-commentTextForm p-16 desktop:rounded-3  desktop:border-1 bg-commentTextForm">
								<div style="height: 30px">
									<button
										class="flex items-center cursor-pointer typo-md3-b text-subText"
										type="button">매니저</button>
								</div>

								<form class="flex flex-col w-full" action="modifyComment.do" method="get" id="modifyCommentFrm">
								  <textarea placeholder="${ param.managerCmt}" name="managerCmt" maxlength="500"
								    class="typo-md3 rounded-3 border-1 border-grey30 py-14 px-16 placeholder:text-grey60 flex-[1_1_100%] resize-none outline-none typo-md3 min-h-[66px] border-none !bg-transparent !p-0 text-commentText"></textarea>
								  <div class="flex mt-8 w-full items-center justify-between">
								    <label class="flex typo-md3 items-start"></label>
								    <div class="flex items-center">
							       <input type="hidden" value="${param.cmtNum}" name="cmtNum" />
							       <input type="hidden" value="${param.boardNum}" name="boardNum" />
							        <button style="align-items: right;"
							            class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full"
							            type="submit" onclick="updateFrm()">수정</button>
						       </form>
    </div>
  </div>
							</div>

						</div>
					</div>

					</main>



					</main>
				</div>
			</div>
</body>
</html>