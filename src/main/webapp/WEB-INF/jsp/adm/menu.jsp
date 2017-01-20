<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="/adm/index" ${pageContext.request.requestURI eq '/WEB-INF/jsp/adm/index.jsp' ? 'class="pol-aktivni"' : ''}>Přehled</a>
<a href="/adm/flight/flight" ${pageContext.request.requestURI eq '/WEB-INF/jsp/adm/flight/flight.jsp' ? 'class="pol-aktivni"' : ''}>Lety</a>
<a href="/adm/airplane/airplane" ${pageContext.request.requestURI eq '/WEB-INF/jsp/adm/airplane/airplane.jsp' ? 'class="pol-aktivni"' : ''}>Letadla</a>
<a href="/adm/destination/destination" ${pageContext.request.requestURI eq '/WEB-INF/jsp/adm/destination/destination.jsp' ? 'class="pol-aktivni"' : ''}>Destinace</a>
<a href="/logout">Odhlásit</a>