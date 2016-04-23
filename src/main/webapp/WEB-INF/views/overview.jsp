<%@ include file="header.jsp" %>
<div class="main-container">
    <%@ include file="sidebar.jsp" %>
    <main aria-labelledby="productsheadline">
        <h2 class="main-headline" id="productsheadline">Produkte</h2>
        <div class="products">

        <c:forEach var="product" items="${products}">
            <div class="product-outer" data-product-id="a066195f-590e-4d4d-bb70-961996b41314">
                <a href="${pageContext.request.contextPath}/product?id=${product.value.productId}" class="product expired "
                   title="Mehr Informationen zu Forty Licks">
                    <img class="product-image" src="<c:out value="${product.value.pictureLocation}"></c:out>" alt="<c:out value="${product.value.pictureDescription}"></c:out>">
                    <dl class="product-properties properties">
                        <dt>Bezeichnung</dt>
                        <dd class="product-name" ><c:out value="${product.value.name}"></c:out></dd>
                        <dt>Preis</dt>
                        <dd class="product-price" id="productPrice">
                            <c:out value="${product.value.currentBid}"></c:out> &euro;
                        </dd>
                        <dt>Verbleibende Zeit</dt>
                        <dd data-end-time="<c:out value="${product.value.endDate}"></c:out>" data-end-text="abgelaufen"
                            class="product-time js-time-left"></dd>
                        <dt>Höchstbietende/r</dt>
                        <dd class="product-highest"><c:out value="${product.value.bidder.firstName}"></c:out> <c:out value="${product.value.bidder.lastName}"></c:out></dd>
                    </dl>
                </a>
            </div>
        </c:forEach>
        </div>
    </main>
</div>
<%@ include file="footer.jsp" %>