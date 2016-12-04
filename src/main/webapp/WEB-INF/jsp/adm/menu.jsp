<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="prehled" ${pageContext.request.requestURI eq '/WEB-INF/jsp/index.jsp' ? 'class="pol-aktivni"' : ''}>Přehled</a>
<a href="letenky" ${pageContext.request.requestURI eq '/WEB-INF/jsp/index.jsp' ? 'class="pol-aktivni"' : ''}>Letenky</a>
<a href="objednavky" ${pageContext.request.requestURI eq '/WEB-INF/jsp/index.jsp' ? 'class="pol-aktivni"' : ''}>Objednávky</a>
<a href="uzivatele" ${pageContext.request.requestURI eq '/WEB-INF/jsp/index.jsp' ? 'class="pol-aktivni"' : ''}>Uživatelé</a>
<a href="destinace" ${pageContext.request.requestURI eq '/WEB-INF/jsp/index.jsp' ? 'class="pol-aktivni"' : ''}>Destinace</a>
<a href="adm/admin" ${pageContext.request.requestURI eq '/WEB-INF/jsp/adm/admin.jsp' ? 'class="pol-aktivni"' : ''}>Administrátoři</a>
<a href="/logout">Odhlásit</a>