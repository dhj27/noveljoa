<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- bootstrap 끝-->
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
  $(function(){
  });
</script>
</head>
<body>
<c:if test="${modifyCommentFlag}">
<c:redirect url="messageQNALookFrm.do?boardNum=${param.boardNum}"/>
</c:if> 
<%-- <c:choose>
  <c:when test="${modifyCommentFlag}">
    <script type="text/javascript">
	    alert("답변이 수정되었습니다.");
	    location.href = "messageQNALookFrm.do";
    </script>
  </c:when>
  <c:otherwise>
    <script type="text/javascript">
	    alert("답변 작성에 실패했습니다.");
	    history.back();
    </script>
  </c:otherwise>
</c:choose>  --%> 
</body>
</html>