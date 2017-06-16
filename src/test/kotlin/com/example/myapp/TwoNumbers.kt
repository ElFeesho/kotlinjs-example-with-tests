package com.example.myapp

import org.junit.Test
import kotlin.test.assertEquals

class TwoNumbers {

    @Test
    fun canBeAdded() {
        val adder = Adder()
        assertEquals(10, adder.add(5, 5))
    }

    @Test
    fun canBeAdded_whenInputIsNegative() {
        val adder = Adder()
        assertEquals(-10, adder.add(-5, -5))
    }
}