package com.slang.interview

import kotlin.test.Test
import kotlin.test.assertEquals

class RomanNumeralConverterTest {

    @Test
    fun shouldReturn1ForI() {
        val actualResult: Int = RomanNumeralConverter.convert("I")
        val expectedResult = 1
        assertEquals(expectedResult, actualResult)
    }
}
