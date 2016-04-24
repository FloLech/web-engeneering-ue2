<jsp:useBean id="user" scope="session" class="at.ac.tuwien.big.we16.ue2.models.User" />
<jsp:useBean id="product" scope="session" class="at.ac.tuwien.big.we16.ue2.models.Product" />
<jsp:useBean id="product_list" scope="session" class="at.ac.tuwien.big.we16.ue2.models.Product_List" />

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
        <span class="running-auctions-count"><%=product_list.getRunningCount() %></span>
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
    <h3 class="recently-viewed-headline">
      Zuletzt angesehen</h3>
    <ul class="recently-viewed-list">

    </ul>
  </div>
</aside>

<script type="text/javascript">
  function allStorage() {

    var keys = Object.keys(localStorage),
        i = keys.length;

    if(i > 0) {
      $('.recently-viewed-headline, .recently-viewed-list').css('display', 'block');
    }

    while ( i-- ) {
      var storedNames = JSON.parse(localStorage.getItem(keys[i]));
      if(storedNames != null) {
        $('.recently-viewed-list').append('<li><a href="${pageContext.request.contextPath}/product?id=' + storedNames.productId +'">' + storedNames.productName + "</li>");
      }
    }
  }

  $(document).ready(function() {
    allStorage();
  });
</script>