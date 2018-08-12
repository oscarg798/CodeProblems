import junit.framework.Assert.assertFalse
import org.junit.Test

class PalindromesTest {

    @Test
    fun shouldBePalindromes() {
        assert("o".isPalindrome())
        assert("ana".isPalindrome())
        assert("otto".isPalindrome())
        assert("la tele letal".isPalindrome())
        assert("luz azul".isPalindrome())
        assert("se van sus naves".isPalindrome())
        assert("a ti no bonita".isPalindrome())
        assert("taco cat".isPalindrome())
        assert("a man a plan a canal panama".isPalindrome())
    }

    @Test
    fun shouldNotBePalindromes(){
        assertFalse("hello".isPalindrome())
        assertFalse("qsdasdasd".isPalindrome())
        assertFalse("ujjk".isPalindrome())
    }

}