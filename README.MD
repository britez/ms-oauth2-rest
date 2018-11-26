<h1>MS OAuth2 REST</h1>
<h5>Microsevicio de authorización y autenticación de clientes y aplicaciones.</h5>
<p>Esta implementación es en memoria, solo para pruebas con otros microservicios</p> 
<h5>Rel:</h5>
<li><a href="https://spring.io/projects/spring-security-oauth">Spring OAuth2 Implementation</a></li>
<li><a href="https://oauth.net/2/">OAuth2 Protocol</a></li>

<h5>Resources</h5>
<p>Se crearon dos recursos: 
    <ul>/anon que es un recurso sin segurización</ul>
    <ul>/api/hello que es un recurso segurizado por rol del usuario final y scope de api</ul>
</p>

<h5>OAuth2:</h5>
<p>A continuación se detallan las urls para generar tokens</p>
<h6>Code Grant Flow<h6>
<p>Code generation: [GET] http://localhost:8080/oauth/authorize?client_id=client&response_type=code
</p>
<p>Login: Username: user Password: user</p>
<p>Token generation: 
    <ul>[POST] localhost:8080/oauth/token?grant_type=authorization_code&code={code}&client_id=client</ul>
    <ul> Authorization: Basic Y2xpZW50OnNlY3JldA==</ul>
</p>