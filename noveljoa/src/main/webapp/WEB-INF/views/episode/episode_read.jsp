<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
      pageContext.setAttribute("crcn", "\r\n"); //Space, Enter
      pageContext.setAttribute("br", "<br/>"); //br 태그
%> 
  
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charSet="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" />
<title> 소설 읽기 | 카카오페이지 스테이지</title>
<link rel="preconnect" href="https://fonts.gstatic.com"	crossorigin="anonymous" />
<link rel="stylesheet"	data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&amp;display=swap" />
<link rel="preload"	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css"	as="style" />
<link rel="stylesheet" href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css" data-n-g="" />
<link rel="preload"	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/593189bb3d3dd926.css"	as="style" />
<link rel="stylesheet" href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/593189bb3d3dd926.css" data-n-p="" />
<link rel="stylesheet" type="text/css" href="_next/static/css/login.css" />
<!-- bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>


<style type="text/css">
	.flex-container {
		display: flex;
		justify-content: center; /* 버튼 요소들을 수평 중앙 정렬 */
		align-items: center; /* 버튼 요소들을 수직 중앙 정렬 */
		/* flex-wrap: wrap; */ /* 크기에 따라 달라지는 창 */
	}
	
	.button { margin: 0 120px; }
	.no-gap { display: flex; align-items: center; }
	.no-gap button, .no-gap label { margin: 0; }
</style>

<noscript data-n-css=""></noscript>
<script type="text/javascript">

$(function(){
	
	/* 이전 화 */
	$("#prev").click(function(){
		if(${prev} == 0){
			alert("이전 에피소드가 없어요");
			return;
		}
 		$(location).attr("href", "read.do?num_novel=${ep.num_novel}&num_episode=${prev}");
	}); //prev
	
	/* 다음 화 */
	$("#next").click(function(){
		if(${next} == 0){
			alert("다음 에피소드가 없어요");
			return;
		}
 		$(location).attr("href", "read.do?num_novel=${ep.num_novel}&num_episode=${next}");
	}); //next
	
	
	// 북마크
	$("#bookmark").click(function(){
		var bookmarkFlag=$("#bookmark").prop("alt")=="북마크";
		
		var bookmarkImg="";
		var alt="";
		var ajaxUrl="";
		
		if(!bookmarkFlag){
			bookmarkImg="_next/static/images/bookmarkOn.png";
			alt="북마크";
			ajaxUrl="add_bookmark.do";	
		}else{
			bookmarkImg="_next/static/images/bookmarkOff.png";
			alt="노북마크";
			ajaxUrl="cancel_bookmark.do";	
		}
		
		$("#bookmark").prop("src", bookmarkImg);
		$("#bookmark").prop("alt", alt);
		
		$.ajax({
			url : ajaxUrl,
			data : "num_episode=${ep.num_episode}",
			type: "get",
			dataType : "json",
			error : function(xhr){
				alert("문제 발생."+xhr.status);
			},
			success : function(jsonObj){
				alert( jsonObj.jobType )			
			}
		}); 
		
	});
	
	
	$("#comment").click(function(){
		location.href="comment.do?num_novel=${ep.num_novel}&num_episode=${ep.num_episode}";
		//comment.do
	});
	
	
});// ready

</script>
</head>

