# UI Automation Project

## Overview

This repository contains UI automation scripts to test web functionalities using Java, Selenium, Cucumber and Page Object Model.(https://www.saucedemo.com/)

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Setup](#setup)
3. [Running Test](#running-test)
4. [Project Structure](#project-structure)


## Prerequisites

- Java
- Selenium
- Cucumber
- Page Object Model

## Setup

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/jingtechy/saucedemo

## Running Test
1. Running login page tests
`./gradlew build cucumber -P tags=@login`
2. Running home page tests
`./gradlew build cucumber -P tags=@home`

## Project Structure

<details>
  <summary>Click to expand project structure</summary>

```scss
/ui-automation-project
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── saucedemo
│   │   │   │   ├── pages
│   │   │   │   │   ├── LoginPage.java
│   │   │   │   │   ├── HomePage.java
│   │   │   │   │   ├── DashboardPage.java
│   │   │   │   ├── utilities
│   │   │   │   │   ├── BrowserDriver.java
│   │   │   │   │   ├── UtilityBase.java
│   │   ├── resources
│   │   │   
│   ├── test
│   │   ├── java
│   │   │   ├── saucedemo
│   │   │   │   ├── runners
│   │   │   │   │   ├── TestRunner.java
│   │   │   │   ├── features
│   │   │   │   │   ├── LoginPage.feature
│   │   │   │   │   ├── HomePage.feature
│   │   │   │   ├── stepdefinitions
│   │   │   │   │   ├── LoginStepDefinitions.java
│   │   │   │   │   ├── HomeStepDefinitions.java
│   │   ├── resources
│   │   
├── .gitignore
├── build.gradle
├── README.md




