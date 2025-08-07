<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/ico" href="/img/favicon.ico" />
<link rel="stylesheet"  href="/css/common.css" />

<style>
	
	td {
	   padding : 10px;
	   width : 700px;
	   text-align: center; 	   
	}
	
	td:nth-of-type(1) {
	   width: 200px;
	} 
	
	input { width : 100%; }
	input[type=submit] { width:100px; }
	

</style>

</head>
<body>
  <main>
	<h2>수정</h2>
	<form action="/Users/Update" method="POST">
	  <table>
	    <tr>
	      <td>비밀번호</td>
	      <td><input type="text" name="passwd"  maxlength="12" 
	                value="${ user.passwd }" readonly /></td>
	    </tr>
	    <tr>
	      <td>이름</td>
	      <td><input type="text" name="username"  value="${ user.username }"/></td>
	    </tr>
	    <tr>
	      <td>이메일</td>
	      <td><input type="text" name="email" value="${ user.email }" /></td>
	    </tr>
	    <tr>	      
	      <td colspan="2">
	      <input type="submit" value="등록" />
	      </td>
	    </tr>
	  </table>
	</form>
  </main>	
    
  <script>
    const  formEl = document.querySelectorAll("form")[0];
    
    formEl.addEventListener('submit', function(e) {
    	// alert('ok')
    	const  inputEl2 = document.querySelector('[name="passwd"]')
    	if( inputEl2.value.trim() == '' ) {
    		alert('비밀번호가 입력되지 않았습니다(USER01)')
    		e.stopPropagation();  // 이벤트 버블일 방지
    		e.preventDefault();   // 이벤트를 취소 
    		inputEl2.focus();
    		return false
    	} 
    	
    	const  inputEl3 = document.querySelector('[name="usernmae"]')
    	if( inputEl3.value.trim() == '' ) {
    		alert('메뉴이름이 입력되지 않았습니다')
    		e.stopPropagation();
    		e.preventDefault();
    		inputEl3.focus();
    		return false
    	}
    	
    	const  inputEl4 = document.querySelector('[name="email"]')
    	if( inputEl4.value.trim() == '' ) {
    		alert('메뉴순서가 입력되지 않았습니다')
    		e.stopPropagation();
    		e.preventDefault();
    		inputEl4.focus();
    		return false
    	} 
    })
    
    
  </script>
  
  
  
</body>
</html>



