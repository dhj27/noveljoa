<%@page import="EpisodeVO.User.PrevNextVO"%>
<%@page import="EpisodeVO.User.LookEpisodeVO"%>
<%@page import="EpisodeDAO.EpisodeDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="EpisodeVO.My.LookMyEpisodeVO"%>
<%@page import="EpisodeDAO.EpisodeMyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  
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
<link rel="stylesheet" type="text/css" href="/project2/_next/static/css/login.css" />
<!-- bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<%
/* if(session.getAttribute("user_num_member")==null){
	response.sendRedirect("../login/loginpage.jsp");
	return;
} */
	
	//int userNum = (Integer)session.getAttribute("user_num_member");
	//int novelNum = Integer.parseInt(request.getParameter("num_novel")); 
	//int epNum = Integer.parseInt(request.getParameter("epNum")); 
	
	int userNum = 8; 
	int novelNum = 34; 
	int epNum = 45;		
	
	EpisodeDAO epDAO = new EpisodeDAO();
	LookEpisodeVO selectVO = null;
	PrevNextVO prevNextVO = null;
	int prev = 0;
	int next = 0;
	
	try{
		selectVO = epDAO.selectEpisode(novelNum, epNum);
		prev = epDAO.prevEp(novelNum, epNum);
		next = epDAO.nextEp(novelNum, epNum);
		
	}catch(SQLException e){
		e.printStackTrace();
	}
%>

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
		if(<%= prev %> == 0){
			alert("이전 에피소드가 없어요");
			return;
		}
 		$(location).attr("href", "http://localhost/project2/episode/episode_read.jsp?num_novel="+<%= novelNum %>+"&epNum="+<%= prev %>);
	}); //prev
	
	/* 다음 화 */
	$("#next").click(function(){
		if(<%= next %> == 0){
			alert("다음 에피소드가 없어요");
			return;
		}
		$(location).attr("href", "http://localhost/project2/episode/episode_read.jsp?num_novel="+<%= novelNum %>+"&epNum="+<%= next %>);
	}); //next
	
	$("#comment").click(function(){
		alert("S");
		location.href="comment.jsp";
	});
	
	
});// ready

</script>
</head>

<body>
<div id="__next" data-reactroot="">
<div class="lightMode h-full">
<div class="flex flex-col h-full">

<%-- <input type="hidden" name="novelNum" value="<%= novelNum %>"> --%>

	<header class="relative bg-white border-b-1 border-grey20">
		<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 flex-wrap items-center desktop:min-h-[72px] desktop:flex-nowrap desktop:py-12">
		<div class="flex typo-g-sm2 flex-1 items-center text-grey60" style="display: flex; align-items: center;">
			<div class="relative overflow-visible mt-auto mb-0 desktop:my-auto">
			
				<!-- 해당 소설 리스트로 이동 -->
				<a href="http://localhost/project2/episode/novel.jsp?num_novel=<%= novelNum %>">
					<img width="20" height="20" src="/project2/_next/static/images/list.png" style="top: 10px;" />
				</a>
				
				<!-- 소설 제목 -->
				<div>
					<span class="button" style=" top: -8px; left: 348px; align-items: center; ">
						<label style="font-size: 25px; height: 38px; color: rgb(0, 0, 0); font-weight: bold; text-align: center;"> <%= selectVO.getNovelTitle() %> </label>
					</span> 
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
					<span style="font-style:italic; ; font-size: x-large;"><%= selectVO.getEpTitle() %></span><br><br><br><br>
				</div>
				
				<div>
					<%= selectVO.getEpDetail().replace("\n", "<br>") %>
				</div>
				<br><br><br><br>
			</div>
				
			<!-- 버튼들 -->
			<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 w-full items-center justify-around text-14"><br><br><br>
			
				<div class="flex flex-1 items-center justify-center">
					<button type="button" id="prev" class="flex items-center text-link">
						<div class="flex mr-6 h-14 w-14 rotate-180 items-center justify-center"></div> 
							<label style="font-size: 20px;"> &lt; 이전화</label>
					</button>
				</div>
				
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
					<button type="button" id="next" class="flex items-center text-link">
						<label style="font-size: 20px;">다음화  &gt;</label>  
						<div class="flex ml-6 h-14 w-14 items-center justify-center"></div>
					</button>
				</div>
				
			</div>
			<br>
		</div>
		<br><br><br><br><br><br>
	</main>
	<!-- footer -->
	<div>
		<jsp:include page="../_next/footer.jsp"/>
	</div> 
	</div>
	</div>
	</div>
	
</body>
</html>