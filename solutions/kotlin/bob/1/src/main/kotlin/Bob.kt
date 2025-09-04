object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()

        if(trimmed.isEmpty()){
            return "Fine. Be that way!"
        }

        val isQuestion = trimmed.endsWith("?")
        val hasLetters = trimmed.any{it.isLetter()}
        val isYelling = hasLetters && trimmed == trimmed.uppercase()

        return when {
            isQuestion && isYelling -> "Calm down, I know what I'm doing!"
            isQuestion -> "Sure."
            isYelling -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }
}

fun main(){
    println(Bob.hey("Do you want a coffee?"))
    println(Bob.hey("HOW DARE YOU?"))
    println(Bob.hey("COMMON"))
    println(Bob.hey("okay"))
    println(Bob.hey("       "))
}
