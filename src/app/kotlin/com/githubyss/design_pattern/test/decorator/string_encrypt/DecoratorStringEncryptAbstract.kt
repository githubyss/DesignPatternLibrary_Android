package com.githubyss.design_pattern.test.decorator.string_encrypt


abstract class DecoratorStringEncryptAbstract : IStringEncrypt {
    private var stringEncrypt: IStringEncrypt? = null

    fun decorator(stringEncrypt: IStringEncrypt) {
        this.stringEncrypt = stringEncrypt
    }

    override fun encrypt(input: String): String {
        return stringEncrypt?.encrypt(input) ?: input
    }
}