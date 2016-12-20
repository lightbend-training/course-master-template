package sbtstudent

/**
  * Copyright © 2014, 2015, 2016 Lightbend, Inc. All rights reserved. [http://www.typesafe.com]
  */
import StudentKeys._
import sbt.Keys._
import sbt._

import scala.Console

object Navigation {

  val setupNavAttrs: (State) => State = (state: State) => state

  val loadBookmark: (State) => State = (state: State) => state

  def nextExercise: Command = Command.command("nextExercise") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project: Use sbt's native 'project' command instead")
    state
  }

  def prevExercise: Command = Command.command("prevExercise") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project: Use sbt's native 'project' command instead")
    state
  }

  def gotoExerciseNr: Command = Command.command("gotoExerciseNr") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project: Use sbt's native 'project' command instead")
    state
  }
}
