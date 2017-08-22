# AjiL
This repository is home of the Aji Modeling Language (AjiL). AjiL is a modeling language a supportive tool to describe and create Microservice Architecture (MSA).

##Description

As a modeling language, AjiL comprises three components: (i) Abstract syntax, (ii) Concrete syntax, and (iii) Semantics. 

###Abstract Syntax aka Metamodel

(/picture/metamodel.png "Figure 1: AjiL Metamodel")

As depicted in figure 1, starting from the system as the root element, a MSA consists of several microservices which can
be classified as functional or their infrastructural purpose. Each service consists of a domain
model, which aggregates multiple entities, and one or more interfaces. In AjiL, interfaces can
provide abilities, e.g. create or read, to manipulate entities of a service and thus are used to describe the endpoint of a service. In addition to the multiplicities shown in the figure, the abstract syntax comes with several constraints, e.g. to conceal entity relations to a single service. The constraints form AjiL's syntactical semantics and are formulated in the Object
Constraint Language (OCL). The constraints are detailed as follows.
* Unique names for the classes `Microservice`, `Interface`, `Domain Model`, `Ability`
* Unique ports for each service
* `Entities` are only allowed to inherit from `Entities` of the same `Domain Model`
* `Entities` are only allowed to relate to other `Entities` of the same `Domain Model`  
* Prohibition of self-relations for `Entities`
* Functional services are not allowed to depend on themselfs

###Concrete Syntax

(/picture/examplemodel.png "Figure 2: Notation Example")

AjiL's concrete syntax, exemplified in figure 2, can be characterized as a Box-and-Line diagram type. It uses uses shapes and colors to distinguish between the different language elements. 

###Editor
Eclipse Sirius Framework HYPERLINK
For
creating such diagrams, AjiL comes with an editor which is realized using the Eclipse Sirius
Framework.
###Generator
Eclipse Epislon Generation Language HYPERLINK

At last, AjiL as a tool comprises a template-based generator realized with the Epsilon
Generation Language (EGL) [4]. The generator is able to convert persisted AjiL diagrams
created with the editor into a runnable MSA. The MSA is based upon Java and the Spring
framework.

##Installation



