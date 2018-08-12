/**
 * There are three operations that can be performed in a String, replace, insert, delete
 * Given a string find is they are one edit way to the other
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bae -> false
 */
fun String.isOneWay(candidate: String): Boolean {
    return when {
        length == candidate.length -> isOneEdit(candidate)
        length + 1 == candidate.length -> isOneInsert(candidate)
        length - 1 == candidate.length -> candidate.isOneInsert(this)
        else -> false
    }
}

/**
 * if the strings are different by one edit character replacements,
 * that means the only difference between them is one String
 */
private fun String.isOneEdit(candidate: String): Boolean {
    var hasEdit = false
    for (i in 0 until length) {
        if (get(i) != candidate[i]) {
            if (hasEdit) return false
            hasEdit = true
        }
    }

    return true
}

private fun String.isOneInsert(candidate: String): Boolean {
    val candidateLength = candidate.length
    var index = 0
    var candidateIndex = 0
    while (candidateIndex < candidateLength && index < length) {
        if (get(index) != candidate[candidateIndex]) {
            if (index != candidateIndex) return false
            candidateIndex++
        } else {
            candidateIndex++
            index++
        }
    }
    return true
}
