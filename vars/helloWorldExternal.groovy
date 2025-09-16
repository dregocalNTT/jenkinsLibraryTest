def call(Map config = [:]) { 
    def scriptContents = libraryResource "/scripts/helloWorld.bat"
    writeFile file: "helloWorld.bat", text: scriptContents
    bat "helloWorld.bat ${config.name} ${config.dayOfWeek}"
}