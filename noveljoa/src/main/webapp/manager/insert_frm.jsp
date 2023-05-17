<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    info="아이디의 중복확인 기능 추가"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"  href="http://localhost/jsp_prj/common/main_v20230217.css"/>
<style type="text/css">
#wrap{ width: 1000px; height: 1200px;margin: 0px auto; }
#header{  height: 200px; position: relative;
	background: #FFFFFF url(http://localhost/jsp_prj/common/images/header_bg.png)  repeat-x;}

#container{ height: 900px;position: relative; }	 

#footer{ height: 100px;position: relative;  }	 

</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN 끝 -->
<script type="text/javascript">
$(function() {
	$("#btn").click(function(){
	    if ($("#id").val() == "") {
	        alert("아이디 필수 입력!!");
	        return;
	    }//end if
	    
	    if ($("#password").val() == "") {
	        alert("비밀번호 필수 입력!!");
	        return;
	    }//end if
	   
	   
	    
	   if( $("#id").val().length > 19 ){
		   alert("아이디는 20자까지만 입력가능");
		   return;
	   }//end if
	    
	   if( $("#password").val().length > 19 ){
		   alert("비밀번호는 20자까지만 입력가능");
		   return;
	   }//end if
	    
	    
	    $("#frm").submit();
	    
	});//click
	

	
	});//ready


</script>

</head>
<body>
<div id="wrap"> 
<div id="header">  
	
</div>
<div id="container">
<form action="insert_frm_process.do" method="post" id="frm" name="frm">
<table>
<tr>
<th>매니저 아이디 생성용</th>
</tr>
<tr>
<td style="width: 80px"><label>아이디</label></td>
<td style="width: 300px">
	<input type="text" name="id"  id ="id" class="inputBox" style="width: 240px"/> 
</td> 
</tr>
<tr>
<td style="width: 80px"><label>비밀번호</label></td>
<td style="width: 300px">
	<input type="password" name="password" id ="password" class="inputBox" style="width: 240px"/> 
</td> 
</tr>

<tr>
<td colspan="2">
	<input type="button" value="입력" class="btnBorder" style="width: 100px" id="btn"/> 
</td> 
</tr>
</table> 

</form>
</div>
<div id="footer">
</div>
</div>
</body>
</html>



    