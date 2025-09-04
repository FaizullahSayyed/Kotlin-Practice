object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        var num = start
        var steps = 0
        while(num != 1){
            num = if(num % 2 == 0){
                num / 2
            }else{
                num * 3 + 1
            }
            steps++
        }

        return steps
    }
}

fun main(){
    println(CollatzCalculator.computeStepCount(9))
}