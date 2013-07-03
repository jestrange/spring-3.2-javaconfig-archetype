spring-3.2-javaconfig-archetype
===============================

Spring 3.2 JavaConfig Maven Archetype

Clone the repository containing the archetype:
==============================
git clone https://github.com/jestrange/spring-3.2-javaconfig-archetype.git

Install the archetype:
==============================
git clean install

Run the archetype:
==============================
mvn archetype:generate -DarchetypeGroupId=org.jestrange -DarchetypeArtifactId=spring-3.2-javaconfig-archetype -DarchetypeVersion=1.0 -DgroupId=your.package  -DartifactId=yourappname

Run the application:
==============================
mvn clean tomcat7:run