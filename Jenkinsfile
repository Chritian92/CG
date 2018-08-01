pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                chmod +x gradle/quickstart/gradlew
                ./gradle/quickstart/gradlew clean assemble -p quickstart/
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
	        sh './gradle/quickstart/gradlew clean test -p gradle/quickstart/'
            }
        }
	post {
	   always {
		junit 'gradle/quickstart/build/test-results/test/*.xml'
	       publishHTML (target: [
		    allowMissing: false,
		  alwaysLinkToLastBuild: false,
		  keepAll: true,
		  reportDir: 'gradle/quickstart/build/reports/tests',
		  reportFiles: 'index.html',
		  reportName: "Tests Report",
		  reportName: 'Tests'
		])
		publishHTML (target: [
		    allowMissing: false,
		  alwaysLinkToLastBuild: false,
		  keepAll: true,
		  reportDir: 'gradle/quickstart/build/reports/jacoco',
		  reportFiles: 'index.html',
		  reportName: "Tests Report",
		  reportName: 'Jacoco Coverage Reports'
		])
	    }
	    success {
		archiveArtifacts artifacts: 'gradle/quickstart/build/libs/*.jar*', fingerprint: true
	    }
	}		
    }
}
