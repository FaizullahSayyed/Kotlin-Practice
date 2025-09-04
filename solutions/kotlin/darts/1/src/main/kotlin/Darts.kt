import kotlin.math.sqrt
import kotlin.math.pow

object Darts {

    fun score(x: Double, y: Double /* choose proper types! */): Int {
        val  distance: Double = sqrt(x.pow(2) + y.pow(2))
        if(distance <= 1){
            return 10
        }else if(distance <= 5){
            return 5
        }else{
            return 1
        }
            return 0
    }
}

fun main(){
    println(Darts.score(2.0, 4.0))
}
