# Software Testing at Esslingen University (SWB 105 6043)

This repository contains example code as part of the Software Testing module (SWB 105 6043) at Esslingen University of Applied Sciences.

    Disclaimer: All content is for educational purposes only. I do not intend for the content to be a substitute for professional usage.

    Ausschlussklausel: Alle Inhalte dienen ausschließlich Bildungszwecken. Der Inhalt ist nicht für die professionelle Nutzung gedacht.

## Pre-requisits

To run the examples, you need to install the following components:

* Java Developer Kit 11 (or higher) - to run and develop Java applications
* Maven - tool to build Java applications and run tests
* JUnit 5 (via Maven) - library to develop and execute JUnit tests
* Git (optional) - to clone this repository.

### Linux

For Linux, you can run the following commands to install the pre-requisits:

```sh
$ sudo apt install openjdk-11-jdk maven git # to install (change version number for other Java versions), maven and git all in one
$ java -version # check if java installation was correct
$ maven -version # check if maven installation was correct
$ # (optional)
$ git --version # check if git installation was correct
```

### MacOS

For macOS, we assume you have already installed [Homebrew](https://brew.sh/). If not please do it before executing the followng commands.

```sh
$ brew -v   # check if homebrew is installed
$ brew install java maven git # to install latest java jdk, maven and git all in one
$ java -version # check if java installation was correct
$ maven -version # check if maven installation was correct
# (optional)
$ git --version # check if git installation was correct
```

## Build and Run Projects

Every single project contains project definition models for the Apache Maven tool. Just head into one of the projects and execute the following commands, e.g., to build the project and run test cases:

```sh
$ mvn clean compile # to build / compile the source code
$ mvn test # to execute the defined test cases
```
