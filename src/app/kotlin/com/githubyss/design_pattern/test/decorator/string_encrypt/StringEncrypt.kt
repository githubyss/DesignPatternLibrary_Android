package com.githubyss.design_pattern.test.decorator.string_encrypt


class StringEncrypt : IStringEncrypt {
    override fun encrypt(input: String): String {
        return input
    }
}