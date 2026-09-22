pipeline {
    agent any

    // Triggers execution periodically regardless of whether code changes or not
    // Adjust the schedule as needed, or remove triggers if you only want manual "Build Now"
    triggers {
        // Runs every hour, hashed across instances:
        cron('* * * * *')
        
        // Example for every 15 minutes:
        // cron('H/15 * * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                // Pulls the repo code
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                bat '''
                    if not exist bin mkdir bin
                    javac -d bin Jenk.java
                '''
            }
        }

        stage('Execute') {
            steps {
                bat 'java -cp bin Jenk'
            }
        }
    }

    post {
        always {
            // Cleans up the workspace after execution
            cleanWs()
        }
    }
}
