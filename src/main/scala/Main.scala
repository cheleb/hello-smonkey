import simple.SimpleApp
@main def hello: Unit =
  println("Hello world!")
  println(msg)
  val simpleApp = new SimpleApp()
  simpleApp.start

def msg = "I was compiled by Scala 3. :)"
