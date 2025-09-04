import kotlin.math.sqrt
import kotlin.math.pow

object Darts {

    fun score(x: Number, y: Number ): Int {
        val dx = x.toDouble()
        val dy = x.toDouble()
        val  distance: Double = sqrt(dx.pow(2) + dy.pow(2))
        return when {
            distance <= 1.0 -> 10
            distance <= 4.0 -> 5
            distance <= 10.0 -> 1
            else -> 0
        }
    }
}

fun main(){
    println(Darts.score(0, 10))
}
