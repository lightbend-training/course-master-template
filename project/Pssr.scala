package sbtstudent

import sbt._
import Keys._
import sbt.complete.DefaultParsers._
import scala.Console
import StudentKeys._

object Pssr {

  def pullSolution: Command = Command.command("pullSolution") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project")
    state
  }

  def saveState: Command = Command.command("saveState") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project")
    state
  }

  def restoreState: Command = Command.command("restoreState") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project")
    state
  }

  def savedStates: Command = Command.command("savedStates") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project")
    state
  }

  def showExerciseId: Command = Command.command("showExerciseId") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project")
    state
  }

  def pullTemplate: Command = Command.command("pullTemplate") { state =>
    Console.println(Console.BLUE + "[WARN] " + Console.RESET + s"This command is not implemented for a course master project")
    state
  }
}
