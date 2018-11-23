pipeline{
  agent any

  stages{
    stage('Build quickstart'){
      steps{
	      sh './quickstart/gradlew clean assemble -p quickstart'
      }
    }

    stage('Testing quickstart'){
      steps{
        sh './quickstart/gradlew test -p quickstart'
        junit '**/test-results/test/*.xml'
      }
    }
  
    stage('Publish quickstart'){
      steps{
        sh './quickstart/gradlew uploadArchives -p quickstart'
        archiveArtifacts artifacts: '**/repos/*.jar'
      } 
    }

    stage('Build webApplication'){
      steps{
        sh './webApplication/gradlew clean assemble -p webApplication'
        sh './webApplication/gradlew uploadArchives -p webApplication'
        archiveArtifacts artifacts: '**/repos/*.war'
      }
    }

    stage('Testing webApplication'){
      steps{
        sh './webApplication/gradlew test -p webApplication'
        archiveArtifacts artifacts: '**/reports/tests/test/*.html'
      }
    }

    stage ('Security webApplication'){
      steps{
        sh './webApplication/gradlew sonarqube -p webApplication'
        sh './webApplication/gradlew dependencyCheckAnalyze -p webApplication'
        archiveArtifacts artifacts: '**/build/reports/*.html'
      }
    }

    stage ('Deploy webApplication'){
      steps{
        sh './webApplication/gradlew -b deploy.gradle copyWar'
      }
    }
  }
}

