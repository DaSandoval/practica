pipeline {
  agent any

  stages {
    stage('Build') {
      steps{
	      sh './quickstart/gradlew clean assemble'
      }
    }
	
    stage('Testing') {
      steps {
        sh './quickstart/gradlew test'
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
