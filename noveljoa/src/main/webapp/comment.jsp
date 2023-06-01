<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<% request.setCharacterEncoding("UTF-8"); %>  

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charSet="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" />
<title> 소설 댓글 읽기 | 소설조아</title>
<link rel="preconnect" href="https://fonts.gstatic.com"	crossorigin="anonymous" />
<link rel="stylesheet"	data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&amp;display=swap" />
<link rel="preload"	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css"	as="style" />
<link rel="stylesheet" href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/6e5d8ba319c77348.css" data-n-g="" />
<link rel="preload"	href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/593189bb3d3dd926.css"	as="style" />
<link rel="stylesheet" href="https://pagestage-cdn.kakaoent.com/web/_next/static/css/593189bb3d3dd926.css" data-n-p="" />
<link rel="stylesheet" type="text/css" href="/noveljoa/_next/static/css/login.css" />

<!-- bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript">
 
</script>

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
</head>


<body>
	<div id="__next" data-reactroot="">
	<div class="lightMode h-full">
	<div class="flex flex-col h-full">

	<header class="relative bg-white border-b-1 border-grey20">
		<div class="flex mx-auto w-full max-w-default flex-row flex-wrap desktop:px-22 flex-wrap items-center desktop:min-h-[72px] desktop:flex-nowrap desktop:py-12">
		<div class="flex typo-g-sm2 flex-1 items-center text-grey60" style="display: flex; align-items: center;">
			<div class="relative overflow-visible mt-auto mb-0 desktop:my-auto">
			
				<!-- 해당 소설 리스트로 이동 -->
				<a href="javascript:history.back()"> <!-- javascript:history.back() -->
					<img width="20" height="20" src="/noveljoa/_next/static/images/list.png" style="top: 10px;" />
				</a>
				
				<!-- 에피소드 제목 -->
				<div>
					<span class="button" style=" top: -8px; left: 348px; align-items: center; ">
						<label style="font-size: 25px; height: 38px; color: rgb(0, 0, 0); font-weight: bold; text-align: center;">${title} </label>
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
		
		<div class="flex flex-col my-0 mx-auto min-h-full w-full max-w-[700px] bg-subBackground text-mainText">
		<div class="flex flex-col">
		<div class="border-commentFormLine border-t-1 bg-commentTextForm p-16 desktop:rounded-3  desktop:border-1 bg-commentTextForm">
		<div style="height: 30px">
			<button class="flex items-center cursor-pointer typo-md3-b text-subText"
					type="button">${id}</button>
		</div>
			
			<form action="comment_add.do" class="flex flex-col w-full" method="post">
				<input type="hidden" id="num_member" name="num_member" value="${cvo.num_member}" >
				<input type="hidden" id="num_episode" name="num_episode" value="${cvo.num_episode}" >
				
				<textarea id="detail" name="detail" placeholder="답변을 입력하세요." maxlength="500"
					class="typo-md3 rounded-3 border-1 border-grey30 py-14 px-16 placeholder:text-grey60 flex-[1_1_100%] resize-none outline-none typo-md3 min-h-[66px] border-none !bg-transparent !p-0 text-commentText"></textarea>
				<div class="flex mt-8 w-full items-center justify-between">
					<label class="flex typo-md3 items-start"></label>
					<div class="flex items-center">
						<span class="typo-x-sm"> 
						<span class="typo-g-sm2 -mb-[0.2em] !typo-x-sm text-mainText">0</span>
							<span class="typo-g-sm2 -mb-[0.2em] !typo-x-sm text-grey60">/ 500</span>
						</span>
						<button class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full">
							등록
						</button>
					</div>
				</div>
			</form>
			
		</div>
		</div>
		
		<div class="mt-40">
		<div class="border-b-1 pb-8">
		<div class="flex items-end justify-between text-14">
		<div class="flex items-center">
			<h2 class="typo-lg3-b mr-6 desktop:typo-lg1">댓글</h2>
			<span class="typo-g-sm2 -mb-[0.2em] !desktop:typo-g-lg1 !typo-g-lg3 desktop:text-grey60"></span>
		</div>
		</div>
		</div>
		</div>
		
		<!-- 회차 목록들 -->
		<div id="empTab">
		
		</div>
		
		<div>
			<div class="border-commentLine border-b-1 py-20 px-10">
			<div class="flex flex-col relative text-mainText">
			<div class="flex flex-wrap mb-8 items-center">
				
			
			</div>
			</div>
