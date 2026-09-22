pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Verify Java Environment') {
            steps {
                bat 'java -version'
                bat 'javac -version'
            }
        }

        stage('Compile') {
            steps {
                bat '''
                    if not exist bin mkdir bin
                    javac -d bin Main.java
                '''
                // If you have multiple files under src/:
                // javac -d bin src\\*.java
            }
        }

        stage('Run') {
            steps {
                bat 'java -cp bin Main'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
