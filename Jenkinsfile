pipeline {
  agent any

  stages {
    stage('Build') {
      steps{
	sh './quickstart/gradlew assemble -p quickstart'
      }
    }
	
    stage('Testing') {
      steps {
        sh './quickstart/gradlew test -p quickstart/build'
        junit './build/test-results/test/*.xml'
      }
    }
	
    stage('Publish') {
      steps{
        sh './quickstart/gradlew uploadArchives -p quickstart'
        archiveArtifacts artifacts: './repos/*.jar'
      } 
    }
  }
}
