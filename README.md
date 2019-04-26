# Spring-Framework

Popular framework for building enterprise java application, it is simple and lightweight, gives large number of helper class for build application.

# Primary functions of Spring Container
1- Create and Manage objects (Inversion of control - Outscource creation and management of objects)

2- Inject object dependencied (Dependency Injection - loose coupling)

# Configuring Spring Container

 There are 3 ways for configuration of Spring Container. In this project I have used XML configuration file.
 
1- XML configuration file

2- Java annotation 

3- Java source code 

# Spring Development process

1-Configure Spring Beans

2-Create a Spring Container - Known as ApplicationContext - Read an xml file

3- Retrieve Beans from Spring Container

I have used 2 out of many injections methods 

# Constructor injection

1- Define dependency interface and class

2-Create constructor in your class for injections

3- Configure the dependency in spring config file

# Setter injection

1- Create setter method in your class for injections

2- Configure the depedency injection in Spring config file

# Bean SCOPES- LifeCycle of Bean

1 -Default scope of bean is singleton
 

2 -Prototype - create new bean instance for each container req

3 -Request,session , global are Scoped for HTTP web apps.
 

