object FizzBuzz extends App {
  def play(number: Int) = {
    if (number % 3 == 0) "Fizz"
    else number
  }
}