class FizzBuzzTest extends org.scalatest.FunSuite {
  test("FizzBuzz returns number passed to it") {
    assert(FizzBuzz.play(1) === 1)
  }

  test("Fizzbuzz returns fizz when passed multiple of 3") {
    assert(FizzBuzz.play(3) === "Fizz")
  }

  test("Fizzbuzz returns buzz when passed multiple of 5") {
    assert(FizzBuzz.play(5) === "Buzz")
  }

  test("FizzBuzz returns FizzBuzz when number is multiple of both 3 and 5") {
    assert(FizzBuzz.play(15) === "FizzBuzz")
  }

  test("FizzBuzz.game plays Fizzbuzz up to 5") {
    assert(FizzBuzz.calc_results === "\n1\n2\nFizz\n4\nBuzz")
  }

  test("FizzBuzz.up_to print results only") {
    assert(FizzBuzz.up_to === ())
  }
}
