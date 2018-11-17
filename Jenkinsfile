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
        sh './quickstart/gradlew test -p quickstart'
        junit './build/test-results/test/*.xml'
      }
    }
	
    stage('Publish') {
      steps{
        sh './quickstart/gradlew uploadArchives'
        archiveArtifacts artifacts: './repos/*.jar'
      } 
    }
  }
}
