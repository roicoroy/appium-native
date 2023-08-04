APPIUM_PORT = '4723'

stage('Start appium server') {
            steps {
                script {
                    echo "Start appium server on port ${APPIUM_PORT}"
                    sh "appium --port ${APPIUM_PORT}"
                }
            }
        }