package com.githubyss.design_pattern.test.builder.person_builder


class PersonBuilderFat(canvas: DrawCanvas, paint: DrawPaint) : PersonBuilderAbstract(canvas, paint) {
    override fun addHead() {
        println("胖子：头")
        // canvas.drawCircle(0.0F, 0.0F, 0.0F, paint)
    }

    override fun addBody() {
        println("胖子：躯干")
        // canvas.drawCircle(0.0F, 0.0F, 0.0F, paint)
    }

    override fun addArmLeft() {
        println("胖子：左胳膊")
        // canvas.drawLine(0.0F, 0.0F, 0.0F, 0.0F, paint)
    }

    override fun addArmRight() {
        println("胖子：右胳膊")
        // canvas.drawLine(0.0F, 0.0F, 0.0F, 0.0F, paint)
    }

    override fun addLegLeft() {
        println("胖子：左腿")
        // canvas.drawLine(0.0F, 0.0F, 0.0F, 0.0F, paint)
    }

    override fun addLegRight() {
        println("胖子：右腿")
        // canvas.drawLine(0.0F, 0.0F, 0.0F, 0.0F, paint)
    }
}