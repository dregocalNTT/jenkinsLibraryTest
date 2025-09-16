def call(Map config = [:]) { 
    def scriptContents = libraryResource "com/planetpope/scripts/windows/helloWorld.bat"
    writeFile file: "helloWorld.bat", text: scriptContents
    bat "helloWorld.bat ${config.name} ${config.dayOfWeek}"
}