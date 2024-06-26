# My Own MVC Framework

This project is to mimic the MVC framework in Spring, which is to handle requests from client

## Features

- Implemented using Front Controller Pattern as Spring Web MVC Framework does, where Dispatcher Servlet is the first and only point of contact in the backend side when a request is received from the client side
- Handles requests from client and send views (JSP) as response

## Tech Stack

![Static Badge](https://img.shields.io/badge/Java-blue)
![Static Badge](https://img.shields.io/badge/Gradle-blue)
![Static Badge](https://img.shields.io/badge/Tomcat-blue)
![Static Badge](https://img.shields.io/badge/Servlet-blue)
![Static Badge](https://img.shields.io/badge/Reflections-blue)


## Implementation Flow
1. DispatcherServlet receives client requests
2. DispatcherServlet sends the request URI and HTTPMethod to RequestMappingHandler to choose appropriate Controller (= handler), which returns a view name (i.e. JSP page)
3. HandlerAdapter checks if the handler is supported, if so, let the controller handles the request to return either redirect or JSP view name to DispatcherServlet
4. DispatcherServlet passes the view name to ViewResolver, to return the appropriate view as a response

## Lessons Learned

- Forward vs Redirect 
- Forward - passes request to another servlet (doesn't pass through client again), so there is no new HttpServletRequest object
- Redirect - passes request through client to another servlet, so there is a new HttpServletRequest & HttpServletResponse

## Screenshots

- home.jsp from HomeController (localhost:8080)
  ![home](images/home.png)
- form.jsp from ForwardController (localhost:8080/user/form)
  ![home](images/userForm.png)
- list.jsp from UserListController (localhost:8080/users)
  ![home](images/userList.png)
