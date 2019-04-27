# Spring-Framework

Popular framework for building enterprise java application, it is simple and lightweight, gives large number of helper class for build application.

# Running the application

Step 1- Install Tomcat Server and connect it with IDE 
Step 2- Adding the Jar files which are in lib folder -

        Right click on Main project -> Properties-> Java Build Path -> Libraries -> Add Jar- Apply
        
# Classes and its functionalities

1- ServerDemoApp is the main class which will read sport.properties file and display Information.

2- BeanLifeCycleDemoApp shows and displays the lifecycle of the bean

3- BeanScopeDemoApp shows the scope of the bean (Singleton and Prototype)

# Primary functions of Spring Container
1- Create and Manage objects (Inversion of control - Outscource creation and management of objects)

2- Inject object dependencies (Dependency Injection - loose coupling)

# Configuring Spring Container

 There are 3 ways for configuration of Spring Container. In this project I have used XML configuration file.
 
1- XML configuration file

2- Java annotation 

3- Java source code 

# Spring Development process

1-Configure Spring Beans

2-Create a Spring Container - Known as ApplicationContext - Read an xml file

3- Retrieve Beans from Spring Container

# Injections methods 

I have used 2 out of all injection methods

## 1-Constructor injection

Steps-

1- Define dependency interface and class

2-Create constructor in your class for injections

3- Configure the dependency in spring config file

## 2-Setter injection

Steps-

1- Create setter method in your class for injections

2- Configure the depedency injection in Spring config file

# Bean Scope- LifeCycle of Bean

1  Singleton - Default scope of bean 
 
2 Prototype - Create new bean instance for each container req

3 Request, session and global are scoped for HTTP web apps.
 

