pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {
        stage("build") {
            steps {
                echo "building"
            }
        }
      stage("test") {
            steps {
                echo "testing"
            }
        }
      stage("deploy") {
            steps {
                echo "deploying"
            }
        }
    }
}
