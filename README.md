# PropertyManagementSystem
The Property Management System is a web-based application designed to streamline the management of real estate properties, tenants, and lease agreements. Built using the Spring Boot framework, the system offers a secure and efficient way for real estate companies to handle various aspects of property management. Key functionalities include adding, updating, and deleting property listings, managing tenant information, and tracking lease agreements.  


 In this implementation, the backend is built using Spring Boot, which provides RESTful APIs to manage properties, tenants, and leases. The frontend is built using React, which consumes these APIs to display and manage the data. The proxy configuration in the React app ensures that API requests are forwarded to the Spring Boot backend, avoiding CORS issues during development.

This setup provides a robust and scalable property management system with a clear separation of concerns between the frontend and backend, leveraging the strengths of both Spring Boot and React.
  This project uses Spring Boot for the backend and Thymeleaf for the frontend. The backend exposes RESTful APIs for managing properties, tenants, and leases, while the frontend uses Thymeleaf templates to render dynamic HTML pages. The ViewController handles routing and populating the model with data from the services.
This approach ensures seamless integration between the frontend and backend, leveraging the strengths of the Spring ecosystem for a robust and maintainable application.