/**
 * dog, and god are anagrams, after apply a permutation we can get the same word
 **/
fun String.isAnamgram(candidate: String): Boolean {
    if (length != candidate.length) {
        return false
    }

    val map = createCharacterCountTable(this)

    for (i in 0 until candidate.length) {
        map[candidate[i]] = map[candidate[i]]?.minus(1) ?: -1
        if (map[candidate[i]] ?: 0 < 0) return false
    }

    return true

}

fun createCharacterCountTable(s: String): HashMap<Char, Int> {
    val map = HashMap<Char, Int>()

    for (i in 0 until s.length) {
        map[s[i]] = (map[s[i]] ?: 0) + 1
    }

    return map
}



