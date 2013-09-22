// List7.5
val filesHere = (new java.io.File(".")).listFiles
for (file <- filesHere) 
  println(file)

// List7.6
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

// List7.7
for (file <- filesHere if file.isFile if file.getName.endsWith(".scala") )
  println(file)


// List 7.8, 7.9
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)
grep(".*grep.*")

def scalaFiles = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file
