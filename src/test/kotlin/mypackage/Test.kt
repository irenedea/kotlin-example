package mypackage

import kotlin.test.assertEquals
import org.junit.Test as test

class Test {
    @test 
    fun test1() {
        val result = 5 * 6
        assertEquals(result, 30)
    }
}
