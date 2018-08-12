import junit.framework.Assert.assertFalse
import org.junit.Test

class AnagramsTest {

    @Test
    fun shouldBeAnagrams() {
        assert("dog".isAnamgram("god"))
        assert("roma".isAnamgram("amor"))
        assert("mary".isAnamgram("army"))
    }

    @Test
    fun shouldNotBeAnagrams() {
        assertFalse("hello".isAnamgram("hella"))
        assertFalse("fkfk".isAnamgram("asd"))
    }
}
