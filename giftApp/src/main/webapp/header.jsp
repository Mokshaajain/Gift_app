<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- header section starts -->
    <header class="header_section">
      <nav class="navbar navbar-expand-lg custom_nav-container ">
        <a class="navbar-brand" href="index.html">
          <span>
            My Gift
          </span>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class=""></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav  ">
            <li class="nav-item active">
              <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="shop.jsp">
                Shop
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="reg.jsp">
                New User
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="testimonial.jsp">
                About US
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="contact.jsp">Contact Us</a>
            </li>
            
          </ul>
          <div class="user_option">
            <a class="nav-link" href="Login.jsp">
              <i class="fa fa-user" aria-hidden="true"></i>
              <span>
                Login
              </span>
            </a>
           <!--  <a href="">
              <i class="fa fa-shopping-bag" aria-hidden="true"></i>
            </a> -->
            <form class="form-inline ">
              <a class="btn nav_search-btn" href="search.jsp" type="submit">
                <i class="fa fa-search" aria-hidden="true"></i>
                </a>
            </form>
          </div>
        </div>
      </nav>
    </header>
    <!-- end header section -->
</body>
</html>