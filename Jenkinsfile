#!groovy

@Library('d11-jenkins-lib@master') _

pipeline {
  agent { label 'kube' }
  stages {
    stage('Validate git guidelines') {
      steps {
        script {
          validateGit()
        }
      }
    }
  }
}