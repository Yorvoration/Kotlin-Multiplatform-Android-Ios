package app.alfanar.multiplatform

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    var version: String = UIDevice.currentDevice.systemVersion
    var model: String = UIDevice.currentDevice.model
    var localizedModel: String = UIDevice.currentDevice.localizedModel
    var identifierForVendor: String = UIDevice.currentDevice.identifierForVendor.toString()
    var isSimulator: Boolean = UIDevice.currentDevice.model.contains("Simulator")

    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + " " + UIDevice.currentDevice.model

}

actual fun getPlatform(): Platform = IOSPlatform()