package com.githubyss.design_pattern.test.entity.exam


class ExamPaperB : ExamPaper() {
    override fun answer1(): String {
        return "d"
    }

    override fun answer2(): String {
        return "b"
    }

    override fun answer3(): String {
        return "a"
    }
}