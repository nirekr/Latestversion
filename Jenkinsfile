pipeline {
    agent {
        node{
          label 'maven-builder'
          //label 'builder-08'
          customWorkspace "workspace/${env.JOB_NAME}"
        }
    }
    tools {
        maven 'linux-maven-3.3.9'
        jdk 'linux-jdk1.8.0_102'
    }
    options { 
        buildDiscarder(logRotator(numToKeepStr: '5'))
        timestamps()
    }
    stages {
        stage('Stable Branch') {
            steps {
                checkstablebranch()
              
            }
        }
    }
    post {
        always {
            cleanWorkspace()   
        }
    }
}
