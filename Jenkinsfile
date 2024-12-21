pipeline {
    agent any
    tools {        
        maven 'MAVEN_HOME'
    }

    stages {

        stage('Welcome Stage') {
            steps {
                echo "Welcome to Pipeline"
            }
        }  
        stage('Maven Test') {
            steps {
                sh 'mvn test'
            }
        }      

        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }        
        stage('Build Success') {
            steps {
                echo "Build Successful"
            }
        }   
        
        stage('Final Success') {
            steps {
                echo "Final Successful"
            }
        }     
        stage('Demo Success') {
            steps {
                echo "Final Successful"
            }
        }    

    }
}
