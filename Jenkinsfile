pipeline {
    agent any
    stages {
        stage('Preparation') { // for display purposes
            steps {
                 // Get some code from a GitHub repository
                git 'https://github.com/Aravindkumar2507/sampleSelenium.git'
            }
        }
        stage('Clean') {
                steps {
                        bat "mvn clean"
                }        
        }
        stage('Build') {
                steps {
                        bat "mvn test"
                }        
        }
        stage('Package') {
                steps {
                    echo "For It ISSSSSSS SKIPPPPEEEEEEDDDDDDDDD"
                    bat "mvn package"
                }    
        }
        stage('Results') {
            post{
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                
                }    
            }
        }    
    }
     post{
       success {
                    echo "Success From POst ControLLLL" 
                
       }        
    }   
}
