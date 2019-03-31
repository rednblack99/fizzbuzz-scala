object FizzBuzz extends App {
  def play(number: Int) = {
    if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"
    else number
  }
}