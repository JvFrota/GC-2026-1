pipeline {
    agent none 

    // Ajustado para o termo exato que o Jenkins exige
    tools {
        dockerTool 'default'
    }

    stages {
        stage('Build em Container') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17-alpine'
                    reuseNode true 
                }
            }
            steps {
                echo 'Iniciando o Build em um container Docker...'
                sh 'mvn clean compile'
            }
        }

        stage('Testes em Container') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17-alpine'
                    reuseNode true
                }
            }
            steps {
                echo 'Iniciando os Testes em outro container Docker...'
                // Ignora falha de teste para que a pipeline continue e marque como instável (Cenário 3)
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