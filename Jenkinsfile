pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Build Image') {
            steps {
                //sh
                bat "docker build -t=manivels1987/dockerpoc ."
            }
        }
        stage('Push Image') {
            steps { 
		    bat "docker login --username=manivels1987 --password=Welcome2bsnl"
		    bat "docker push manivels1987/dockerpoc:latest"                         
            	}
        }
    }
}
