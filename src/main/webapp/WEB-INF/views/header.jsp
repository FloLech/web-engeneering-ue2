<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="de">
<head>
  <meta charset="utf-8">
  <title>BIG Bid - Anmelden</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/style.css">
</head>
<body data-decimal-separator="," data-grouping-separator=".">

<a href="#productsheadline" class="accessibility">Zum Inhalt springen</a>

<header aria-labelledby="bannerheadline">
  <img class="title-image" src="${pageContext.request.contextPath}/resources/images/big-logo-small.png" alt="BIG Bid logo">

  <h1 class="header-title" id="bannerheadline">
    BIG Bid
  </h1>
  <nav aria-labelledby="navigationheadline">
    <h2 class="accessibility" id="navigationheadline">Navigation</h2>
    <ul class="navigation-list">
      <c:if test="${sessionScope.user != null}">
      <li>
        <form action="${pageContext.request.contextPath}/logout" method="post">
          <input class="button" type="submit" value="Logout" accesskey="l" />
          </form>
      </li>
      </c:if>
    </ul>
  </nav>
</header>