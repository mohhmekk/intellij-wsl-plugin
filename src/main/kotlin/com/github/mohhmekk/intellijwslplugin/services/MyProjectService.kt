package com.github.mohhmekk.intellijwslplugin.services

import com.github.mohhmekk.intellijwslplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
