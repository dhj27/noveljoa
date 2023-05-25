<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    request.setCharacterEncoding("UTF-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"  href="http://211.63.89.150/common/main_v20230217.css"/>
<style type="text/css">
#warp{width: 300px; height: 200px}
#header{width:300px;height: 40px; text-align: center;}
#body{text-align: left;}
#body{width:300px;  height: 160px;}
#id{margin-top: 50px }
</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
$(function(){
	let id;
	$("#btn").click(function(){
		id=$("#id").val();
		let idKey = 'id';
		if(id.length < 6){
			$("#select_result").text("6자 이상으로 작성해주세요.");
		}else{
			
		$.ajax({
			url:"id_chk.do",
			type : "post",
			data: {"id" :id},
			dataType : "json",
			
			success : function(data){
				if(data.idCheck == null){
					$("#select_result").html("<a href='#void' id='sendId'>"+id+"</a>는 사용 가능한 아이디입니다. 사용하시겠습니까?");
				}else{
					$("#select_result").html("중복된 아이디입니다. 다른 아이디를 입력해주세요");
				}
				
				
	}});
			
		}


	});
	
	$(document).on("click", "#sendId", function() {
		opener.window.document.frm.id.value=id;
	window.close();
	});
	});
	
</script>

</head>
<body>
<div id="warp">
<div id="header">
<br/>
<h1><label>아이디 중복 확인</label></h1><br/>
</div>
<form id="frm">
<div id="body">
<label>아이디</label>
<input type="text" id="id"  name="id" class="inputBox" autofocus="autofocus" style="width:150px"/>
<input type="text" style="display: none;"/><!-- input type="text"가 하나만 있으면 엔터 눌렀을 때 자동으로 submit하므로 안보이는 input을 하나 더 만든다 -->
<input type="button" class="btnBorder" value="중복확인" id="btn"/>
</div>
</form>
</div>

<div id="select_result">

</div>
</body>
</html>