<!-- 
<div class="flex mb-2 items-center desktop:mb-0">
					<span class="typo-sm1-b">아이디</span>
				</div>
				<div class="flex typo-sm2 items-center text-grey60 ml-16">
					<span>작성일</span><span class="order-2 mx-4 desktop:order-none"></span>
				</div>
			</div>
			<div class="typo-md2 desktop:typo-md1">
				<div class="whitespace-pre-wrap">댓글내용 </div>
			</div>
			<div class="flex justify-end">
				<button type="submit" style="align-items: right;"
					class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full">수정</button>
				<button type="submit" style="align-items: right;"
					class="flex items-center justify-center border-1 appearance-none bg-black border-black text-white disabled:border-grey20 disabled:bg-grey20 disabled:text-grey60 typo-sm1-b py-1 px-16 desktop:!font-medium ml-8 rounded-full">삭제</button>
			</div>
 -->

				<div class="flex flex-col mb-120 shrink-0 items-center text-center">
				 		<svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg" role="img" class="mb-8">
				 		<path fill-rule="evenodd" clip-rule="evenodd" d="M33.8755 14.9089C33.8755 7.77953 28.2565 2 21.3251 2H14.5503C7.61898 2 2 7.77953 2 14.9089C2 22.0383 7.61898 27.8179 14.5504 27.8179H18.4061V34.1386L27.5759 26.1052C31.339 23.878 33.8755 19.6986 33.8755 14.9089ZM21.3251 3.54286C27.4281 3.54286 32.3755 8.63162 32.3755 14.9089C32.3755 19.1477 30.12 22.8455 26.7726 24.8004L26.7108 24.8365L19.9061 30.7978V26.275H14.5504C8.44741 26.275 3.5 21.1862 3.5 14.9089C3.5 8.63162 8.44741 3.54286 14.5503 3.54286H21.3251Z" fill="#CCCCCC"></path>
				 		<path d="M12.3125 15.3338C12.3125 15.9551 11.8088 16.4588 11.1875 16.4588C10.5662 16.4588 10.0625 15.9551 10.0625 15.3338C10.0625 14.7124 10.5662 14.2088 11.1875 14.2088C11.8088 14.2088 12.3125 14.7124 12.3125 15.3338Z" fill="#CCCCCC"></path>
				 		<path d="M19.0625 15.3338C19.0625 15.9551 18.5588 16.4588 17.9375 16.4588C17.3162 16.4588 16.8125 15.9551 16.8125 15.3338C16.8125 14.7124 17.3162 14.2088 17.9375 14.2088C18.5588 14.2088 19.0625 14.7124 19.0625 15.3338Z" fill="#CCCCCC"></path>
				 		<path d="M24.6875 16.4588C25.3088 16.4588 25.8125 15.9551 25.8125 15.3338C25.8125 14.7124 25.3088 14.2088 24.6875 14.2088C24.0662 14.2088 23.5625 14.7124 23.5625 15.3338C23.5625 15.9551 24.0662 16.4588 24.6875 16.4588Z" fill="#CCCCCC"></path>
				 		</svg>
				 		답변이 없습니다.<br>
				 		답변을 남겨주세요.
				 		</div> 
		 		
		</div>
		</div>
		 
	</main>

	<!-- footer -->
	<div>
		<jsp:include page="../../../_next/footer.jsp"/>
	</div>
</body>
</html>
