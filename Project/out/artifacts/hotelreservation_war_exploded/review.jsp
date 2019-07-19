<%--
  Created by IntelliJ IDEA.
  User: Tushig
  Date: 7/15/2019
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Reviews</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/review.js"></script>
    <link rel="stylesheet" type="text/css" href="resources/css/review.css">
</head>
<body>
    <div id="container">
        <header>
            <div class="top">
                <h1>My Luxury Hotel</h1>
                <nav>
                    <ul>
                        <li><a href="index.jsp" >Home</a></li>
                        <li><a href="searchInput.jsp">Search rooms</a></li>
                        <li><a href="review.jsp" class="active">Reviews</a></li>
                        <li><a href="login.jsp">Login</a></li>
                        <li><a href="#">SignUp</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </nav>
            </div>
            <div class="banner">
                <h2>Indoor&Outdoor</h2>
                <h1>ENJOY A LUXURY EXPERIENCE!</h1>
            </div>
        </header>

        <div id="content">

            <div id="reviewSummary">
                    <span class="averageStars"></span>
                    <span class="averageScore">3/5</span>
                    <span class="reviewCount">Total 2 reviews</span>
                    <span id="btn_add_review"> + Add Review </span> 
            </div>
         
            <div id="reviewForm">

                <div>
                    <label for="reviewer_name">Name</label>
                    <input type="text" id="reviewer_name" placeholder="Your Name" />
                </div>
                <div>
                    <label for="review_score">Score</label>
                    <select id="review_score" placeholder="Your Score" >
                        <option value="1">1 star - Hated it</option>
                        <option value="2">2 stars - Disliked it </option>
                        <option value="3" selected>3 stars - It was ok</option>
                        <option value="4">4 stars - Liked it</option>
                        <option value="5">5 stars - Loved it</option>
                    </select>
                </div>
                <div>
                    <label for="review_text">Review</label>
                    <textarea id="review_text" placeholder="Tell us your opinion"></textarea>
                </div>

                <div>
                    <input id="btn_add" type="submit" value="Submit" />
                </div>
            </div>
            <c:forEach items="${reviews}" var="review">
                <div class="review">
                    <div class="score"><c:out value="${review.getReviewScore()}" />/5</div>
                    <div class="name"><c:out value="${review.getReviewerName()}" /></div>
                    <div class="date">2019.07.12</div>
                    <div class="text">
                        <span><c:out value="${review.getReviewText()}" /></span>
                    </div>
                </div>
            </c:forEach>

        </div>
        <footer>Copyright 2019</footer>
    </div>
</body>
</html>
