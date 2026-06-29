pipeline {
    agent none 

    stages {
        stage('Build em Container') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17-alpine'
                    // Remove o isolamento para herdar o socket do host perfeitamente
                    args '-v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps {
                echo 'Iniciando o Build em um container Maven...'
                sh 'mvn clean compile'
            }
        }

        stage('Testes em Container') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17-alpine'
                    args '-v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps {
                echo 'Iniciando os Testes em outro container Maven...'
                sh 'mvn test -Dmaven.test.failure.ignore=true'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}