<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#main_logo").click(function() {
		$("#frm_header").submit();
	})
	$("#main_btn").click(function() {
		$("#frm_header").submit();
	})
})
</script>
<header class="relative bg-white border-b-1 border-grey20">
<form action="main.do" method="post" id="frm_header"></form>
	<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 flex-wrap items-center desktop:min-h-[72px] desktop:flex-nowrap desktop:py-12">
		<h1 class="sr-only">카카오페이지 스테이지</h1>
		<a id="main_logo" class="ml-15 mr-16 max-w-[145px] flex-shrink flex-grow basis-0 py-[13.5px] desktop:ml-0 desktop:mr-32 desktop:max-w-[174px] desktop:py-0"> 
			<img class="object-contain" width="157" height="27"	src="_next/static/images/logo.png" alt="소설조아 logo" />
		</a>
		
		<div class="flex order-1 basis-full desktop:order-none desktop:basis-auto">
			<div class="grid desktop:flex grid-flow-col flex-wrap max-w-full-view overflow-x-scroll overflow-y-hidden scrolling-touch desktop:overflow-x-visible desktop:overflow-y-visible before:grow-0 after:grow-0 before:content-[&quot;&quot;] after:content-[&quot;&quot;] before:flex-[0_1_0%] after:flex-[0_1_0%] desktop:after:hidden desktop:before:hidden auto-cols-max HorizontalScroll_horizontalScrollbar__5q9CM py-3">
				<a id="main_btn" class="typo-md1-b z-0 flex items-center py-[8.5px] ml-8 mr-8 px-16" style="cursor: pointer">
						<div class="relative">홈</div>
				</a> 
				<a href="ranking.do" class="typo-md1-b z-0 flex items-center py-[8.5px] mr-8 px-16" >
					<div class="relative">랭킹</div>
				</a>
				<a href="memQNALookListFrm.do?board_num=0" class="typo-md1-b z-0 flex items-center py-[8.5px] mr-8 px-16" >
					<div class="relative">게시판</div>
				</a>
			</div>
		</div>
		
		<div class="flex items-center ml-auto mr-15 desktop:mr-0">
			<a href="search.do" class="mr-16 flex items-center text-grey70"	>
				<img src="_next/static/images/search.png" width="24" height="24">
			</a> &nbsp; &nbsp; &nbsp; 
			<a href="my_page.do" class="mr-16 flex items-center text-grey70">
				<img src="_next/static/images/profile_images/<%=session.getAttribute("photo") %>" width="48" height="48">
			</a>
		</div>
	</div>
</header>