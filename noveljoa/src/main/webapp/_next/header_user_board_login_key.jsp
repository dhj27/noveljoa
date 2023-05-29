<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
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
<header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
<form action="main.do" method="post" id="frm_header"></form>
<a         
			id="main_logo"  href="#"
			class="ml-15 mr-16 max-w-[145px] flex-shrink flex-grow basis-0 py-[13.5px] desktop:ml-0 desktop:mr-32 desktop:max-w-[174px] desktop:py-0"
			><img class="object-contain"
			width="157" height="60" src="/noveljoa/_next/static/images/logo.png"
			srcSet="/static/images/logo@2x.png 2x, /static/images/logo@3x.png 3x"
			alt="소설조아 logo" /></a>

		<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0"> 
  <li class="nav-item"><a class="nav-link px-2 link-dark"  id="main_btn" href="#">홈</a></li>
  <li class="nav-item"><a href="ranking.do" class="nav-link px-2 link-dark">랭킹</a></li>
  <li class="nav-item"><a href="memQNALookListFrm.do?board_num=0" class="nav-link px-2 link-dark" >QNA 게시판</a></li>
</ul>

      <div class="col-md-3 text-end">
      <a class=""
				href="manager/managerLoginFrm.do"><img
				src="/noveljoa/_next/static/images/key_black.png" width="24"
				height="24" style="margin-right: 30px;"></a>
					<a href="my_page.do" class="mr-16 flex items-center text-grey70">
				<img src="/noveljoa/_next/static/images/profile_images/<%=session.getAttribute("photo") %>" width="48" height="48">
			</a>&nbsp; &nbsp; &nbsp; 
				<!--  c if로 -->
        <!-- <button type="button" class="btn btn-dark me-2">로그안</button> -->
        <!-- <button type="button" class="btn btn-dark me-2" 
        onclick="window.location.href='/noveljoa/login/loginpage.jsp'">로그아웃</button> -->
      </div>
    </header>