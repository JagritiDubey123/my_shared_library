@Library('shared-library') _

// pipeline {
//     agent any
    
//     environment {
//         DOCKERFILE_PATH = 'resources/Dockerfile'
//         IMAGE_NAME = 'shared_file'
//         TAG = 'latest'
//         GCP_PROJECT_ID = 'jagriti-411012'
//         GCP_ZONE = 'us-cetral1-a'
//         GCP_INSTANCE_NAME = 'jenkins_debian'
//     }
    
//     stages {
//         stage('Build Docker Image') {
//             steps {
//                 script {
//                     buildDockerImage(DOCKERFILE_PATH, IMAGE_NAME, TAG)
//                 }
//             }
//         }
//         stage('Push Docker Image') {
//             steps {
//                 script {
//                     pushDockerImage(IMAGE_NAME, TAG)
//                 }
//             }
//         }
//         stage('Deploy Docker Image') {
//             steps {
//                 script {
//                     deployDockerImage(IMAGE_NAME, TAG, GCP_PROJECT_ID, GCP_ZONE, GCP_INSTANCE_NAME)
//                 }
//             }
//         }
//     }
// }
