<h1 align="center">Smart Parking Management System (SPMS)</h1>

<p align="center">
<b>Graduate Diploma in Software Engineering</b><br>
<b>ITS 1018 – Software Architectures & Design Patterns II</b><br>
<i>Final Examination Assignment — Microservice-Based Application</i>
</p>

<hr>

<h2>1. Project Overview & Business Scenario</h2>

<p>
Urban centers face ongoing congestion, fuel waste, driver frustration, and elevated greenhouse emissions due to vehicles circling for available parking spots.
Static and manual parking systems lack real-time visibility, scalability, and automated billing.
</p>

<p>
The <b>Smart Parking Management System (SPMS)</b> is a backend-only, cloud-native microservice application built with:
</p>

<ul>
<li>Spring Boot 3</li>
<li>Spring Cloud (Eureka, Config Server, Gateway, OpenFeign)</li>
<li>MySQL</li>
</ul>

<p>The system provides:</p>

<ul>
<li>Real-time space allocation, searching, reservation, and status transitions:
<b>AVAILABLE → RESERVED → OCCUPIED → AVAILABLE</b></li>
<li>Manual security overrides and simulated IoT sensor event processing.</li>
<li>Vehicle registration, owner linking, and entry/exit tracking.</li>
<li>Mock payment processing with card validation and digital receipts.</li>
<li>Historical activity logging for drivers, owners, and administrators.</li>
</ul>


<h2>2. Microservice Architecture</h2>

<pre>
Client / Postman
        |
        |
API Gateway (8080)
        |
 ------------------------------------------------
 |              |              |                |
User Service  Vehicle Service Parking Service Payment Service
(8081)        (8082)          (8083)           (8084)

        |
 -------------------------------
 |                             |
Eureka Server              Config Server
(8761)                     (8888)
</pre>


<h2>3. Technology Stack</h2>

<table border="1" cellpadding="8">
<tr>
<th>Category</th>
<th>Technology</th>
</tr>

<tr>
<td>Programming Language</td>
<td>Java 21 LTS</td>
</tr>

<tr>
<td>Framework</td>
<td>Spring Boot 3.3.4</td>
</tr>

<tr>
<td>Service Discovery</td>
<td>Netflix Eureka</td>
</tr>

<tr>
<td>API Gateway</td>
<td>Spring Cloud Gateway</td>
</tr>

<tr>
<td>Configuration</td>
<td>Spring Cloud Config Server</td>
</tr>

<tr>
<td>Communication</td>
<td>OpenFeign + LoadBalancer</td>
</tr>

<tr>
<td>Database</td>
<td>MySQL 8.0+</td>
</tr>

<tr>
<td>ORM</td>
<td>Spring Data JPA + Hibernate</td>
</tr>

<tr>
<td>Testing</td>
<td>JUnit 5, Mockito, Postman</td>
</tr>

</table>


<h2>4. Project Directory Structure</h2>

<pre>
smart-parking-management-system/

├── pom.xml
├── README.md
├── postman_collection.json
├── init.sql

├── config-repo/

├── eureka-server/
├── config-server/
├── api-gateway/

├── user-service/
├── vehicle-service/
├── parking-space-service/
├── payment-service/

└── docs/
    └── screenshots/
        └── eureka_dashboard.png

</pre>


<h2>5. Service Ports and Database Allocation</h2>

<table border="1" cellpadding="8">

<tr>
<th>Service</th>
<th>Port</th>
<th>Database</th>
<th>Description</th>
</tr>

<tr>
<td>Config Server</td>
<td>8888</td>
<td>None</td>
<td>Centralized configuration</td>
</tr>

<tr>
<td>Eureka Server</td>
<td>8761</td>
<td>None</td>
<td>Service registry</td>
</tr>

<tr>
<td>API Gateway</td>
<td>8080</td>
<td>None</td>
<td>Single entry point</td>
</tr>

