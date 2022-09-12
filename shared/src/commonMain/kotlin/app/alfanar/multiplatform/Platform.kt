package app.alfanar.multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform