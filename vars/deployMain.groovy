#!/usr/bin/env groovy
def call(){
node {
 pipeline {
    agent any
    stages {
        stage('Read Parameters') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		stage('Version Control') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		
		stage('CkeckOut SCM') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		
		stage('Build') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		stage('Sonar Qube Analisys') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		stage('Unit Test') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		stage('Save Artifacts') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		stage('Artifact Deploy') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		stage('Release') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		
		stage('Measure Validate') {
            steps {			
                    echo "Multiline shell steps works too"
            }
        }
		
		
		
    }
}

}
}