<body>
<div id="__next" data-reactroot="">
<div class="lightMode h-full">
<div class="flex flex-col h-full">

	<header class="relative bg-white border-b-1 border-grey20">
		<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 flex-wrap items-center desktop:min-h-[72px] desktop:flex-nowrap desktop:py-12">
		<div class="flex typo-g-sm2 flex-1 items-center text-grey60" style="display: flex; align-items: center;">
			<div class="flex w-full items-center justify-start desktop:justify-between">
			
			<div class="flex mr-16 w-auto shrink-0 desktop:w-156">
				<a class="flex h-20 w-20 shrink-0 desktop:h-28 desktop:w-28" href="novel.do?num_novel=${ep.num_novel}">
					<svg width="28" height="28" viewBox="0 0 28 28" fill="none" xmlns="http://www.w3.org/2000/svg" role="img">
						<path fill-rule="evenodd" clip-rule="evenodd" d="M15.405.526l11.9 10.458c.442.39.695.943.695 1.525v13.44C28 27.082 27.06 28 25.9 28H2.1C.94 28 0 27.082 0 25.95V12.508c0-.582.253-1.136.695-1.525L12.595.526a2.138 2.138 0 012.81 0zM25.9 12.51L14 2.05 2.1 12.509v13.44h10.85v-7.518c0-.567.47-1.026 1.05-1.026.546 0 .994.407 1.045.927l.005.099v7.518H25.9V12.51z" fill="black"></path>
					</svg>
				</a>
			</div>
			
			<div class="ml-0 desktop:ml-auto">
			<div class="flex items-center">
			<div class="shrink-0">
			</div>
				<a class="mr-8 text-14 font-medium text-mainText desktop:text-16">
					<label style="font-size: 25px; height: 38px; color: rgb(0, 0, 0); font-weight: bold; text-align: center; padding-top: 15px"> 
						${ep.novelTitle}
					</label>
				</a>
			</div>
			</div>
			
			<div class="flex ml-auto w-auto shrink-0 justify-end desktop:w-156">
			<div class="flex relative">
			
			<div class="absolute top-2 right-32 desktop:top-0 desktop:right-54 invisible -translate-y-50 opacity-0" style="transition: transform 300ms ease 0s, opacity 200ms ease 0s, visibility 200ms ease 0s;">
			<div class="mr-8">
				<button class="flex text-mainText" type="button">
					<div class="flex h-24 w-24 desktop:h-32 desktop:w-32">
					<svg width="32" height="32" viewBox="0 0 32 32" fill="none" xmlns="http://www.w3.org/2000/svg" role="img">
						<path d="M24.25 14.6667V21.25H7.75V14.6667C7.75 9.68174 11.4382 6.25 16 6.25C20.5618 6.25 24.25 9.68174 24.25 14.6667Z" stroke="currentColor" stroke-width="1.5"></path>
						<path d="M27.25 24.75H4.75V21.25H27.25V24.75Z" stroke="currentColor" stroke-width="1.5"></path>
					</svg>
					</div>
				</button>
			</div>
			</div>
			
			<!-- 북마크 -->
			<div class="flex visible translate-y-0 opacity-100" style="transition: transform 300ms ease 0s, opacity 200ms ease 0s, visibility 200ms ease 0s;">
			<div class="mr-10 desktop:mr-30">
			 
			 <!-- 좋아요 -->
			<img id="bookmark" src= "${ep.bookmark eq 1 ? '_next/static/images/bookmarkOn.png':'_next/static/images/bookmarkOff.png'}" 
				alt="${ep.bookmark eq 1?'북마크':'노북마크'}" style="width: 30px; height: 30px;"/>
				
			<form action="add_bookmark.do" id="bookmarkFrm" method="get">
				<input type="hidden" id="num_member" name="num_member" value="${num_member}" />
				<input type="hidden" id="num_episode" name="num_episode" value="${ep.num_episode}"/>
			</form>	
			
						
			</div>
			</div>
			</div>
			</div>
			</div>
			
		</div>
		</div>
	</header>

	<main class="flex-1">
		<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 px-18 mt-32 desktop:mt-47">
			<div class="flex flex-col flex-1"></div>
			
		</div>

		<div data-obj-id="pf8A1" data-obj-type="element" data-text-editable="true" class="" style="margin: auto; width: 1000px; height: 709px;">
			<div data-text-content="true" style=" padding:30px; padding-left:40px; padding-right:40px; font-size: 16px; background-color: rgba(224, 224, 224, 0.34);" class="">
				<div style="text-align: center;">
					<span style="font-style:italic; ; font-size: x-large;">
						${ep.epTitle}
					</span><br><br><br><br>
				</div>
				
				<div>
				 	${fn:replace(ep.epDetail, crcn, br)}
					<%-- ${ep.epDetail} --%>
				</div>
				<br><br><br><br><br>
				<div style="font-style: italic;">
					<c:choose>
						<c:when test="${ep.cmt eq 'null'}">
							
						</c:when>
						<c:otherwise>
							작가의 말:&nbsp;${ep.cmt}
						</c:otherwise>
					</c:choose>
				</div>
				
				<br>
			</div>
				
			<!-- 버튼들 -->
			<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 w-full items-center justify-around text-14"><br><br><br>
			
				<div class="flex flex-1 items-center justify-center">
					<button type="button" id="prev" class="flex items-center text-link"  style="font-size: 20px; font-weight: bold;">
						<div class="flex mr-6 h-14 w-14 rotate-180 items-center justify-center"></div> 
							&lt; 이전화
					</button>
				</div>
				
				<!-- 댓글 -->
				<div class="flex flex-1 items-center justify-center text-link">
					<button class="flex items-center justify-center text-mainText" type="button" id="comment">
						<div class="flex h-30 w-30">
							<svg width="25" height="25" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg" role="img">
								<path fill-rule="evenodd" clip-rule="evenodd" d="M12.1302 1C15.9243 1 19 4.07571 19 7.86979C19 10.192 17.8478 12.2451 16.0838 13.4886L10.6923 18V14.7396H7.86979C4.07571 14.7396 1 11.6639 1 7.86979C1 4.07571 4.07571 1 7.86979 1H12.1302Z"></path>
								<path d="M16.0838 13.4886L15.6025 12.9134L15.6263 12.8935L15.6517 12.8756L16.0838 13.4886ZM10.6923 18L11.1736 18.5752L9.94231 19.6055V18H10.6923ZM10.6923 14.7396V13.9896H11.4423V14.7396H10.6923ZM18.25 7.86979C18.25 4.48992 15.5101 1.75 12.1302 1.75V0.25C16.3385 0.25 19.75 3.66149 19.75 7.86979H18.25ZM15.6517 12.8756C17.2249 11.7666 18.25 9.93788 18.25 7.86979H19.75C19.75 10.4462 18.4706 12.7237 16.5159 14.1016L15.6517 12.8756ZM10.211 17.4248L15.6025 12.9134L16.5651 14.0638L11.1736 18.5752L10.211 17.4248ZM11.4423 14.7396V18H9.94231V14.7396H11.4423ZM7.86979 13.9896H10.6923V15.4896H7.86979V13.9896ZM1.75 7.86979C1.75 11.2497 4.48992 13.9896 7.86979 13.9896V15.4896C3.6615 15.4896 0.25 12.0781 0.25 7.86979H1.75ZM7.86979 1.75C4.48992 1.75 1.75 4.48992 1.75 7.86979H0.25C0.25 3.66149 3.6615 0.25 7.86979 0.25V1.75ZM12.1302 1.75H7.86979V0.25H12.1302V1.75Z" fill="#333333"></path>
								<ellipse cx="6.19227" cy="7.93849" rx="1.03846" ry="1.03047" fill="#333333"></ellipse>
								<ellipse cx="10.3461" cy="7.93849" rx="1.03846" ry="1.03047" fill="#333333"></ellipse>
								<ellipse cx="14.4999" cy="7.93849" rx="1.03846" ry="1.03047" fill="#333333"></ellipse>
							</svg>
						</div>
					</button>
				</div>
				
				<div class="flex flex-1 items-center justify-center">
					<button type="button" id="next" class="flex items-center text-link" style="font-size: 20px; font-weight: bold;">
						다음화   &gt;
						<div class="flex ml-6 h-14 w-14 items-center justify-center"></div>
					</button>
				</div>
				
			</div>
			<br>
		</div>
		<br><br><br><br><br><br>
	</main>
	
	</div>
	</div>
	</div>
	
</body>
</html>