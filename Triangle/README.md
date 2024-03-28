Apply mutation testing using PIT (results reported at target/pit-reports):
mvn test-compile org.pitest:pitest-maven:mutationCoverage

Apply structural testing using JaCoCo (results reported at target/site/jacoco/):
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify org.jacoco:jacoco-maven-plugin:report
