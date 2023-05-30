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
			$("#num_novel").val();
			$("#createEpFrm").submit();
		});
		
		$("#epEditOpen").click(function(){
			$("#num_novel").val();
			$("#num_episode").val();
			$("#updateEpFrm").submit();
		});
		
		$("#cmtOpen").click(function(){
			$("#num_novel").val();
			$("#cmtFrm").submit();
		});
		
		$("#novelOpen").click(function(){
			/* $("#num_novel").val(); */
			$("#novelFrm").submit();
		});
		
		$("#epOpen").click(function(){
			$("#num_novel").val();
			$("#num_episode").val();
			$("#epFrm").submit();
		});
		 
	});
	
	
</script>
</head>
<body>

	<a href="writer_novel.do">novel</a>
	<br><br>
	
	
	<input type="button" id="epWriteOpen" value="에피소드 등록창" />
	<form action="episode_write.do" name="createEpFrm" id="createEpFrm" method="post">
		<input type="hidden" name="num_novel" id="num_novel" value="5"/>
		<input type="hidden" name="novelTitle" id="novelTitle" value="5"/>		
	</form>
	<br>
	
	<input type="button" id="epEditOpen" value="에피소드 수정창" />
	<form action="episode_edit.do" name="updateEpFrm" id="updateEpFrm" method="post">
		<input type="hidden" name="num_novel" id="num_novel" value="5"/>
		<input type="hidden" name="num_episode" id="num_episode" value="26"/>
	</form>
	<br>
	
	<input type="button" id="cmtOpen" value="댓글창" />
	<form action="episode/comment.do" name="cmtFrm" id="cmtFrm" method="post">
		<input type="hidden" name="num_novel" id="num_novel" value="5"/>
	</form>
	<br>
	
	<a href="novel.do?num_novel=5">novel</a>
	 <br><br>
	 
	 
	<a href="read.do?num_novel=5&num_episode=26">episode</a>
	 <br><br>
	
	
	
</body>
</html>