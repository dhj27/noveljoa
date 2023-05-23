<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에피소드 테스트</title>

<!-- bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		
		$("#epWriteOpen").click(function(){
			$("#novelNum").val();
			$("#createEpFrm").submit();
		});
		
		$("#epEditOpen").click(function(){
			$("#novelNum").val();
			$("#epNum").val();
			$("#updateEpFrm").submit();
		});
		
		 
	});
	
	
</script>
</head>
<body>

	<a href="index.do">a</a>
	<br><br>
	
	<input type="button" id="epWriteOpen" value="에피소드 등록창" />
	<form action="episode_write.do" name="createEpFrm" id="createEpFrm" method="post">
		<input type="hidden" name="userNum" id="userNum"/>
		<input type="hidden" name="novelNum" id="novelNum"/>
	</form>
	
	<input type="button" id="epEditOpen" value="에피소드 수정창" />
	<form action="episode_edit.do" name="updateEpFrm" id="updateEpFrm" method="post">
		<input type="hidden" name="userNum" id="userNum"/>
		<input type="hidden" name="novelNum" id="novelNum"/>
		<input type="hidden" name="epNum" id="epNum"/>
	</form>
	
	
</body>
</html>