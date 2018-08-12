/**
 * A palindrome is a word that is the same  when you read it  from left to right and from right to left a
 * ana, ama, ara, aaccaa, Otto
 * So if the String length is even that means all characters count should be even, otherwise if its
 * odd, at least one character should be odd, and the other ones should be even
 *
 */
fun String.isPalindrome(): Boolean {

    val characterCount = HashMap<Char, Int>()
    val candidate = this.toLowerCase().replace(" ".toRegex(), "")

    for (i in 0 until candidate.length) {
        characterCount[candidate[i]] = characterCount[candidate[i]]?.plus(1) ?: 1
    }

    if (characterCount.filter {
                it.value % 2 != 0
            }.count() > 1) {
        return false
    }



    return candidate == candidate.reversed()
}