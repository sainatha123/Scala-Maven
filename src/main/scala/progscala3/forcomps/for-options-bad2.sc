// src/main/scala/progscala3/forcomps/for-options-bad2.sc

val successfulCounts = Seq(Some(5), Some(21), Some(8))
val partiallySuccessfulCounts = Seq(Some(5), None, Some(8))

def sumCountsBad(counts: Seq[Option[Int]]): Option[Int] = 
  (counts foldLeft Option(0)) {
    (countOption, count) => 
      if (countOption == None || count == None) None
      else Some(countOption.get + count.get)
  }

assert(sumCountsBad(successfulCounts) == Some(34))
assert(sumCountsBad(partiallySuccessfulCounts) == None)
