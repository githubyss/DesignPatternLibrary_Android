package com.githubyss.design_pattern.test.strategy.encode


class DataEncodeByStar : IDataEncode {
    override fun encode(input: String): String {
        return "***$input***"
    }
}
