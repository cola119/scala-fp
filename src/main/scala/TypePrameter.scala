object TypeParameter {
  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def isSortedRec(sortedSeq: Seq[E], index: Int, flag: Boolean): Boolean = {
      if(sortedSeq.length  == index) flag
      else isSortedRec(sortedSeq, index + 1, ordered(sortedSeq(index - 1), sortedSeq(index)))
    }
    if(sortedSeq.length == 1) true
    else isSortedRec(sortedSeq, 1, true)
  }
}
