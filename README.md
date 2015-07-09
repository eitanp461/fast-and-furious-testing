# fast-and-furious-testing
A guide on using JUnit categories using maven-failsafe-plugin

Maven failsafe plugin can [run JUnit categories](http://maven.apache.org/surefire/maven-failsafe-plugin/examples/junit.html#Using_JUnit_Categories).

The [API](http://maven.apache.org/surefire/maven-failsafe-plugin/integration-test-mojo.html#groups) says that "Only classes/methods/etc decorated with <strong>one</strong> of the groups specified here will be included in test run" 

And indeed running 

		mvn verify -Pfast
		
Runs both MyFastTest and MyFastAndFuriousTest.

But it turns out you can use group additivity to run a test class/method that has a <strong>all</strong> of the listed groups.

A use case example is running a test annotated with a category that includes {Sanity.class, Slow.class} in a custom Maven profile.

This can be achieved by combining profiles with "AND". See this project's pom.xml

Running

		mvn verify -Pfast-and-furious
		
Runs only MyFastAndFuriousTest since it has both annotations.
 
