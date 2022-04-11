package com.githubyss.design_pattern.test.prototype

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.prototype.resume.Resume


fun prototype() {
    println("$PREFIX Prototype 原型模式")
    println()

    val resumeA: Resume = Resume("小A")
    resumeA.setPersonalInfo("男", "25")
    resumeA.setWorkExperience("1998-2005", "XX公司")
    val resumeB: Resume = resumeA.clone()
    resumeB.setWorkExperience("1998-2005", "YY公司")
    val resumeC: Resume = resumeA.clone()
    resumeC.setPersonalInfo("男", "30")
    resumeC.setWorkExperience("2004-2006", "ZZ公司")
    resumeA.display()
    resumeB.display()
    resumeC.display()
    println()
}