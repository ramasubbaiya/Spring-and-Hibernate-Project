# Spring-and-Hibernate-Project

## Goals of Spring
* Lightweigh Development with POJO
* Dependency Injection to promote loose coupling
* Declarative programming with AOP (Aspect Oriented Programming)
* Minimize boiler plate code

## Configuring Spring Container
* XML configuration file (legacy, but most legacy apps still use this)
* Java Annotations (modern)
* Java Source Code (modern)

## Spring Development Process
1. Configure your Spring Beans
2. Create a Spring Container
3. Retrieve Beans from Spring Container

### Constructor Injection
1. Define the dependency injection and class
2. Create a constructo in your class for injections
3. Configure the dependency injection in Spring config file

## Bean Scopes
* Scope refers to the lifecycle of the bean
* How long does the bean live?
* How many instances are created?
* How is the bean shared?

## What are Java Annotations?
* Special labels/markers added to Java classes
* Proide meta-data about the class
* Processed at compile time or run-time for special processing

## What is Spring AutoWiring
* For dependency injection, Spring can use auto wiring
* Spring will look for a class that _matches_ the property
* _matches by type_ : class or interface
* Spring will inject it automatically - Hence it is autowired


## Autowiring Injecting Types
* Constructor Injection
* Setter Injection
* Field Injection

## Java Source - configuration based
Steps:
1. Create a Java class and annotate as @Configuration
2. Add component scanning support: @ComponentScan (optional)
3. Read Spring Java configuration class
4. Retrieve bean from Spring container

## Spring MVC Benefits
* The Spring way of building web app UIs in Java
* Leverage a set of resuable UI components
* Help manage application state of web requests
* Process form data: validation, conversion etc
* Flexible configuration for the view layer

## Components of Spring MVC Application
* A set of web pages to layout UI components
* A collection of Spring beans (controllers, services, etc...)
* Spring configuration (XML, Annotations or Java)

## Hibernate installation and setup
1. Add Hibernate Configuration file
2. Annotate Java Class
3. Develop Java Code to perform database operations

## Two Options for Mapping
* XML config file (legacy)
* Java Annotations (modern, preferred)
