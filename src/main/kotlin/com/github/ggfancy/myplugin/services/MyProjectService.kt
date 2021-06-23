package com.github.ggfancy.myplugin.services

import com.github.ggfancy.myplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
