#Complex Example
This model is a more complex containing all types of services. The Acceleo generator should be able to generate Spring Boot applications for each of the services defined in ``CargoSystem.ajimlt``. If you have installed the AjiL-Editor you can also manipulate the model to your liking.
The execute the generated services you need a MySQL-database and/or a MongoDB instance running. This is mandatory for the Security and UserManagement because the necessary user information are loaded from a MySQL DB (currently hard-coded in the template file). Additionally, the Security-Service needs a private/public KeyPair to encrypt communication. The corresponding keystore for the keys used in this example can be found in file ``keystore.jks``. Of course you are free to customize the model and/or create your own.

To run the services simply use the following commands for each service. Please note that the discovery should be started first.

```console
mvn clean install
cd _path-to-folder-containing-file_/generated/_the-service_/target/
java -jar _servicename_.jar
```