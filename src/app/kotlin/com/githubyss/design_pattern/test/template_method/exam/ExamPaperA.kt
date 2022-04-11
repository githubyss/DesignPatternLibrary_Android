package com.githubyss.design_pattern.test.template_method.exam


class ExamPaperA : ExamPaper() {
    override fun answer1(): String {
        return "b"
    }

    override fun answer2(): String {
        return "a"
    }

    override fun answer3(): String {
        return "c"
    }
}