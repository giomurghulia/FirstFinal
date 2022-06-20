class MathFun(

) {

    fun gcd(firstNum: Int, secondNum: Int): Int {
        if (firstNum == 0 || secondNum == 0) return 0
        var i = 1
        var gcd = 1

        while (i <= firstNum && i <= secondNum) {
            if (firstNum % i == 0 && secondNum % i == 0)
                gcd = i
            ++i
        }

        return gcd

    }

    fun lcm(firstNum: Int, secondNum: Int): Int {
        if (firstNum == 0) return secondNum
        if (secondNum == 0) return firstNum
        return firstNum * secondNum / gcd(firstNum, secondNum)
    }

    fun checkUSD(word: String) {
        if (word.contains("$")) println("ki")
        else println("ara")
    }

    fun sumEvenNumber(): Int {
        var x = 0
        var sumEvenNumber = 0
        while (x < 98) {
            x += 2
            sumEvenNumber += x
        }
        println(sumEvenNumber)
        return sumEvenNumber
    }

    fun reversNuM(num: Int) {
        var number = num
        var reverseNum = 0
        while (number != 0) {
            reverseNum = reverseNum * 10 + number % 10
            number /= 10
        }
        println(reverseNum)
    }

    fun isPalindromeString(word: String): Boolean {
        val word1 = StringBuilder(word)
        val reverseStr = word1.reverse().toString()

        return word.equals(reverseStr, ignoreCase = true)
    }
}