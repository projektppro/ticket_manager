<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="header">
    <div id="navigation">
        <span id="mobile-navigation">&nbsp;</span>
        <a href="index" class="logo"><img src="/resources/images/logo.png" alt=""></a>
        <ul id="menu">
            <li ${pageContext.request.requestURI eq '/WEB-INF/jsp/index.jsp' ? 'class="selected"' : ''} >
                <a href="index">Letenky</a>
            </li>
            <li ${pageContext.request.requestURI eq '/WEB-INF/jsp/onas.jsp' ? 'class="selected"' : ''}>
                <a href="onas">O nás</a>
            </li>
            <li ${pageContext.request.requestURI eq '/WEB-INF/jsp/reference.jsp' ? 'class="selected"' : ''}>
                <a href="reference">Reference</a>
            </li>
            <li ${pageContext.request.requestURI eq '/WEB-INF/jsp/kontakty.jsp' ? 'class="selected"' : ''}>
                <a href="kontakty">Kontakty</a>
            </li>
            <li ${pageContext.request.requestURI eq '/WEB-INF/jsp/prihlasit.jsp' ? 'class="selected"' : ''}>
                <a href="prihlasit">Přihlásit</a>
            </li>
        </ul>
    </div>
</div>