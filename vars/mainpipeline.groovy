#!/usr/bin/env groovy

def call( String name = 'name' ) {

	pipeline {
		agent any

		stages {

			stage( 'Pre-build' ){
				steps {
					echo "Hello, ${name}."
				}
			}

			stage('Build') {
				steps {
					echo 'Build ...'
				}
			}
			stage('Test') {
				steps {
					echo 'Test ...'
				}
			}
			stage('Deploy') {
				steps {
					echo 'Deploy ...'
				}
			}
		}
	}

}
