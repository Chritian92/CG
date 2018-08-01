pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
	        sh 'chmod +x gradle/quickstart/gradlew'
			sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
			 archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
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
				sh './gradle/quickstart/gradlew clean build -p gradle/quickstart/'
            }
        }
		post {
			always {
				junit 'gradle/quickstart/build/test-results/test/*.xml'
			}
			success {
				archiveArtifacts artifacts: 'gradle/quickstart/build/libs/*.jar', fingerprint: true
			}
			publishHTML (target: [
				allowMissing: false,
				alwaysLinkToLastBuild: false,
				keepAll: true,
				reportDir: 'quickstart/build/reports/tests/test',
				reportFiles: 'index.html',
				reportName: "Tests Report"
			])				
		}
    }
}
