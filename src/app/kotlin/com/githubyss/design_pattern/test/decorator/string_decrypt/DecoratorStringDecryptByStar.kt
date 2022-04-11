package com.githubyss.design_pattern.test.decorator.string_decrypt


class DecoratorStringDecryptByStar : DecoratorStringDecryptAbstract() {
    override fun decrypt(input: String): String {
        return super.decrypt(input).replace("*", "")
    }
}