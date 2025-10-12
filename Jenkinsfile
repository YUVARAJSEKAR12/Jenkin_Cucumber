pipeline {
    agent any
    environment {
        TEST_TAGS = "@tag1"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/YUVARAJSEKAR12/Jenkin_Cucumber.git'
            }
        }

        stage('Build & Install Dependencies') {
            steps {
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
