// vars/commonBuild.groovy
def call() {
    stage('Checkout') {
        checkout scm
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test' // Customize as needed
    }

    stage('Deploy') {
        echo "Deploying to environment..."
        // e.g., sh './deploy.sh ${env.DEPLOY_ENV}'
    }
}
