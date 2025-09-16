def call(Map config = [:]) { 
    def scriptContents = libraryResource "resources\scripts\helloWorld.bat"
    writeFile file: "helloWorld.bat", text: scriptContents
    bat "helloWorld.bat ${config.name} ${config.dayOfWeek}"
}