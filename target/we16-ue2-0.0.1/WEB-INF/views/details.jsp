<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="main-container">
    <%@ include file="sidebar.jsp" %>
    <main aria-labelledby="productheadline" class="details-container">
        <div class="details-image-container">
            <img class="details-image" src="${product.pictureLocation}" alt="">
        </div>
        <div data-product-id="ce510a73-408f-489c-87f9-94817d845773" class="details-data">
            <h2 class="main-headline" id="productheadline">${product.name}</h2>
            <div id="testContainer">
                <p>hier sollte hallo stehen</p>
            </div>

            <div class="auction-expired-text" style="display:none">
                <p>
                    Diese Auktion ist bereits abgelaufen.
                    Das Produkt wurde um
                    <span class="highest-bid">${product.currentBid} &euro;</span> an
                    <span class="highest-bidder">${product.bidder.firstName} ${product.bidder.firstName}</span> verkauft.
                </p>
            </div>
            <p class="detail-time">Restzeit: <span data-end-time="2016,03,14,15,05,19,796"
                                                   class="detail-rest-time js-time-left"></span>
            </p>
            <form class="bid-form" method="post" action="${pageContext.request.contextPath}/bid">
                <label class="bid-form-field" id="highest-price">
                    <span class="highest-bid">${product.currentBid} &euro;</span>
                    <span class="highest-bidder">${highestBidder.firstName} ${highestBidder.lastName}</span>
                </label>
                <label class="accessibility" for="new-price"></label>
                <input type="text" value="<%=user.getEmail() %>" name="email" hidden/>
                <input type="text" value="${product.productId}" name="productId" hidden/>
                <input type="number" step="0.01" min="0" id="new-price" class="bid-form-field form-input"
                       name="bid" required>
                <p class="bid-error">Es gibt bereits ein höheres Gebot oder der Kontostand ist zu niedrig.</p>
                <input type="submit" id="submit-price" class="bid-form-field button" name="submit-price" value="Bieten">
            </form>
        </div>
    </main>
</div>

<script type="text/javascript">
    $(document).ready(function() {
        $("form.bid-form").submit( function(ev) {
            ev.preventDefault();
            var that = $(this);
            url = that.attr('action');
            type = that.attr('method');
            contents = that.serialize();
            $.ajax({
                url: url,
                type: type,
                data: contents,
                success: function(result){
                    $('.highest-bid').html(result);
                }
            });
        });
    });
</script>

<%@ include file="footer.jsp" %>