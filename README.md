# cucumber-allure-gradle

### Build
    gradle clean build -i

### Error

    tests.CucumberJvmTest > initializationError FAILED
        cucumber.runtime.CucumberException: Couldn't load plugin class: 
        io.qameta.allure.cucumberjvm.AllureCucumberJvm. It does not implement cucumber.api.Plugin
        
### build.gradle

    buildscript {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
        
        dependencies {
            classpath "io.qameta.allure:allure-gradle:2.3"
            //classpath "io.qameta.allure:allure-gradle:2.5" -- have also tried this version
        }
    }
    
    apply plugin: 'java'
    apply plugin: 'io.qameta.allure'
    
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
    }
    
    dependencies {
        compile 'io.cucumber:gherkin:5.1.0'
        compile 'io.cucumber:cucumber-core:4.2.0'
        compile 'io.cucumber:cucumber-java:4.2.0'
        compile 'io.cucumber:cucumber-junit:4.2.0'
        compile 'io.qameta.allure:allure-gradle:2.3'
        compile 'io.qameta.allure:allure-cucumber-jvm:2.8.1'
    
        testCompile 'junit:junit:4.12'
    }
    
    test {
        useJUnit()
    }
