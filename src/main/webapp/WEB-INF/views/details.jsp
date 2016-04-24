<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="main-container">
    <%@ include file="sidebar.jsp" %>
    <main aria-labelledby="productheadline" class="details-container">
        <div class="details-image-container">
            <img class="details-image" src="${product.pictureLocation}" alt="">
        </div>
        <div data-product-id="${product.productId}" class="details-data">
            <h2 class="main-headline" id="productheadline">${product.name}</h2>
            <div class="auction-expired-text" style="display:none">
                <p>
                    Diese Auktion ist bereits abgelaufen.
                    <c:if test="${not empty product.bidder}"> highlight
                    Das Produkt wurde um
                    <span class="highest-bid">${product.currentBid} &euro;</span> an
                    <span class="highest-bidder">${product.bidder.firstName} ${product.bidder.lastName}</span> verkauft.
                    </c:if>
                </p>
            </div>
            <div class="stillRunning">
                <p class="detail-time">Restzeit:
                    <span data-end-time="${product.endDate}" class="detail-rest-time js-time-left"></span>
                </p>
                <form class="bid-form" method="post" action="${pageContext.request.contextPath}/bid">
                    <label class="bid-form-field" id="highest-price">

                        <span class="highest-bid"><c:if test="${not empty product.bidder}">${product.currentBid} &euro;</c:if></span>
                        <span class="highest-bidder"><c:if test="${not empty product.bidder}">${highestBidder.firstName} ${highestBidder.lastName}</c:if></span>

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
        </div>
    </main>
</div>

<script type="text/javascript">

    //Check if expired
    $(document).ready(function() {
        var endTime = $(".js-time-left").data("end-time").split(",");
        endTime = new Date(endTime[0],endTime[1]-1,endTime[2],endTime[3],endTime[4],endTime[5],endTime[6]);
        var today = new Date();
        var diffS = Math.round((endTime - today) / 1000);

        if(diffS <= 0) {
            $(".stillRunning").hide();
            $(".auction-expired-text").css("display", "block");
        }
    });

    $(document).ready(function() {
        var currentProduct = {"productName" : "${product.name}", "productId" : "${product.productId}"};
        localStorage.setItem("${product.productId}", JSON.stringify(currentProduct));
    });

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
                dataType: 'json',
                success: function(result){
                    console.log(result);
                    if(result.username != null) {
                        $('.highest-bidder').html(result.username);
                        $('.highest-bid').html(result.bid + "&euro;");
                        $('.running-auctions-count').html(result.current);
                        $('.balance').html(result.budget + "&euro;");
                    } else {
                        alert(result.error);
                    }

                }
            });
        });
    });
</script>

<%@ include file="footer.jsp" %>