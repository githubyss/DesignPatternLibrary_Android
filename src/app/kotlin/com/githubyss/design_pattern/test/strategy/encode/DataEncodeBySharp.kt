package com.githubyss.design_pattern.test.strategy.encode


class DataEncodeBySharp : IDataEncode {
    override fun encode(input: String): String {
        return "###$input###"
    }
}
