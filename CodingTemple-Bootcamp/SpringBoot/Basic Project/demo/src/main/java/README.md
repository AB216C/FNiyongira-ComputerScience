## SPRING BOOT ##

Spring is Java’s most popular framework designed for rapidly producing enterprise level applications.
It provides a comprehensive set of tools and libraries, allowing developers to build various types of applications, from web apps to microservices.
Key features include Inversion of Control (IoC) and Dependency Injection (DI), which promote modular and testable code.

Built on top of Spring, Spring Boot helps you quickly build production-ready Spring applications by reducing setup and configuration, offering sensible defaults to get started faster.

## SETTING UP SPRING BOOT PROJECT

Let’s set up a project with Spring Initializer (https://start.spring.io/)
Project: Maven (or Gradle)
Language: Java
Spring Boot: Leave default (latest stable version)
Project Metadata:
Group: com.example
Artifact: demo
(This will generate a package name like com.example.demo)
Packaging: Jar
Java: 17
Add your initial dependencies by clicking Add Dependencies and searching for spring Web
Spring Web - This allows us to run our server (Tomcat by default) and then allows us to add REST endpoints down the line
Download your Zip File and open it in IntelliJ. What you should get is:
DemoApplication.java: Your main class with @SpringBootApplication
pom.xml: Manages dependencies (like Spring Web)
src/main/java: Where your code lives
src/main/resources: Where config files like application.properties 

## ANNOTATIONS
Spring uses annotations to define and configure the behavior of your application. These annotations tell Spring what each class, method, or parameter is supposed to do — whether it's handling a web request, connecting to a database, injecting a dependency, or defining a configuration. Instead of writing a lot of XML or boilerplate code, annotations make Spring apps easier to build, read, and manage.

@RestController: tells Spring this class is used to handle web requests
@RequestMapping("/api/demo") - supplies the route ( can by “/”
@GetMapping: says “run this method when someone goes to / in the browser”
Returns a plain string

## DEPENDANCY AND INJECTION CONTROL
Inversion of Control (IoC): IoC is a principle where the framework controls how objects are created and connected, instead of you doing it yourself.
You don't create and manage everything — Spring does it for you!

Dependency Injection (DI): DI is a way to implement IoC. It means Spring automatically gives your class the objects (dependencies) it needs, instead of you creating them manually.

## BEANS
In Spring, a bean is the core building block used to enable Dependency Injection (DI). 
Instead of creating objects manually with new, you define them as beans, and Spring injects them wherever they’re needed. 
This is part of Inversion of Control (IoC) — Spring takes control of object creation and wiring, letting you focus on what the objects do rather than how they're built.

A bean in Spring is any object that is managed by the Spring container or the Application Context.
Beans are created, configured, and injected by Spring, allowing you to build loosely coupled applications. 
You can define beans manually using @Bean, or let Spring detect them automatically using annotations like @Component, @Service, or @Repository.

## APPLICATION CONTEXT
The Application Context is Spring’s central IoC container. It reads your bean definitions, creates and wires all beans together, and manages their full lifecycle. 
Whenever you ask Spring for a bean, you’re really asking the Application Context to hand you the pre-configured instance it’s managing.

Spring Service - Service classes are typically for implementing the business logic of our application.
For now, we’re just going to setup a method that returns a name but we’ll explore this further in the larger project

@Component tells Spring to automatically detect and manage a class as a bean. 
It scans for classes with this annotation, creates their instances, injects their dependencies, and makes them available for use throughout the application — no extra configuration needed.
Spring scans for @Component, creates an instance, and injects it into the controller.
Instead of manually creating objects, Spring manages and "injects" them where needed. 
This is the core part of Dependency injection.

Note: You CANNOT inject Beans into Static Fields/Methods and you CANNOT inject them into Endpoints
You should notice the error required a single bean, but 2 were found

What we can do now is use a Qualifier to pick which bean we want to inject

public SpringController(SpringService springService, @Qualifier("beanExample2") String bean) {
this.springService = springService;
this.beanExample = bean;
}