<tr>
<td>User Service</td>
<td>8081</td>
<td>spms_user_db</td>
<td>User management</td>
</tr>

<tr>
<td>Vehicle Service</td>
<td>8082</td>
<td>spms_vehicle_db</td>
<td>Vehicle management</td>
</tr>

<tr>
<td>Parking Space Service</td>
<td>8083</td>
<td>spms_parking_db</td>
<td>Parking operations</td>
</tr>

<tr>
<td>Payment Service</td>
<td>8084</td>
<td>spms_payment_db</td>
<td>Payment processing</td>
</tr>

</table>


<h2>6. Database Setup</h2>

<p>
Ensure MySQL 8.0+ is running on:
</p>

<pre>
localhost:3306
</pre>

<p>Create databases:</p>

<pre>
CREATE DATABASE spms_user_db;
CREATE DATABASE spms_vehicle_db;
CREATE DATABASE spms_parking_db;
CREATE DATABASE spms_payment_db;
</pre>


<h2>7. Startup Order</h2>

<ol>
<li>Config Server - Port 8888</li>
<li>Eureka Server - Port 8761</li>
<li>User Service - Port 8081</li>
<li>Vehicle Service - Port 8082</li>
<li>Parking Space Service - Port 8083</li>
<li>Payment Service - Port 8084</li>
<li>API Gateway - Port 8080</li>
</ol>


<h2>8. REST API Resources</h2>

<p>
All API requests should be accessed through:
</p>

<pre>
http://localhost:8080
</pre>


<h3>User Service</h3>

<ul>
<li>POST /api/users/register</li>
<li>POST /api/users/login</li>
<li>GET /api/users/{id}</li>
<li>PUT /api/users/{id}</li>
<li>GET /api/users</li>
</ul>


<h3>Vehicle Service</h3>

<ul>
<li>POST /api/vehicles</li>
<li>GET /api/vehicles/{id}</li>
<li>PUT /api/vehicles/{id}</li>
<li>DELETE /api/vehicles/{id}</li>
<li>POST /api/vehicles/entry</li>
<li>POST /api/vehicles/exit</li>
</ul>


<h3>Parking Space Service</h3>

<ul>
<li>POST /api/parking-spaces</li>
<li>GET /api/parking-spaces</li>
<li>POST /api/parking-spaces/{id}/reserve</li>
<li>POST /api/parking-spaces/{id}/release</li>
<li>POST /api/parking-spaces/{id}/occupy</li>
<li>POST /api/parking-spaces/iot-sensor-update</li>
</ul>


<h3>Payment Service</h3>

<ul>
<li>POST /api/payments/process</li>
<li>GET /api/payments/{id}</li>
<li>GET /api/payments</li>
<li>GET /api/payments/receipts/{id}</li>
</ul>


<h2>9. End-to-End Business Flow</h2>

<ol>
<li>Register Driver</li>
<li>Register Parking Owner</li>
<li>Register Vehicle</li>
<li>Create Parking Space</li>
<li>Search Available Spaces</li>
<li>Reserve Parking Space</li>
<li>Vehicle Entry Simulation</li>
<li>Vehicle Exit Simulation</li>
<li>Process Payment</li>
<li>Generate Digital Receipt</li>
</ol>


<h2>10. Resources</h2>

<ul>
<li>
<a href="./postman_collection.json">
Postman Collection
</a>
</li>
</ul>


<h3>Eureka Dashboard</h3>

<img src="./docs/screenshots/eureka_dashboard.png"
alt="Eureka Dashboard"
width="900">


<hr>

<h3>Screenshot Instructions</h3>

<p>
Start all microservices following the startup order.
Open:
</p>

<pre>
http://localhost:8761
</pre>

<p>
Verify all services are registered in Eureka dashboard and save the screenshot as:
</p>

<pre>
./docs/screenshots/eureka_dashboard.png
</pre>
