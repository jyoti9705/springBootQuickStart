1.	Spring Boot Starter Parent
a.	Spring Boot Dependencies is the parent for Spring Boot starter parent
b.	It has default configurations for all important maven configurations
c.	Specifies version of dependencies
d.	By Defaults provides java version as JDK 1.8
2.	Spring Boot Starter Web
a.	All dependencies required for running web applications
b.	Spring Dependencies are provided by Spring Boot Starter web
c.	Gives us Embedded Tomcat, Hibernate-Validator, etc.
d.	Brings in by default all the items required for building web applications.
3.	Embedded Tomcat
a.	Is received through Spring Boot Starter Web
b.	Tomcat is included in the application hence it is called an embedded tomcat
4.	Dev Tools
a.	Keeps monitoring project folders and if any change was spotted it restarts the application
5.	Dispatcher Servlet
a.	Dispatcher Servlet searches for request e.g., /login, and then searches for a view which we want it to return if we have not added response body on the URL
b.	Whenever we provide view name to Dispatcher servlet it makes use of View Resolver to resolve the view
c.	How do we inform the view resolver of the path of view?
i.	In the application. Properties
1.	“<viewname>”->path to the view
2.	Spring.mvc.view.prefix = /WEB-INF/jsp/
3.	Spring.mvc.view.suffix = .jsp
d.	To enable JSP support in embedded tomcat server we need to have a tomcat-embed-jasper dependency 
6.	@Controller
a.	This annotation is used by Spring Boot to detect controller classes
7.	@ResponseBody
a.	When dispatcher servlet redirects request to controller class with @Controller Annotation it searches for view return to back, @ResponseBody is used if we do not want request to search for JSP view in return and return the value
8.	Model
a.	Model is used to pass data from controller to the view in JSP
b.	In JSP expression language is used to fetch the value from Model	
9.	Spring MVC Request Flow
a.	Any Request that comes to the web application first goes to dispatcher servlet
b.	Dispatcher servlets acts as a front controller
c.	Dispatcher servlet then searches the mappings available; he would know that there is a method in login controller that can handle these request
d.	Looks at the URL and the data available to identify the right controller for it
e.	Controller puts the data to the model, also the controller says I would like to go the login view or we want to refer
f.	Dispatcher servlet then goes to the view resolver and says that someone is looking for login, view resolver then looks for prefix and suffix and sends to the dispatcher servlet, Dispatcher servlet takes the model makes it available to the view, Once the view is executed, we get the HTML Response back which is then taken by the front controller that is dispatcher servlet to end-user
g.	If we are just using Spring MVC then we will have to create the Dispatcher servlet map the URLs and do all other configurations
h.	Using Spring Boot Starter Dependency provides us auto-configuration, where it automatically provides us with Dispatcher Servlet
10.	Request comes to Front Controller -> Front Controller to the actual controller -> controller sends view to Dispatcher Servlet i.e., Front Controller -> Front Controller sends view to View Resolver -> View Resolver sends the HTML Back to Front Controller -> Front Controllers send this HTML to End User
11.	Request Mapping
a.	Request Mapping uses all types of requests
b.	To avoid this, we should provide specific mapping 
12.	Issues when developing applications with the traditional spring approach
a.	Core
i.	Used for dependency injection
b.	MVC
i.	To develop web layer for application
c.	DAO
i.	Where we used Spring JDBC
d.	ORM
e.	XML Based Configurations and annotations were used
f.	These configurations become cumbersome and hard to use with time
g.	At runtime, we have to be sure that versions are compatible and we have to deploy it
13.	Microservices
a.	It is a different way of building applications unlike monolithic architecture, the traditional way is one code base or maybe multiple code base but gets deployed as a single entity i.e., monolithically deployed on the server
b.	  
14.	What Spring Boot is?
a.	Spring -> It is the Spring Framework
b.	Boot is Bootstrap
c.	Spring Boot lets you bootstrap spring application
d.	Spring Boot makes it easy to create stand-alone, production-grade spring-based applications that you can just run
15.	What is Spring?
a.	Application Framework
b.	Let’s you build enterprise Java applications
c.	Programming and configuration model
d.	Infrastructure Support
e.	Problems with Spring
i.	Spring is a huge framework
1.	Over the year Spring has solved most of the problems like huge problems because of which it has turned out to be huge Framework
f.	Multiple Setup Steps
i.	Spring can connect to multiple applications like Mongo DB, SQL, and many other applications so it also has multiple steps for Setting the application connections
g.	Multiple Configuration Steps
h.	Multiple build and Deploy Steps
16.	Spring Boot
a.	It is opinionated
b.	It features convention over configuration
c.	Standalone
i.	You can use Spring Boot to generate Spring Application
ii.	Ready to use 
d.	Production Ready
17.	When we build spring application
a.	We need dependencies 
b.	These dependencies are provided in pom.xml
c.	When we run the maven command maven goes to the URL to download the list of dependencies required and automatically adds it to the classpath rather than explicitly adding jars on the classpath
18.	Spring Boot Starter Parent
a.	When we are adding this dependency, we are simply specifying that our project is a child of this parent
19.	Json conversions happen automatically while returning 
20.	Dependencies specify what to download
21.	And Spring Boot Parent specifies what version to download which is called Bill of Materials
22.	Embedded Tomcat Server
a.	Convenience 
i.	When we want to use Tomcat, we don’t need to download it and deploy it to use it
b.	Servlet Configurations steps not required, if we want one, we can specify in the application Config
c.	Stand-Alone Application can be built easily with an embedded tomcat server
d.	Useful for microservices architecture
i.	No multiple deployments required for building a microservices architecture
23.	Spring MVC Controller
a.	Spring MVC makes u build a controller which allows you to map URL to functionality
i.	Controller is simple Java Class
ii.	In Controller Functionality is mapped with 2 
1.	URL 
2.	Request Method
b.	Spring MVC has built is libraries to convert Java class to JSON
24.	Resources of Rest API
a.	Once we have identified the resources, we can make use of that to be identified by HTTP Method  
25.	Business Service
a.	Business Services are singletons
b.	When we start a spring boot application spring boot creates an instance of these services and we can have other classes which depend on these services
c.	How do we specify the Spring Framework that this class in Business service?
i.	We will add @Service annotation over those Classes
d.	When applications start it detects the service classes adds them to the classpath
e.	As this is a singleton it will not always create new instance wherever these services are used
f.	How do we ask spring boot for instance of these services?
i.	We declare the class as private where we want to use when spring boot application starts it also looks for member variables required by class and injects those dependencies, we declare dependency by another annotation @Autowired
ii.	How it works is Spring when detects the member variable required from the class it looks into registry if there is an instance of required member variable present and injects it inside the class where it is required
26.	How to Start Spring Boot API?
a.	Spring Initializer
b.	Spring Boot CLI
c.	STS IDE
27.	Customizing Spring Boot
a.	application.properties
1.	It lets u configure 20% of the application
2.	We can find fields that can be configured in the application.properties file on spring boot official website searching for the common application.properties
28.	JPA
a.	Java Persistence API
b.	Specification that lets u do ORM – Object Relational Mapping
c.	ORM lets u map entity classes to SQL Tables
d.	We do not need to map ourselves
e.	JPA is a way to map our Data
f.	Spring Data JPA makes it easy for us to work with SQL tables and lets the framework do all the configurations
g.	We need to specify the entity classes which will be tables
i.	Each member variable inside entity classes will act as a column for the tables
ii.	Each instance of the entity class will go as a row in the table
iii.	We need to annotate entity classes with @Entity Annotation
iv.	With the above annotation JPA knows that we need to create a table 
v.	We need to specify the primary key of the class with @Id annotation
h.	Repository
i.	JPA Provides a common repository that can be used to perform crud operations on the entity classes
ii.	Name of the common repository is CrudRespository, JPARespository
iii.	We need to specify a few generic types to use the above repository which is: Entity classes and Primary Key
iv.	We can autowire specific repository in-service classes and make use of it to perform curd operations 
i.	We can make use of embedded Apache Derby database to create dummy application
j.	We can perform get, update, delete, save operations as required using repositories 
k.	Foreign Key can be specified in Entity using below annotations
i.	ManyToOne to OneToMany accordingly
29.	How to get application deployment-ready?
a.	Require a jar file which bundles are the configurations
i.	Add Packaging as jar in pom.xml
ii.	Go to project location
iii.	Perform mvn clean install
iv.	Command: java -jar name
v.	To generate war
1.	Add packaging as war in pom.xml
2.	Perform maven clean install
3.	Same process will be done as above just war will be present instead of jar
30.	How can we monitor our spring Boot application deployed?
a.	Actuator
i.	Production ready features to monitor your application
ii.	We can perform get request to URL: /health
1.	Above is the new endpoint which got added to show us status of our application
2.	If we want our health check URLs to run on separate port on local we can specify it in application.properties with management.port property
3.	
