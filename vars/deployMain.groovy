#!/usr/bin/env groovy
def call(){
node {
  stage('HelloWorld') {
    echo 'Hello World'
  }

  stage('git clone') {
    git clone "ssh://git@mywebsite.com/myrepo.git"
  }
}
}