#Simple Example
This simple example lets you create a small microservice system consisting of three functional services and a discovery service. The transformation is based on the information modeled in ``MyTestModel.ajimlt``. To run the services simply use the following commands for each service. Please note that the discovery should be started first.

```console
mvn clean install
cd _path-to-folder-containing-file_/generated/_the-service_/target/
java -jar _servicename_.jar
```