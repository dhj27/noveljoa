<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap 시작-->
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
<div>
<%-- <c:import url="/common/jsp/navibar.jsp"/> --%>
</div>
<div style="width: 500px">

  <c:if test="${ not empty data }">
<c:redirect url="dashBoardFrm.do"/>
</c:if>
<c:redirect url="managerLoginFrm.do"/> 



<%-- 
값 테스트
<c:out value="${ data.id  }"></c:out>
<c:out value="${ data.create_date  }"></c:out>
<c:out value="${ data  }"></c:out> --%>

</div>
</body>
</html>