<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<div class="main-container">
    <main aria-labelledby="formheadline">
        <form class="form" method="post" action="login">
            <h2 id="formheadline" class="registration-headline">Anmelden</h2>
            <div class="form-row">
                <label class="form-label" for="email-input">
                    Email
                </label>
                <input type="email" name="email" id="email-input" required class="form-input">
                <span id="email-error" class="error-text"></span>
            </div>
            <div class="form-row">
                <label class="form-label" for="password-input">
                    Passwort
                </label>
                <input type="password" name="password" id="password-input" required class="form-input" minlength="4"
                       maxlength="12">
                <span id="password-error" class="error-text"></span>
            </div>
            <div class="form-row form-row-center">
                <button class="button button-submit">
                    Anmelden
                </button>
            </div>
        </form>
    </main>
</div>
<%@ include file="footer.jsp" %>