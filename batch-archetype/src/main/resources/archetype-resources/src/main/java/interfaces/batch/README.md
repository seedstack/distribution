**The Spring Batch-related classes are located under this package.** Spring Batch provides reusable functions that are
essential in processing large volume of records.

Rules:

* Batch jobs must be implemented in conformance to Spring Batch best-practices.
* The SeedStack Spring bridge is used to provide the ability to inject SeedStack-managed classes in Spring-managed classes.
* Spring context files should be located under `META-INF/spring` and named with the `*-context.xml` pattern. All Spring
contexts that are respecting this pattern are coalesced in a unique context automatically, no manual import is required.
* For best results, threading, transactions and data partitionning should be managed by Spring Batch.

Additional information:

* http://seedstack.org/docs/business/architecture
* http://seedstack.org/docs/business/package-layout
* http://seedstack.org/addons/spring-bridge/batch
* http://projects.spring.io/spring-batch
