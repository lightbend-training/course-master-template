lazy val project_template = (project in file("."))
  .aggregate(
    common,
    exercise_000_initial_state,
    exercise_010_first_exercise
 )
  .settings(CommonSettings.commonSettings: _*)

lazy val common = project
  .settings(CommonSettings.commonSettings: _*)

lazy val exercise_000_initial_state = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_010_first_exercise = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")
