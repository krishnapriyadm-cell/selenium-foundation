pipeline {
    agent any
parameters {
    choice(
        name: 'ENVIRONMENT',
        choices: ['QA', 'UAT'],
        description: 'Select test environment'
    )
}
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
				echo "Running tests in ${params.ENVIRONMENT}"
                sh '/opt/homebrew/bin/mvn test'
            }
        }

        stage('Report') {
            steps {
                junit '**/surefire-reports/*.xml'
            }
        }}
         post {
        always {
            echo 'Pipeline execution completed'
        }

        success {
            echo 'Automation tests passed'
        }

        failure {
            echo 'Automation tests failed'
        }
    }
    
}