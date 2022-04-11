package com.githubyss.design_pattern.test.prototype.resume


class WorkExperience : Cloneable {
    var timeArea: String = ""
    var company: String = ""

    public override fun clone(): WorkExperience {
        return super.clone() as WorkExperience
    }
}