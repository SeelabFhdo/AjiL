# AjiL
This repository is home of the AjiL tool. It comprises the Aji Modeling Language (AjiML), a graphical editor for creating AjiML diagrams (Aji Editor), and, currently, one code generator to support the developement of Microservice Architecture (MSA) (Aji Spring Cloud Generator). The tool is mainly developed by the SEELAB research group of Dortmund's University of Applied Sciences and Arts. If you want to know more about Model-Driven Engineering (MDE) we recommend the book *Engineering Modeling Languages: Turning Domain Knowledge into Tools* by Combemale et al. If you are new to the microservice architecture style the following article by Martin Fowler is a good starting point: https://martinfowler.com/articles/microservices.html

# Installation, Requirements and Quickstart
BBefore installing the actual tool you need a prepared Eclipse IDE with the Eclipse Modeling Framework, Eclipse Sirius and Acceleo components installed. We currently use the Photon (4.8) Release, but everything should work with older versions, too. 

1) Clone or download the AjiL GitHub repository to your hard drive
2) Use the Context Menu *Help -> Install New Software->Add->Archive* and browse to the local updatesite archive which you can find in the AjiML.releases project. You should now be able to install the editor.
3) You can create a new Modeling Project (*New->Modeling Project*)
4) Finally, add an AjiMLT Model to the project (*New->Other->AjiMLT Model*), select SystemT as root object switch to the Sirius perspective.
4b) In certain cases you might need to enable the AjiL Viewpoint manually, you can do that in the .aird file of you modeling project.
5) To start the graphical modeling you finally need to create the graphical representation of the SystemT object (*New Representation -> New Overview Diagram*).
6) Start modeling your system.

7) After you have finished modeling, you can use our Spring Cloud generator to get Java-stubs of your modeled services. To do so, you need to import the previously cloned generator project and point in its run configuration to your model file (cf Generator section or this short video https://youtu.be/4Ry60HSKrIQ). 

To edit the editor and NOT use the update site mechanism, this slightly outdated video shows the general setup of the projects for your Eclipse IDE and explains the project structure (approx. 10 minutes):
https://youtu.be/_7jhKK5LLSM 

# Documentation
As an easy starting point, we recommend the AjiL tutorial video series which is available on the SEELAB YouTube channel: https://www.youtube.com/channel/UCXrwySsGstqOxUOhNstmkng 
*Please note that you can install the editor now more comfortable compared to the statement in the video (cf. Installation).* 

## The Modeling Language
As a modeling language, AjiML comprises three components: (i) Abstract syntax, (ii) Concrete syntax, and (iii) Semantics. Each component is described in the following sections. Although we eagerly work on improving the language itself as well as its documentation, we are still in an early developement stage. Please feel free to help improve AjiL.

### Abstract Syntax/Metamodel
![AjiML Metamodel](pictures/metamodel.png "Figure 1: AjiML Metamodel")

*Figure 1: AjiML(T) Metamodel*

As depicted in Figure 1 (package AjiML), starting from the system as the root element, a MSA consists of several microservices which can
be classified as functional or their infrastructural purpose. Each service consists of a domain
model, which aggregates multiple entities, and one or more interfaces. In AjiL, interfaces can
provide abilities, e.g. create or read, to manipulate entities of a service and thus are used to describe the endpoint of a service. In addition to the multiplicities shown in the figure, the abstract syntax comes with several constraints, e.g. to conceal entity relations to a single service. The constraints form AjiL's syntactical semantics and are formulated in the Object
Constraint Language (OCL). The constraints comprise the following invariants:
* Unique names for the classes `Microservice`, `Interface`, `Domain Model`, `Ability`
* Unique ports for each service
* `Entities` are only allowed to inherit from `Entities` of the same `Domain Model`
* `Entities` are only allowed to relate to other `Entities` of the same `Domain Model`  
* Prohibition of self-relations for `Entities`
* Functional services are not allowed to depend on themselves
* (others)

Additionally, in recent development, we have extended the abstract syntax with an AjiMLT package which basically enriches several AjiML concepts with technical attributes (hence the 'T'), e.g. attributes for messaging mechanism or containerization, for the source code generator. We did this for a better separation of concerns in the language development.

### Concrete Syntax
![AjiML Overview Diagram](pictures/overview.png "Figure 2: AjiMLT Overview Diagram")

*Figure 2: AjiMLT Overview Diagram*

The concrete syntax is split into two different types of diagrams. Figure 2 shows the Overview Diagram which puts emphasis on the services and their communication structure with each other. Each service is depicted as a cube and colored according to his type, e.g. functional services are blue, discovery services are green. Interfaces are depicted as aligned circles to a service. At this stage, services are only seen as black boxes without further information about their inner parts.

![AjiML Service Diagram](pictures/detail.png "Figure 3: AjiMLT Service Diagram")

*Figure 3: AjiMLT Service Diagram*

To model a service's inner parts, AjiML comes with the service diagram type shown in Figure 3. The diagram shows all the inner aspects of a service including its entities and interfaces and abilities.

## Associated Tools
To create and work with AjiML or AjiMLT models the modeling language comes with an editor and a code generator.

### Editor
For creating AjiML and AjiMLT diagrams, AjiL comes with an editor which is realized using the [Eclipse Sirius
Framework](https://projects.eclipse.org/projects/modeling.sirius). In this short video tutorial (approx. 14 minutes) we introduce you to the graphical representation of AjiMLT models and the corresponding editor. 
https://youtu.be/KmdQIWatut4 

*Please note that we use an older version of AjiL in the video. However, the representation is basically still the same except that we now seperate the concerete syntax into two diagram types.*

### Generator
The generator is based on the Acceleo framework and creates a MSA leveraging the Spring Cloud framework. Although a detailed explanation is currently missing, you can use this tutorial video as a guideline of how to use it (approx. 8 minutes): 
https://youtu.be/4Ry60HSKrIQ

*Please note that although we put a lot of work into the generator it is still in a very early version because the possible solution space is extremly high, i.e., it might happen that the generated source code does not include all the information from your model or that it is not directly executable because for example of a missing database connection etc.*

# Contact and Acknowledgement
For any questions feel free to contact the corresponding developers Jonas and Philip here on github or visit [Dortmund's University of Applied Sciences and Arts](https://www.fh-dortmund.de/en/addresses/idial/sorgalla_jonas.php) website.
