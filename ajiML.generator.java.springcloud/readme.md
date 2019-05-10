#AjiL Java Spring Cloud Netflix Generator
This is the generator for AjiMLT models. The generator uses the acceleo language to describe file templates (MTL-files) which basically consists of Java code and inject information from a loaded AjiMLT model file. The resulting services use the Spring Boot and Spring Cloud Netflix framework to provide directly buildable and executable implementation stubs which you only need to customize for your needs.
Of course you could also tune the templates and add/remote specific structures (e.g. database connections etc.).

Also you are free to implement your own generator for example generating services based on GoLang - if you do so, please geht in touch with us and contribute your development to the GitHub repository :)! 