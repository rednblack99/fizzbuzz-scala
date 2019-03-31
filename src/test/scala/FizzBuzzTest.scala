class FizzBuzzTest extends org.scalatest.FunSuite {
  test("FizzBuzz returns number passed to it") {
    assert(FizzBuzz.play(1) === 1)
  }
}
