//throw new IllegalArgumentException

val n = 2
val half = 
  if (n % 2 == 0)
    n / 2
  else 
    throw new RuntimeException("n must be even")
println(half)


// List 7.11
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")
  println("Sucess of opening input.txt")
} catch {
  case ex: FileNotFoundException => println("File Not Found")
  case ex: IOException => println("Other Exception")
}



// List7.12
val file = new FileReader("input.txt")
try {
  println("Use input.txt")
} finally {
  file.close()
}

// List7.13
import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) = 
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException => 
      new URL("http://www.scala-lang.org")
  }
