# Getting Started

### Reference Documentation
Spring Boot Version : 2.2.2.RELEASE

### Plugins
* PMD 			: 6.20.0 (Latest version as on Dec-22-2019)
* Jacoco 		: 0.8.5 (Latest version as on Dec-22-2019)
* SonarQube	: 2.7

### Plugin Configuration

* PMD is configured for checking Main files. Test files are not configured.
* "sonarqube" task is configured to publish the results to a remote server (armscodetest101z.prod.jp.local:9000)

### Build Procedure
Command Line:

For running tests, use this

```
gradle --info test
```

For running sonarqube

```
gradle --info sonarqube
```