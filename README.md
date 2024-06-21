# PropertyManagementSystem
The Property Management System is a web-based application designed to streamline the management of real estate properties, tenants, and lease agreements. Built using the Spring Boot framework, the system offers a secure and efficient way for real estate companies to handle various aspects of property management. Key functionalities include adding, updating, and deleting property listings, managing tenant information, and tracking lease agreements.  


 In this implementation, the backend is built using Spring Boot, which provides RESTful APIs to manage properties, tenants, and leases. 
This setup provides a robust and scalable property management system with a clear separation of concerns between the frontend and backend, leveraging the strengths of  Spring Boot.
  This project uses Spring Boot for the backend and Thymeleaf for the frontend. The backend exposes RESTful APIs for managing properties, tenants, and leases, while the frontend uses Thymeleaf templates to render dynamic HTML pages. The ViewController handles routing and populating the model with data from the services.
This approach ensures seamless integration between the frontend and backend, leveraging the strengths of the Spring ecosystem for a robust and maintainable application.

Requirements Analysis

1) Property Management:

Add, update, and delete property listings.
Store detailed property information including address, description, rent amount, and availability status.

2) Tenant Management:
Add, update, and delete tenant information.
Maintain tenant records with personal details such as name, email, and contact information.

3) Lease Management:
Create, update, and terminate lease agreements.
Track lease details including start date, end date, rent amount, and associated property and tenant.

4) User Authentication and Authorization:
Secure login and registration for users.
Role-based access control (e.g., admin, property manager, tenant) to ensure appropriate access to system features.


Use Case Diagram

![7EC87701-9F86-450D-8A0B-1EAFDFE4C4AD.jpeg](src%2Fmain%2Fjava%2Fmiu%2Fedu%2FSpringSecurity%2Fimages%2F7EC87701-9F86-450D-8A0B-1EAFDFE4C4AD.jpeg)



ER and Architecture Diagram

![IMG_8939.jpg](src%2Fmain%2Fjava%2Fmiu%2Fedu%2FSpringSecurity%2Fimages%2FIMG_8939.jpg)


Class Diagram and interaction 
![FA6F1482-7211-4141-B227-2C15FB634298.jpeg](src%2Fmain%2Fjava%2Fmiu%2Fedu%2FSpringSecurity%2Fimages%2FFA6F1482-7211-4141-B227-2C15FB634298.jpeg)