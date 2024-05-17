### Actividad Final para Bootcamp CODEKI - IT PAtagonia - Codo a Codo 
<img width=150 height= 100 src="https://github.com/Pedro410Ar/Codeki_1sem/blob/master/isologo-codeki.png"/> <img width=150 height= 100 src="https://github.com/Pedro410Ar/Codeki_1sem/blob/master/logo%20IT%20patagonia.jfif"/> <img width=150 height= 100 src="https://github.com/Pedro410Ar/Codeki_1sem/blob/193ea699549e598ee978e982448fca046a5d3ade/logo%20codo%20a%20codo.png"/> 

De acuerdo a la Actividad de Cierre propuesta en el Bootcamp, se realizó un proyecto siguiendo las temáticas tratadas. 


Para ello, se trabajó utilizando lenguaje JAVA. 


Se generó un proyecto Maven sobre el framework Springboot.


Como IDE se usó el IntelliJ Community. 


Para generar la DB se utilizó Workbench MySQL.


Así también, se usó Postman para simulación de peticiones HTTP. 

--------------------- -------------

El desarrollo del proyecto es incremental. 

Se inicia con una clase Flight que fue mapeada y se transformó en una Entidad para conectarse mediante JPA a una DB de tipo relacional trabajada en MySQL Workbench. 

Posteriormente, mediante la Clase RestTemplate se consume la API externa de DolarApi, que trae como información el valor actualizado del dólar.

Luego, en el Package model, se creó una nueva Entidad denominada Company, que posee atributos y métodos diferentes. La misma interactua con Flight presentando datos como el nombre de la aerolinea y su logo. 

En un paso posterior, el proyecto Flight se registró en el servicio de Eureka-Server.

Asimismo, también se registraron en Eureka-Server otros dos desarrollos. El primero denominado Ticket, que permite traer datos como el nombre y número de pasaporte del pasajero; y el segundo denominado Plane, que informa datos de la aeronave (marca y modelo de la aeronave). 

Finalmente, se configuró el Config-Server para que los 3 microservicios puedan ser distribuidos con dicha herramienta. 

De tal manera que al finalizar el proyecto tenemos datos que confluyen desde nuestra DB (donde existen dos Entidades: Flight y Company), de una API externa (DolarAPI) y de otros dos proyectos paralelos registrados en el Servidor Eureka (TicketAPI y PlaneAPI).  





