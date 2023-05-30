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
function insertFrm() {
    var cmtNum = $('#cmtNum').val(); 
    var managerCmt = $('textarea[name="managerCmt"]').val();
    var boardNum = '${param.boardNum}'; 
    var insertButton = $('button[type="submit"]');
    
    // 버튼 비활성화
    insertButton.attr('disabled', true);
    
    $.ajax({
        url: 'insertComment.do',
        type: 'POST',
        data: {
            cmtNum: cmtNum,
            managerCmt: managerCmt,
            boardNum: boardNum
        },
        success: function(response) {
            alert("답변이 작성되었습니다.");
            window.location.href = 'messageQNALookFrm.do?boardNum=' + boardNum;
        },
        error: function(xhr, status, error) {
            alert("답변 작성을 실패했습니다.");
        },
        complete: function() {
            // 작성 완료 후 버튼 활성화
            insertButton.attr('disabled', false);
        }
    });
}//insertFrm

function deleteFrm() {
	  var cmtNum = $('input[name="cmtNum"]').val();
	  var deleteButton = $('button[type="submit"]');
	  
	  // 버튼 비활성화
	  deleteButton.attr('disabled', true);
	  
	  $.ajax({
	    url: 'deleteComment.do',
	    method: 'POST',
	    data: { cmtNum: cmtNum },
	    success: function(response) {
	      alert("답변이 삭제되었습니다.");
	      var boardNum = '${param.boardNum}';
	      
	      window.location.href = 'messageQNALookFrm.do?boardNum=' + boardNum;
	    },
	    error: function(xhr, status, error) {
	      alert("답변 삭제를 실패했습니다.");
	    },
	    complete: function() {
	      // 삭제 작업 완료 후 버튼 활성화
	      deleteButton.attr('disabled', false);
	    }
	  });
	}//deleteFrm

	function modifyFrm() {
		  var cmtNum = $('input[name="cmtNum"]').val();
		  var boardNum = '${param.boardNum}';
		  var managerCmt = $('#managerCmt').val();

		  // modifyQNALookFrm으로 페이지 이동
		  window.location.href = 'modifyQNALookFrm.do?cmtNum=' + cmtNum + '&boardNum=' + boardNum + '&managerCmt=' + managerCmt;
		}


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
<form action="deleteBoard.do" method="post" id="deleteBoardFrm">
<input type="hidden" value="${qna.boardNum }" name="boardNum"/>
</form>

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

							<div
								class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 px-18">
								<div
									class="grid grid-cols-12 grid-rows-[auto] gap-x-12  w-full mt-32 mb-80 flex-1 desktop:mt-48 desktop:mb-0">
									<div class="flex flex-col col-span-full">
										<div>
											<div class="flex items-center">
												<div class="typo-dp3 mr-6"></div>
												<span class="typo-g-sm2 -mb-[0.2em] !typo-g-lg1 text-grey60"></span>
											</div>
											<div
												class="flex w-full items-center justify-between border-b-1 py-16">
												<div
													class="relative typo-sm1 rounded-full bg-grey20 py-6 pl-14 pr-8 desktop:bg-transparent desktop:px-0 ml-8">
													<path fill-rule="evenodd" clip-rule="evenodd"
														d="M7.99936 11L2.99872 6.06282L4.05259 4.99541L7.99936 8.8921L11.9461 4.99541L13 6.06282L7.99936 11Z"
														fill="currentColor"></path>
												</div>
											</div>
										</div>


										<article
											class="flex items-start border-b-1 border-black/10 py-16 px-0 desktop:py-22 desktop:px-30">
											<div
												class="flex typo-g-md2 mt-2 mr-12 desktop:mr-16 desktop:typo-g-lg2"></div>
											<div class="flex flex-1 flex-col desktop:flex-row">
												<div
													class="flex flex-1 flex-col justify-start overflow-hidden desktop:mr-80">
													<h3
														class="flex typo-md2 desktop:typo-lg2 mb-8 items-center desktop:mb-16">
														<div class="truncate after:inline-block after:w-0 shrink">
															<c:out value="${qna.boardTitle }"/></div>
													</h3>
													<div
														class="flex typo-sm2 whitespace-pre-line text-grey60 desktop:whitespace-normal mb-14 desktop:mb-0">
														<span><c:out value="${qna.id }"/></span> <span>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;</span>
														<span><fmt:formatDate value="${qna.createDate}" pattern="yyyy.MM.dd HH:mm" /></span> <span>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;</span>
														<span>조회 <c:out value="${qna.views }"/></span>
													</div>
												</div>
												<div class="flex justify-center items-center">
													<button style="height: 33px"
														class="border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium rounded-full"
														type="submit" onclick="document.getElementById('deleteBoardFrm').submit();">삭제</button>
														</div>
											</div>
										</article>



										<article
											class="flex items-start border-b-1 border-black/10 py-16 px-0 desktop:py-22 desktop:px-30">
											<div
												class="flex typo-g-md2 mt-2 mr-12 desktop:mr-16 desktop:typo-g-lg2"></div>
											<div
												class="flex flex-1 flex-col justify-start overflow-hidden"
												style="height: 400px">
												<c:out value="${qna.boardDetail }"/>
											</div>
											<div
												class="flex typo-g-md2 mt-2 mr-12 desktop:mr-16 desktop:typo-g-lg2"></div>
										</article>
									</div>
								</div>
							</div>
					</div>


					<div
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

								<form class="flex flex-col w-full">
									<textarea placeholder="답변을 입력하세요." name="managerCmt" maxlength="500"
										class="typo-md3 rounded-3 border-1 border-grey30 py-14 px-16 placeholder:text-grey60 flex-[1_1_100%] resize-none outline-none typo-md3 min-h-[66px] border-none !bg-transparent !p-0 text-commentText"></textarea>
									<div class="flex mt-8 w-full items-center justify-between">
										<label class="flex typo-md3 items-start"></label>
										<div class="flex items-center">
											<button class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full" 
												type="submit" onclick="insertFrm()">등록</button>
										</div>
									</div>
								</form>
							</div>

						</div>
						<div class="mt-40">
							<div class="border-b-1 pb-8">
								<div class="flex items-end justify-between text-14">
									<div class="flex items-center">
										<h2 class="typo-lg3-b mr-6 desktop:typo-lg1">답변</h2>
										<span
											class="typo-g-sm2 -mb-[0.2em] !desktop:typo-g-lg1 !typo-g-lg3 desktop:text-grey60"></span>
									</div>
								</div>
							</div>
						</div>
						<div>
						
						
						
						<c:forEach var="cmtList" items="${cmtList}">
							<div class="border-commentLine border-b-1 py-20 px-10">
								<div class="flex flex-col relative text-mainText">
									<div class="flex flex-wrap mb-8 items-center">
										<div class="flex mb-2 items-center desktop:mb-0">
											<span class="typo-sm1-b">매니저
											</span>
										</div>
										<div class="flex typo-sm2 items-center text-grey60 ml-16">
											<span><c:out value="${cmtList.createDate }"/></span><span class="order-2 mx-4 desktop:order-none"></span>
										</div>
									</div>
									<div class="typo-md2 desktop:typo-md1">
										<div class="whitespace-pre-wrap"><c:out value="${cmtList.managerCmt }"/></div>
									</div>
									
									
									<div class="flex justify-end">
					<%-- 			<form method="get" id="modifyCommentFrm">
								    <input type="hidden" value="${cmtList.cmtNum}" name="cmtNum" /> --%>
								    <button style="align-items: right;"
								            class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full"
								            type="submit" onclick="location.href='modifyQNALookFrm.do?boardNum=${param.boardNum}&cmtNum=${cmtList.cmtNum}&managerCmt=${cmtList.managerCmt}'">수정</button>
								<!-- </form> -->

								<form action="deleteComment.do" method="post" id="deleteCommentFrm">
							       <input type="hidden" value="${cmtList.cmtNum}" name="cmtNum" />
							        <button style="align-items: right;"
							            class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full"
							            type="submit" onclick="deleteFrm()">삭제</button>
						       </form>
									</div>
									
									
									<div class="flex flex-col relative text-mainText" style="margin-top: 15px;">
								<c:if test="${not empty cmtList.cmtDetail}">
									<div class="flex flex-wrap mb-8 items-center">
										<div class="flex mb-2 items-center desktop:mb-0">
											<span class="typo-sm1-b">유저 아이디 : <c:out value="${cmtList.id }"/></span>
										</div>
										<div class="flex typo-sm2 items-center text-grey60 ml-16">
											<span></span><span class="order-2 mx-4 desktop:order-none"></span>
										</div>
									</div>
									<div class="typo-md2 desktop:typo-md1">
										<div class="whitespace-pre-wrap"><c:out value="${cmtList.cmtDetail }"/></div>
									</div>
								</c:if>
							</div>

									
									
									
									
									
								</div>
							</div>
</c:forEach>







						</div>
					</div>

					</main>



					</main>
				</div>
			</div>
</body>
</html>