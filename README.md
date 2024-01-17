# UI Automation Project

## Overview

This repository contains UI automation scripts to test web functionalities using Java, Selenium, Cucumber and Page Object Model.(https://www.saucedemo.com/)

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Setup](#setup)
3. [Project Structure](#project-structure)
4. [Running Test](#running-test)


## Prerequisites

- Java
- Selenium
- Cucumber
- Page Object Model

## Setup

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/jingtechy/saucedemo

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

