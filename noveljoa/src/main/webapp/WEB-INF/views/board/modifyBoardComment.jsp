<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap 시작-->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous"/>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
      <!-- bootstrap 끝-->
      <!-- jQuery CDN 시작 -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
     <!-- jQuery CDN 끝 -->
      <script type="text/javascript">
      $(function(){
    	  
    	  $("#modBtn").click(function(){
     		 $("#modFrm").submit();
     	 }); 
     
      });
      </script>
</head>
<body>
<form action="modifyBoardComment_process.do" id="modFrm">
<input type="hidden" value="${ param.board_num  }" name="board_num">
<input type="hidden" value="${ param.board_cmt_num  }" name="board_cmt_num">
<input type="hidden" value="${ sessionScope.num_member  }" name="num_member">
 <textarea class="form-control is-invalid" placeholder="${ param.detail  }" name="detail" style="height: 500px"></textarea><br>
			<div class="d-grid gap-2">
			<input  type="button" value="수정"  class="btn btn-danger btn-sm" id="modBtn" style="height: 100px">
			</div>
			</form>
</body>
</html>