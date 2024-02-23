def call(String dockerfilePath, String imageName, String tag) {
    sh "docker build -t ${imageName}:${tag} ${dockerfilePath}"
}
