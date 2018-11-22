pipeline {
  agent any

  stages {
    stage('Build') {
      steps{
	sh './webApplication/gradlew clean assemble -p webApplication'
      }
    }
	
    stage('Testing') {
      steps {
        sh './webApplication/gradlew test -p webApplication'
        junit '**/test-results/test/*.xml'
      }
    }
	
    stage('Publish') {
      steps{
        sh './webApplication/gradlew uploadArchives -p webApplication'
        archiveArtifacts artifacts: '**/repos/*.jar'
      } 
    }
  }
}
