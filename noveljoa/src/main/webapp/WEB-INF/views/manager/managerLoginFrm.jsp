<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title></title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sign-in/">

      <!-- jQuery CDN 시작 -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
     <!-- jQuery CDN 끝 -->
      <script type="text/javascript">
      // 아이디, 비밀번호 입력 여부, 길이 제한 유효성 검사
      //evt.which == 13  이벤트(엔터키, 버튼클릭)가 발생한 고유 번호가 13이면 chkNull() 실행
      $(function(){
    	  $("#mid").keydown(function( evt ){
    		if( evt.which == 13 ){
    			chkNull();//엔터키 눌리면 실행
    		}//end if
    	  });//keydown
    	  
    	  $("#mpass").keydown(function( evt ){
      		if( evt.which == 13 ){
      			chkNull();//엔터키 눌리면 실행
      		}//end if
      	  });//keydown
      	  
      	  $("#mbtn").click(function(){
      		  chkNull();//버튼 클릭시 실행
      	  })//click
      	  
      	  //값이 빈 값을 넣었을 때 경고창 후 빈 값 쪽 포커스
      	  function chkNull(){
      		  //alert('enter key와 로그인 버튼 클릭 시 발생'); //잘 타지는 지 테스트용
      		  
      		  if( $("#mid").val()=="" ){
      			  alert('아이디는 필수 입력');
      			  $("#mid").focus();
      			  return; //early return으로 if문을 탈 시 다음 함수 실행 x
      		  }//end if
      		  
      		  if( $("#mpass").val()=="" ){
      			  alert('비밀번호는 필수 입력');
      			  $("#mpass").focus();
      			  return; //early return으로 if문을 탈 시 다음 함수 실행 x
      		  }//end if
      		  
      			  chkLeng();//빈 값이 없을 때 실행
      			  
      	  }//chkNull
      		  
      	  		//아이디가 20자, 비번이 20자가 넘지 않아야 submit 실행
      		  function chkLeng(){
      			//alert('아이디와 비밀번호가 입력완료 시 실행'); //잘 타지는 지 테스트용
      			
      			if( $("#mid").val().length > 19 ){
					alert('아이디는 20자까지만 입력 가능');
					return;//early return으로 if문을 탈 시 다음 함수 실행 x
      			}//end if
      			
      			if( $("#mpass").val().length > 19 ){
					alert('비밀번호는 20자까지만 입력 가능');
					return;//early return으로 if문을 탈 시 다음 함수 실행 x
      			}//end if
      			
      			$("#mFrm").submit();//포스트 방식으로 값 제출
      			
      		}//chkLeng
      		
      	
      			  
      });//ready
      </script>
      
      <link href="bootstrap.min.css" rel="stylesheet">

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
    <link href="signin.css" rel="stylesheet">
      
</head>
<body>

<main class="form-signin w-100 m-auto">
  <form action="managerLoginProcess.do" method="post" id="mFrm">
  <div style="text-align: center;">
    <img class="mb-4" src="../_next/static/images/manager.png" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">Like Novel Manager</h1>
    <%System.out.print(request.getAttribute("mFlag")); %>
    </div>

    <div class="form-floating">
      <input type="text" class="form-control" id="mid"  name="id" placeholder="아이디">
      <label for="mid">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="mpass"  name="password" placeholder="비밀번호">
      <label for="mpass">비밀번호</label>
    </div>

    <div class="checkbox mb-3">
    <!--   <label>
        <input type="checkbox" value="remember-me"> 아이디 저장
      </label> -->
    </div>
    <input type="button" class="w-100 btn btn-lg btn-dark"  id="mbtn" value="로그인">
  </form>
</main>

</body>
</html>