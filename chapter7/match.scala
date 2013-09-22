// List7.14
val firstArg = if (args.length > 0) args(0) else ""
firstArg match {
  case "salt"  => println("pepper")
  case "chips" => println("salsa")
  case "eggs"  => println("bacon")
  case _ => println("huh?")
}


// List7.15
val friend = 
  firstArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
println(friend)
