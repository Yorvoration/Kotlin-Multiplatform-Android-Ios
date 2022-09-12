package app.alfanar.multiplatform

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}