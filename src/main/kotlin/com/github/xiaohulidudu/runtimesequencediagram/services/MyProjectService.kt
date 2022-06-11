package com.github.xiaohulidudu.runtimesequencediagram.services

import com.intellij.openapi.project.Project
import com.github.xiaohulidudu.runtimesequencediagram.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
