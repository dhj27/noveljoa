<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" />
<meta name="next-head-count" content="2" />
<link rel="preconnect" href="https://fonts.gstatic.com"	crossorigin="anonymous" />
<link rel="stylesheet"	data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&amp;display=swap" />
<link rel="preload"	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css"	as="style" />
<link rel="stylesheet" href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css" data-n-g="" />
<link rel="stylesheet" type="text/css" href="/noveljoa/_next/static/css/login.css" />
    <link rel="canonical" href="dashboard.js">
    <link href="bootstrap.min.css" rel="stylesheet">

<script src="bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>

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
    </style>
        <!-- Custom styles for this template -->
      <link href="dashboard.css" rel="stylesheet">
</head>
<body>
<form action="deleteNovel.do" method="post" id="deleteNovelFrm">
<input type="hidden" value="${report.novelNum }" name="novelNum"/>
</form>
<form action="publicNovel.do" method="post" id="publicNovelFrm">
<input type="hidden" value="${report.novelNum }" name="novelNum"/>
</form>
<form action="privateNovel.do" method="post" id="privateNovelFrm">
<input type="hidden" value="${report.novelNum }" name="novelNum"/>
</form>

	<div id="__next" data-reactroot="">
		<div
			style="display: none; background-color: canvas; color-scheme: light"></div>
		<div class="lightMode h-full">
			<div class="flex flex-col h-full">
				<div class="z-1">
				</div>

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
					<section
						class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22">
						<div class="flex flex-col flex-1">
							<div class="mt-16 desktop:mb-48 desktop:mt-56">
								<div>
									<div class="flex mb-4 items-end" >
										<h1 class="typo-dp1 mr-40 flex-1 break-words"
											style="display: inline-flex;"><c:out value="${report.novelTitle }"/> &nbsp;
											<c:if test="${report.ageAble == 1}"><!-- 0 -> false(전체 이용가) 1 -> true(15세 이용가) -->
												<img alt="" src="/noveljoa/_next/static/images/age.png" style="width: 45px; height: 42px">
											</c:if>
										</h1>
										<div
											class="flex w-full shrink-0 desktop:w-auto desktop:self-center">
											<div class="flex typo-g-sm2 flex-1 items-center text-grey60">
												<div
													class="relative overflow-visible mt-auto mb-0 desktop:my-auto">
													
															<button data-text-content="true" id=""
																style="font-size: 16px; width: 69px; height: 38px; color: rgb(255, 255, 255); text-align: center; line-height: 2.5em; border-radius: 4px; background-color: rgb(0, 0, 0); font-weight: bold;"
																type="submit" class="btn-public"
																onclick="document.getElementById('deleteNovelFrm').submit();">삭제</button>
													<span style="display: inline-block; width: 10px;"></span>
															<button data-text-content="true" id=""
																style="font-size: 16px; width: 69px; height: 38px; color: rgb(255, 255, 255); text-align: center; line-height: 2.5em; border-radius: 4px; background-color: rgb(0, 0, 0); font-weight: bold;"
																type="submit" class="btn-public"
																onclick="document.getElementById('publicNovelFrm').submit();">공개</button>
													<span style="display: inline-block; width: 10px;"></span> 
																<button data-text-content="true" id=""
																style="font-size: 16px; width: 69px; height: 38px; color: rgb(255, 255, 255); text-align: center; line-height: 2.5em; border-radius: 4px; background-color: rgb(0, 0, 0); font-weight: bold;"
																type="button" class="btn-public"
																onclick="document.getElementById('privateNovelFrm').submit();">비공개</button>
													<span style="display: inline-block; width: 10px;"></span>
													<button data-text-content="true"  id=""
														style="font-size: 16px; width: 69px; height: 38px; color: rgb(255, 255, 255); text-align: center; line-height: 2.5em; border-radius: 4px; background-color: rgb(0, 0, 0); font-weight: bold;"
														type="button" onclick="history.back()">돌아가기</button>
												</div>
											</div>
										</div>

										<div class="flex shrink-0 items-center">
											<div class="relative overflow-visible"></div>
										</div>
									</div>
									<div class="flex typo-md3 items-center">
										<span><c:out value="${report.id }"/></span><span class="mx-4 text-10 mx-8 text-grey20"></span>
									</div>
									<div class="flex mt-30 items-center">
										<div
											class="flex relative shrink-0 items-start overflow-hidden mr-30 h-180 w-118 cursor-zoom-in"
											style="height: 180px;">
											<span
												style="box-sizing: border-box; display: inline-block; overflow: hidden; width: 118px; height: 180px; background: none; opacity: 1; border: 0px; margin: 0px; padding: 0px; position: relative;"><img
												src="/noveljoa/_next/static/images/novel_thumb/<c:out value="${report.thumbnail }"/>
												decoding="async"
												data-nimg="fixed"
												style="position: absolute; inset: 0px; box-sizing: border-box; padding: 0px; border: none; margin: auto; display: block; width: 0px; height: 0px; min-width: 100%; max-width: 100%; min-height: 100%; max-height: 100%; object-fit: cover;"></span>
										</div>
										<div class="flex flex-col flex-1 self-stretch">
											<div
												class="typo-md3 text-14 text-grey70 desktop:max-w-[680px]">
												<span width="0"><span><span><c:out value="${report.intro }"/></span><br>
														<span></span><br> <span></span></span><span
													style="position: fixed; visibility: hidden; top: 0px; left: 0px;"><button
															class="font-bold">
															...<span class="ml-4 border-b-1 border-grey70">더보기</span>
														</button></span></span>
											</div>
											<div class="mt-auto"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="px-18 desktop:px-0"></div>
							<div class="border-b-1 py-9 desktop:border-b-2 desktop:py-12">
								<div class="flex typo-md3 items-center justify-between">
									<div class="flex typo-lg3-b items-center desktop:typo-lg1">
									<img alt="" src="/noveljoa/_next/static/images/report.png" style="height: 50px; width: 50px">
										&nbsp; 신고
									</div>
								</div>
							</div>
							<section class="flex flex-col desktop:mb-96">
							
							<c:set var="reportValue">
							    <c:choose>
							        <c:when test="${report.reportReason == 1}">영리목적/홍보성</c:when>
							        <c:when test="${report.reportReason == 2}">욕설/인신공격</c:when>
							        <c:when test="${report.reportReason == 3}">불법정보</c:when>
							        <c:when test="${report.reportReason == 4}">개인정보노출</c:when>
							        <c:when test="${report.reportReason == 5}">음란성/선정성</c:when>
							        <c:when test="${report.reportReason == 6}">같은 내용 도배</c:when>
							        <c:when test="${report.reportReason == 7}">권리침해 신고</c:when>
							        <c:when test="${report.reportReason == 8}">불법촬영물 유통 신고</c:when>
							        <c:when test="${report.reportReason == 9}">기타 사유</c:when>
							    </c:choose>
							</c:set>
							
								<c:if test="${report.reportCnt != 0}">
								    <article>
								        <a href="/noveljoa/writer_novel.do?num_novel=<c:out value='${report.novelNum}'/>"
								           style="text-decoration: none;" class="flex border-black/10 bg-white px-18 visited:bg-grey10 desktop:border-b-1 desktop:px-30" >
								            <div class="border-b-1 border-black/10 desktop:border-0 flex flex-1 py-16 desktop:py-22">
								                <div class="flex flex-col flex-1 justify-between desktop:mr-16 desktop:flex-row desktop:items-center">
								                    <div class="flex flex-col flex-1">
								                        <div class="flex mb-14 mt-0 flex-1 items-center desktop:mb-16 desktop:mt-2 typo-md2 text-black desktop:typo-lg2 max-h-[28px] overflow-hidden">
								                            <div class="truncate after:inline-block after:w-0 shrink" style="text-align: center;">
								                                신고 사유 : ${reportValue} | 신고 수 : <c:out value="${report.reportCnt}"/>회
								                            </div>
								                        </div>
								                    </div>
								                </div>
								            </div>
								        </a>
								    </article>
								</c:if>
								<c:if test="${report.reportCnt == 0}">
								    <article>
								        <div class="flex border-black/10 bg-white px-18 visited:bg-grey10 desktop:border-b-1 desktop:px-30">
								            <div class="border-b-1 border-black/10 desktop:border-0 flex flex-1 py-16 desktop:py-22">
								                <div class="flex flex-col flex-1 justify-between desktop:mr-16 desktop:flex-row desktop:items-center">
								                    <div class="flex flex-col flex-1">
								                        <div class="flex mb-14 mt-0 flex-1 items-center desktop:mb-16 desktop:mt-2 typo-md2 text-black desktop:typo-lg2 max-h-[28px] overflow-hidden">
								                            <div class="truncate after:inline-block after:w-0 shrink" style="text-align: center;">
								                                신고된 정보가 없습니다.
								                            </div>
								                        </div>
								                    </div>
								                </div>
								            </div>
								        </div>
								    </article>
								</c:if>

							</section>
						</div>
					</section>
				</main>
</main>
</div>
</div>

 </body>
</html>
