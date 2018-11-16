pipeline{
  agent any

  stages{
    stage('Build'){
      steps{
	sh './quickstart/gradlew clear assemble -p quickstart'
      }
    }
  }
  stages{
    stage('Testing'){
      steps{
        sh './quickstart gradlew test -p quickstart'
        junit './build/*.xml'
      }
    }
  }
  stages{
    stage('Publish'){
      steps{
        sh './quickstart/gradlew uploadArchives -p quickstart'
        archiveArtifacts artifacts: './repos/*.jar'
      } 
    }
  }
}
