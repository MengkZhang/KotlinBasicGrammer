package hanshushibiancheng

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * 生成一张100x100的红色图片
 */
fun main() {
    val image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    val w = 0..99
    val h = 0..99
    image.apply {
        for (i in w) {
            for (j in h) {
                setRGB(i, j, 0xff0000)
            }
        }
    }
    ImageIO.write(image, "bmp", File("a.bmp"))
}