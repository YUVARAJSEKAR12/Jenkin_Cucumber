pipeline {
    agent any
    tools {
    git 'Default'
}
   

    stages {

        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/YUVARAJSEKAR12/Jenkin_Cucumber.git'
            }
        }

       

        stage('Functional Test') {
            steps {
               mvn(goal: "clean test -Dtest-TestRunnerTemplate -Dcucumber.options=\"--tags @tag1\"-")
            }
        }

       

    }
}
