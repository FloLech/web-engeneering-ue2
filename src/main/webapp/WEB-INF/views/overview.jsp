<jsp:useBean id="user" scope="session" class="at.ac.tuwien.big.we16.ue2.models.User" />
<%@ include file="header.jsp" %>
<div class="main-container">
    <aside class="sidebar" aria-labelledby="userinfoheadline">
        <div class="user-info-container">
            <h2 class="accessibility" id="userinfoheadline">Benutzerdaten</h2>
            <dl class="user-data properties">
                <dt class="accessibility">Name:</dt>
                <dd class="user-name"><%=user.getFirstName() %> <%=user.getLastName() %></dd>
                <dt>Kontostand:</dt>
                <dd>
                    <span class="balance"><%=user.getCredit() %> &euro;</span>
                </dd>
                <dt>Laufend:</dt>
                <dd>
                    <span class="running-auctions-count">0</span>
                    <span class="auction-label" data-plural="Auktionen" data-singular="Auktion">Auktionen</span>
                </dd>
                <dt>Gewonnen:</dt>
                <dd>
                    <span class="won-auctions-count">0</span>
                    <span class="auction-label" data-plural="Auktionen" data-singular="Auktion">Auktionen</span>
                </dd>
                <dt>Verloren:</dt>
                <dd>
                    <span class="lost-auctions-count">0</span>
                    <span class="auction-label" data-plural="Auktionen" data-singular="Auktion">Auktionen</span>
                </dd>
            </dl>
        </div>
        <div class="recently-viewed-container">
            <h3 class="recently-viewed-headline">Zuletzt angesehen</h3>
            <ul class="recently-viewed-list"></ul>
        </div>
    </aside>
    <main aria-labelledby="productsheadline">
        <h2 class="main-headline" id="productsheadline">Produkte</h2>
        <div class="products">

        <c:forEach var="product" items="${products}">

            <div class="product-outer" data-product-id="a066195f-590e-4d4d-bb70-961996b41314">
                <a href="" class="product expired "
                   title="Mehr Informationen zu Forty Licks">
                    <img class="product-image" src="<c:out value="${product.pictureLocation}"></c:out>" alt="<c:out value="${product.pictureDescription}"></c:out>">
                    <dl class="product-properties properties">
                        <dt>Bezeichnung</dt>
                        <dd class="product-name"><c:out value="${product.name}"></c:out></dd>
                        <dt>Preis</dt>
                        <dd class="product-price">
                            <c:out value="${product.currentBid}"></c:out> &euro;
                        </dd>
                        <dt>Verbleibende Zeit</dt>
                        <dd data-end-time="<c:out value="${product.endDate}"></c:out>" data-end-text="abgelaufen"
                            class="product-time js-time-left"></dd>
                        <dt>Höchstbietende/r</dt>
                        <dd class="product-highest"> <c:out value="${product.bidder}"></c:out></dd>
                    </dl>
                </a>
            </div>

        </c:forEach>

        </div>
    </main>
</div>
<%@ include file="footer.jsp" %>