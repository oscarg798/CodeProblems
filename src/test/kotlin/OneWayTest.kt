import junit.framework.Assert.assertFalse
import org.junit.Test

class OneWayTest {

    @Test
    fun shouldBeOneWayRemove() {
        assert("pale".isOneWay("ple"))
        assert("pales".isOneWay("pale"))
    }

    @Test
    fun shouldBeOneWayEdit() {
        assert("pale".isOneWay("bale"))
        assert("pale".isOneWay("pala"))
    }

    @Test
    fun shouldBeOneWayInsert() {
        assert("pale".isOneWay("pales"))
        assert("p".isOneWay("pp"))
    }

    @Test
    fun shouldNotBeOneWay() {
        assertFalse("pale".isOneWay("bae"))
        assertFalse("hola".isOneWay( "h"))
    }

}