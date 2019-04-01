<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content=""/>
<meta name="keywords" content="" />

<title>管理者画面</title>

<style type="text/css">
body{
margin:0;
padding:0;
line-height:1.6;
letter-spacing:1px;
font-family:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
background:#fff;
}

table{
text-align:center;
margin:0 auto;
}

/*===ecsite LAYOUT===*/
#top{
width:780px;
margin:30px auto;
border:1px solid #333;
}

#header{
width:100%;
height:80px;
background-color:black;
}

#main{
width:100%;
height:500px;
text-align:center;
}

#box{
width:90%;
height:350px;
margin:auto;
padding:auto;
text-align:center;
}

#product{
display:inline-block;
width:25%;
height:200px;
border:1px solid black;
margin:0 auto;
padding:0 auto;
}


#user{
display:inline-block;
width:25%;
height:200px;
border:1px solid black;
margin:0 auto;
padding:0 auto;
}

#midashi{
background-color:#D8D8D8;
}

#footer{
width:100%;
height:80px;
background-color:black;
clear:both;
}

#text-center{
display:inline-block;
text-align:center;
}

</style>
</head>
<body>

  <div id="header">
    <div id="pr">
    </div>
  </div>

  <div id="main">
    <div id="top">
      <p>管理者画面</p>
    </div>


  <div id="product">
  <div id="midashi">商品</div>

  <s:form action="LoginAction">
    <s:submit value="新規登録"/>
  </s:form>
  <s:form action="ItemListAction">
    <s:submit value="アイテム一覧"/>
  </s:form>
  </div>

  <div id="user">
  <div id="midashi">ユーザー</div>
  <s:form action="UserCreateAction">
  <s:submit value="新規登録"/>
  </s:form>
  一覧
  </div>

    <div>
      <p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
      <p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
      </div>
        </div>

<div id="footer">
  <div id="pr">
  </div>
</div>

</body>
</html>