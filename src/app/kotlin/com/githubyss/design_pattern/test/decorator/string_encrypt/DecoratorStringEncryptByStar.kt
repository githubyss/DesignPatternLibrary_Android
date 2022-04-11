package com.githubyss.design_pattern.test.decorator.string_encrypt


class DecoratorStringEncryptByStar : DecoratorStringEncryptAbstract() {
    override fun encrypt(input: String): String {
        return "**${super.encrypt(input)}**"
    }
}