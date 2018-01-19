package Common.ScalaChem.Test

import Common.ScalaChem.Infrastructure.ChemicalElement.ChemicalElement
import Common.ScalaChem.Infrastructure.{ChemicalElement, IAtom, IMolecule}
import Common.ScalaChem.MolGraph.Atom

class Methods {


  //replace atom by
  def replaceAtoms_oop(g : IMolecule) = {
    var newElement = new Atom(ChemicalElement.C)
    for (i <- 0 to g.size) g(i) = newElement
  }

  def replaceAtoms_fp(g : IMolecule) = {
    var newElement = new Atom(ChemicalElement.C)
    g.map(_ = newElement)
  }

  //  zip
  def zipIt_oop (g : IMolecule) = {
    var ls1 = g
    var ls2 = g
    var listOfTuples  : List[(IAtom,IAtom)] = List()
    for (i <- 0 to g.size)  listOfTuples = listOfTuples :+ (g(i), g(i))
  }

  def zipIt_fp (g : IMolecule) = {
    var ls1 = g
    var ls2 = g
    ls1.zip(ls2)
  }

  //  filterByElement
  def filterByElement_oop(g : IMolecule) = {
    for (i <- 0 to g.size) if(g(i).Element == ChemicalElement.C){g(i) = null}
  }

  def filterByElement_fp(g : IMolecule) = {
    g.filter((i: IAtom) => i != ChemicalElement.C)
  }


  // sum atomic number, DOES id work here??
  def sumAtomicNumber_oop(g : IMolecule) = {
    var total = 0
    for (i <- 0 to g.size) total = total + g(i).Element.id
  }

  // sum atomic number,
  def sumAtomicNumber_fp(g : IMolecule) = {
    var total = sum(IAtom)

  }

  def sum(xs: List[ChemicalElement]): Int = {
    xs match {
      case x :: tail => x + sum(tail) // if there is an element, add it to the sum of the tail
      case Nil => 0 // if there are no elements, then the sum is 0
    }
  }

  // zipwith max/plus
  def zipWith_oop(g : IMolecule) = {
    var ls = List[IAtom] = List()
    for (i <- 0 to g.size) ls =  ls :+ g(i).Element
  }

  def fp(g : IMolecule) = {
    var =

  }



}