<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0">
<title>글쓰기 | 소설조아</title>
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="anonymous">
<link rel="stylesheet" data-href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500,700&amp;display=swap">
<link rel="stylesheet" type="text/css" href="_next/static/css/0bde5e3867c0e9b2.css" />
<link rel="stylesheet" type="text/css" href="_next/static/css/fd0af5d18a01c194.css" />
<link rel="stylesheet" type="text/css" href="_next/static/css/44b5ac89a790a9aa.css" />
<link rel="stylesheet" type="text/css" href="_next/static/css/6e5d8ba319c77348.css" data-n-g="">
<link rel="stylesheet" type="text/css" href="_next/static/css/font.css" />
<!-- jQuery CDN설정 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript">

	$(function(){
		
		// 글자 수 제한
		$("#story").keyup(function(){
			var storyLength = $(this).val();
			$("#length").text(storyLength.length);
			
			if(storyLength.length >= 2000){
				alert("2000자 까지만 입력할 수 있습니다.");
				return;
			} 
		}); // story
		
		
		// 등록 이벤트
		$("#register").click(function(){
			var title = $("#title").val();
			var story = $("#story").val();
			
			// 소설 제목수 검사
			if(title.length == 0 || title == ""){
				alert("에피소드 제목을 입력해주세요");
				$("#title").focus();
				return;
			}else if(title.length >= 20){
				alert("에피소드 제목은 20글자를 넘길 수 없습니다.");
				return;
			}
			
			if( title.trim() == "" ){
				alert("제목은 빈칸이 될 수 없습니다.");
				$("#title").focus();
				return;
			}
			
			// 소설 내용 수 검사
			if(story.length == 0 || story == ""){
				alert("소설의 내용을 입력해주세요");
				$("#story").focus();
				return;
			}
			
			if( story.trim() == "" ){
				alert("소설의 내용은 빈칸이 될 수 없습니다.");
				$("#story").focus();
				return;
			}
			

			$("#epFrm").submit();
		});
		
	});
	
</script>
</head>

<body>
	<div id="__next" data-reactroot="">
	<div style="display: none; background-color: canvas; color-scheme: light;"></div>
	<div class="lightMode h-full flex flex-col h-full">
	<main class="flex-1">
		
		<form id="epFrm" action="episode_write_process.do" method="post" class="flex flex-col h-full">
			
			<header class="flex relative h-90 flex-wrap items-start justify-center border-b-1 border-black/10 bg-white px-20 desktop:h-74 desktop:items-center desktop:px-24">
				<div>
				
					<a href="javascript:history.back();">
						<img width="20" height="20" src="_next/static/images/list.png" />
					</a>
					
				</div>
				<div class="flex absolute inset-x-0 bottom-10 mx-20 items-center justify-center text-12 font-bold desktop:bottom-auto desktop:mx-[220px] desktop:items-end desktop:text-16">
					<div class="truncate after:inline-block after:w-0"> ${epNovelVO.novelTitle}</div>
				</div>
				<div class="mt-16 ml-auto desktop:mt-0">
					<div class="flex items-center justify-end">
						<input type="button" id="register" value="등록" class="typo-sm1 shrink-0 appearance-none rounded-50 border-1 py-6 px-14 bg-black border-black text-white"/>
					</div>
				</div>
			</header>
			
			<!-- 에피소드 작성 내용 -->
			<div class="h-0 flex-[1_1_auto] overflow-auto">
				<div class="flex flex-col mx-18 mt-30 max-w-[648px] desktop:mx-auto desktop:mt-64">
					
					<input type="hidden" id="num_novel" name="num_novel" value="${ epNovelVO.num_novel }" />
					<input type="hidden" id="num_member" name="num_member" value="${ num_member }" />
					
					<input type="text" class="mb-24 border-0 border-b-1 border-black/10 px-0 pt-0 pb-16 text-24 outline-none desktop:pb-36 desktop:text-36"
						id="title" name="title" maxlength="50" placeholder="제목을 입력하세요 " autofocus="autofocus">
					<textarea class="typo-md3 rounded-3 border-1 border-grey30 py-14 px-16 placeholder:text-grey60 flex-[1_1_100%] resize-none outline-none border-0 !p-0 text-15"
						id="story" name="story" rows="50" maxlength="2000" placeholder="내용을 입력하세요"></textarea>
					
				</div>
			</div>
				
			<!-- 글자수 -->
			<div>
				<div class="flex mb-8 mr-0 justify-end desktop:mb-16 desktop:mr-22">
				<div class="flex py-4 px-8 text-12 text-grey40 desktop:text-14">
					<span class="mr-2 text-grey70"> 
						<span id="length" class="typo-g-sm2 -mb-[0.2em]"> 0</span>
					</span>
					<span class="mr-2 text-grey40">
						<span class="typo-g-sm2 -mb-[0.2em]">/ 2,000자</span>
					</span>
				</div>
				</div>
			</div>
			
			<div class="flex h-81 border-t-1 border-black/10 bg-white py-12 px-18 desktop:h-100 desktop:py-24 desktop:px-0">
				<input type="text" style="font-size: 15px;"
					   id="cmt" name="cmt" maxlength="100" placeholder="코멘트을 입력하세요" 
						class="typo-md3 rounded-3 border-1 border-grey30 py-14 px-16 placeholder:text-grey60 flex-[1_1_100%] resize-none 
						outline-none my-0 mx-auto max-w-[648px] flex-[1_1_100%] border-0 !p-0 text-13 desktop:text-15"/>
			</div>		
		</form>
		
	</main>
		<div id="modal-normal"></div>
	</div>
	</div>
	</body>
</html>