def call(String imageName, String tag, String gcpProjectId, String gcpZone, String gcpInstanceName) {
    sh "gcloud compute instances update-container ${gcpInstanceName} --container-image=${imageName}:${tag} --zone=${gcpZone} --project=${gcpProjectId}"
}
