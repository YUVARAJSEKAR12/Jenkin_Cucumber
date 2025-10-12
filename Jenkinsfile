pipeline {
    agent any

    tools {
        // Must match names configured in Jenkins Global Tool Configuration
        maven 'Maven_3.9'  
        jdk 'Java_11'
    }

    environment {
        PATH = "$PATH:${tool('Maven_3.9')}/bin"
        TEST_TAGS = "@tag1"
    }

    stages {

        stage('Checkout Code') {
            steps {
                echo '📥 Pulling code from Git...'
                git branch: 'main', url: 'https://github.com/YUVARAJSEKAR12/Jenkin_Cucumber.git'
            }
        }

        stage('Build & Install Dependencies') {
            steps {
                echo '⚙️ Building project and downloading dependencies...'
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                echo '🧪 Running Cucumber tests...'
                sh 'mvn test'
            }
        }

        stage('Generate Cucumber Reports') {
            steps {
                echo '📊 Generating HTML reports...'
                sh 'mvn verify'
            }
            post {
                always {
                    cucumber buildStatus: 'UNSTABLE', 
                             fileIncludePattern: '**/target/cucumber-reports/*.json', 
                             sortingMethod: 'ALPHABETICAL'
                }
            }
        }

    }

    post {
        always {
            echo '✅ Pipeline Completed!'
            junit 'target/surefire-reports/*.xml' 
            cucumber fileIncludePattern: '**/target/cucumber-reports/*.json'
        }
        failure {
            echo '❌ Pipeline Failed!'
        }
    }
}
