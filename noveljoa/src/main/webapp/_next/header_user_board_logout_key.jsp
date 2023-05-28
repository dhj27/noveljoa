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
<a id="main_logo"
			class="ml-15 mr-16 max-w-[145px] flex-shrink flex-grow basis-0 py-[13.5px] desktop:ml-0 desktop:mr-32 desktop:max-w-[174px] desktop:py-0"
			href="#" ><img class="object-contain"
			width="157" height="60" src="/noveljoa/_next/static/images/logo.png"
			srcSet="/static/images/logo@2x.png 2x, /static/images/logo@3x.png 3x"
			alt="소설조아 logo" /></a>

		<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0"> 
  <li class="nav-item"><a href="#" class="nav-link px-2 link-dark" id="main_btn">홈</a></li>
  <li class="nav-item"><a href="ranking.do" class="nav-link px-2 link-dark">랭킹</a></li>
<li class="nav-item"><a href="#" class="nav-link px-2 link-dark" onclick="alert('로그인 후 이용 가능합니다.')">QNA 게시판</a></li>
</ul>

      <div class="col-md-3 text-end">
      <a class=""
				href="/noveljoa/manager/manager_login.jsp"><img
				src="/noveljoa/_next/static/images/key_black.png" width="24"
				height="24" style="margin-right: 30px;"></a>
        <button type="button" class="btn btn-dark me-2"  onclick="window.location.href='loginpage.do'">로그인</button>
      </div>
    </header>