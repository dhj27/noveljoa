<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charSet="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" />
<meta name="next-head-count" content="2" />
<link rel="preconnect" href="https://fonts.gstatic.com"	crossorigin="anonymous" />
<link rel="stylesheet" data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&amp;display=swap" />
<link rel="preload"	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css" as="style" />
<link rel="stylesheet" href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css" data-n-g="" />
<link rel="stylesheet" type="text/css" href="_next/static/css/font.css" />
<noscript data-n-css=""></noscript>
<!-- jQuery CDN설정 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&display=swap"></style>


<script type="text/javascript">
	$(function(){
		
		$("#ret").click(function(){
			location.replace("javascript:history.go(-2);");
		});
		
	});//ready
</script>

</head>

<body>
	
	<div id="__next" data-reactroot="">
	<div style="display: none; background-color: canvas; color-scheme: light"></div>
	<div class="lightMode h-full">
	<div class="flex flex-col h-full">
	<div class="z-1">
					
	<!-- header -->
	<div>
		<jsp:include page="../../../../_next/header_user_login_search.jsp"/>
	</div>		
	
	<main class="flex-1">
		<div class="relative -z-1"></div>
		<div class="flex-1">
		
		<main class="flex-1">
		    <div class="flex flex-col min-h-[100vh]">
		        <br><br><br>
		        <label style="text-align: center; font-size: 25px;">소설 등록 ${ result } 되었습니다</label>
		        <br>
		        <div style="display: flex; justify-content: center;">
					<input type="button" id="ret" value="소설로 돌아가기" 
						class="typo-sm1 shrink-0 appearance-none rounded-50 border-1 py-6 px-14 bg-black border-black text-white"/>
		        </div>
		    </div>
		</main>

	<!-- footer -->
	<div>
		<jsp:include page="../../../../_next/footer.jsp"/>
	</div>
</body>
</html>
