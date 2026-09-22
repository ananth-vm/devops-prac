pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                echo '1. Fetching latest code from source control (e.g., Git)...'
            }
        }
        stage('Build') {
            steps {
                echo '2. Compiling the project...'
            }
        }
        stage('Test') {
            steps {
                echo '3. Running unit and integration tests...'
            }
        }
        stage('Deploy') {
            steps {
                echo '4. Deploying application to the staging environment...'
            }
        }
    }
}
