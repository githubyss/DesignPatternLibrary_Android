package com.githubyss.design_pattern.test.template_method

import com.githubyss.design_pattern.test.entity.exam.ExamPaper
import com.githubyss.design_pattern.test.entity.exam.ExamPaperA
import com.githubyss.design_pattern.test.entity.exam.ExamPaperB


fun templateMethod() {
    println("学生A抄的试卷：")
    val examPaperA: ExamPaper = ExamPaperA()
    examPaperA.question1()
    examPaperA.question2()
    examPaperA.question3()
    println("学生B抄的试卷：")
    val examPaperB: ExamPaper = ExamPaperB()
    examPaperB.question1()
    examPaperB.question2()
    examPaperB.question3()
    println()
}