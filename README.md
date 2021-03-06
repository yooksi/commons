# JJute Commons Library

---

This is a simple Java library for everyday use that implements a wide range of useful utilities and essential functionalities that most beginner and intermediate Java developers should find useful. Read the features section for more information on what the library has to offer.

## Motivation

It is developed primarily for use with my personal project and my motivation to continue development comes from the continual pursuit of finding elegant and efficient conceptual and implementation Java designs.

## Build status

[![Build Status](https://travis-ci.com/jjute/commons.svg?branch=develop)](https://travis-ci.com/jjute/commons)
[![Coverage Status](https://coveralls.io/repos/github/jjute/commons/badge.svg?branch=develop)](https://coveralls.io/github/jjute/commons?branch=develop)
[![Jitpack Release](https://jitpack.io/v/jjute/commons.svg)](https://jitpack.io/#jjute/commons)

---

## Features

- Easy to create AOP proxies and method interceptors.
- Programmatic creation and execution of Bash scripts.
- Better control and easier use of Log4j loggers.
- Many utility wrappers offering more operations and finer execution.
- Useful regular expression patterns for common use.
- Lightweight Bean validation framework.
- Custom annotations with full validation support.

## Dependencies

- All library logging is facilitated by [Apache Log4j2](https://logging.apache.org/log4j/2.x/).
- Most utilities depend on [Apache Commons](https://commons.apache.org/) components.
- AOP aspects are implemented with [Spring Framework](https://spring.io/).
- Validations are performed with [Hibernate Validator Engine](http://hibernate.org/validator/). 
- IDEA integration is done with [JetBrains Java Annotations](https://mvnrepository.com/artifact/org.jetbrains/annotations).

## Frameworks

- **Build automation**: Gradle 5.5
- **Unit testing**: JUnit 5

---

## Development

To setup the development environment you should install Jute Framework which will give you access to build automation and advanced features like code coverage. Read more about how to do that in the [installation](https://github.com/jjute/jute#installation) section of the project's documentation. It is also recommended to use IntelliJ IDEA as Jute comes with integration support for IntelliJ.

## License

This project is under [Apache License 2.0](https://choosealicense.com/licenses/apache-2.0/).

Apache License 2.0 is a permissive license whose main conditions require preservation of copyright and license notices. Contributors provide an express grant of patent rights. Licensed works, modifications, and larger works may be distributed under different terms and without source code. For more information read the `LICENSE.txt` file.

