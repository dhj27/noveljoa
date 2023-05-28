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
    
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/dashboard/">
    <link href="manager/bootstrap.min.css" rel="stylesheet">

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
    	  
    	  $("#bBtn").click(function(){
    		$("#bFrm").submit();
    	  });
      
    	  $("#myBtn").click(function(){
      		$("#myFrm").submit();
      	  });
     
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
      
      .nav-item {
   margin-left: 150px; font-size: 25px; 
   
  }
    </style>
        <!-- Custom styles for this template -->
      <link href="manager/dashboard.css" rel="stylesheet">
      
</head>
<body>
<jsp:include page="../../../_next/header_user_board_login_key.jsp"/>
		


<div class="container-fluid">
  <div class="row">
  <form action="memQNAWriteFrm.do" id="bFrm">
  
  </form>


    <main class="">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">QNA 게시판</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
        <!-- 아이디값을 아이디 세션값으로 받아와야함 -->
        <form action="memQNALookListFrm.do?board_num" id="myFrm">
        <input type="hidden" value="${sessionScope.id}"  name="id">
        </form>

                    <!--  c if로 -->
                        <button type="button" class="btn btn-sm btn-outline-secondary" id="myBtn" style="margin-right: 20px ">
            <span class="align-text-bottom"></span>
            내 글 보기
          </button>
    <button type="button" class="btn btn-sm btn-outline-secondary" id="bBtn">
            <span class="align-text-bottom"></span>
            글 작성
          </button>

        </div>
      </div>

      <div class="table-responsive">
        <table class="table table-hover table-sm" >
           <thead class="table-dark">
            <tr>
              <th scope="col" style="width: 80px">NO</th>
              <th scope="col" style="width: 400px">제목</th>
              <th scope="col" style="width: 80px">작성자</th>
              <th scope="col" style="width: 80px">작성시간</th>
              <th scope="col" style="width: 80px">조회수</th>
            </tr>
          </thead>
          <tbody>
         
           <c:forEach var="fdata" items="${ freeBoardData  }">
            <tr>
              <td>${  fdata.board_num }</td>
              <td><a href="memQNALookFrm.do?board_num=${ fdata.board_num  }">${  fdata.title }</a></td>
              <td>${  fdata.id }</td>
              <td>${  fdata.make }</td>
              <td>${  fdata.views }
              <c:if test="${sessionScope.id==fdata.id}">			
			<input type="button" value="삭제"  class="btn btn-secondary btn-sm" id="removeBtn"   onclick="location.href='removeBoard.do?board_num=${  fdata.board_num }'">
			     </c:if>
			</td>
            </tr>
            </c:forEach>
           
          </tbody>
        </table>
      </div>
      
    </main>
  </div>
</div>


<script src="manager/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
      

</body>
</html>