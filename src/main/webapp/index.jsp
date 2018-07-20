<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script
	src='//static.codepen.io/assets/editor/live/console_runner-ce3034e6bde3912cc25f83cccb7caa2b0f976196f2f2d52303a462c826d54a73.js'></script>
<script
	src='//static.codepen.io/assets/editor/live/css_live_reload_init-890dc39bb89183d4642d58b1ae5376a0193342f9aed88ea04330dc14c8d52f55.js'></script>
<meta charset='UTF-8'>
<meta name="robots" content="noindex">
<link rel="shortcut icon" type="image/x-icon"
	href="//static.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" />
<link rel="mask-icon" type=""
	href="//static.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg"
	color="#111" />
<link rel="canonical" href="https://codepen.io/T300X/pen/xqaGw" />


<style class="cp-pen-styles">
body {
	margin: 0;
	padding: 0;
	background:
		url(https://s3-us-west-2.amazonaws.com/s.cdpn.io/148422/screencap-wheel.png)
		#fff;
	background-attachment: fixed;
	background-size: cover;
}

#video-background {
	position: fixed;
	right: 0;
	bottom: 0;
	min-width: 100%;
	min-height: 100%;
	width: auto;
	height: auto;
	z-index: -100;
}

h1 {
	position: absolute;
	top: 30%;
	width: 100%;
	font-size: 3.6rem;
	letter-spacing: 3px;
	color: #fff;
	font-family: Oswald, sans-serif;
	text-shadow: 1px 1px 1px #16a085, 1px 1px 4px #2980b9;
	text-align: center;
}

button {
	position: relative;
	border-radius: 5px;
	border: 0;
	font-size: 1.5rem;
	font-family: Oswald, sans-serif;
	color: #fff;
	background-color: #2980b9;
	padding: .4em;
	margin-left: auto;
	margin-right: auto;
	display: block;
	margin-top: 50px;
	cursor: pointer;
}

button:hover {
	background-color: #3498db;
}

article {
	top: 30%;
	width: 100%;
	font-size: 3.6rem;
	letter-spacing: 3px;
	color: #fff;
	font-family: Oswald, sans-serif;
	text-shadow: 1px 1px 1px #16a085, 1px 1px 4px #2980b9;
	text-align: center;
}

article {
   top: 30%;
   width: 100%;
   font-size: 3.6rem;
   letter-spacing: 3px;
   color: #fff;
   font-family: Oswald, sans-serif;
   text-shadow: 1px 1px 1px #16a085, 1px 1px 4px #2980b9;
   text-align: center;
}
</style>
<script>
 $(document).ready(function(){
    $("#write").click(function(){
       $(location).attr("href","write.do");
    });
    
    $("#board").click(function(){
    	$(location).attr("href","board.do");
    })
 });

</script>
</head>

<body>
   <link href='https://fonts.googleapis.com/css?family=Oswald'
      rel='stylesheet' type='text/css'>

   <article>
   <button id="write">글 쓰기</button>
   </article>
   <article>
   <button id="board">목록보기</button>
   </article>
   <article>
   <h1>3조 게시판 에 오신걸 환영합니다</h1>
   </article>


   <video autoplay loop id="video-background"
      poster="https://s3-us-west-2.amazonaws.com/s.cdpn.io/148422/screencap-wheel.png"
      muted> <source
      src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/148422/Vienna-SD.mp4"
      type="video/mp4"></video>

</body>
</html>