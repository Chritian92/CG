pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
	        sh 'chmod +x gradle/quickstart/gradlew'
			sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
			 archiveArtifacts artifacts: 'gradle/quickstart/build/*.jar*', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
	        sh './gradle/quickstart/gradlew clean test -p gradle/quickstart/'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				
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
		}
    }
}
