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

