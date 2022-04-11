package com.githubyss.design_pattern.test.decorator.string_decrypt


class StringDecrypt : IStringDecrypt {
    override fun decrypt(input: String): String {
        return input
    }
}