pipeline {
    agent any
    tools{
        jdk 'Openjdk8'
        maven 'Maven3'
    }

    stages {
        stage('SCM') {
            steps {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/VidhyasakarV/Jenkins_Docker.git'
            }
        }
        stage('Maven') {
            steps {
                sh "mvn clean install"
            }
        }
        stage('Docker Build & Push') {
            steps {
                script{
                    withDockerRegistry(credentialsId: 'docker02') {
                        sh "docker-compose build"
                    }
                }
            }
        }
        stage('Docker run') {
            steps {
                script{
                        sh "docker push mbpl"
                    sh "docker run -d -p 5555:8888 --name container_mbpl mbpl"
                }
            }
        }
    }
}