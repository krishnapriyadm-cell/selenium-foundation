pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                sh '/opt/homebrew/bin/mvn test'
            }
        }

        stage('Report') {
            steps {
                junit '**/surefire-reports/*.xml'
            }
        }
    }
}