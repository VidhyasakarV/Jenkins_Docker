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
                        sh "docker build -t mbpl"
                        sh "docker push mbpl"
                    }
                }
            }
        }
        stage('Docker run') {
            steps {
                script{
                    withDockerRegistry(credentialsId: 'docker02' ){
                        sh "docker run -d -p 5555:8888 --name container_mbpl mbpl"
                    }
                }
            }
        }
    }
}