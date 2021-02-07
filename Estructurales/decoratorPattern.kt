clase  abstracta IceCream {
     abstract  fun  getDescription (): String 
} clase VanillaIceCream : IceCream () {
     anular diversión getDescription () = "Helado de vainilla" 
} clase StrawberryIceCream : IceCream () {
     anular diversión getDescription () = "Helado de fresa" 
} class ChocolateIceCream : IceCream () {
     override fun getDescription () = "Helado de chocolate" 
} clase abstracta


  ToppingDecorator (): IceCream () {
     abstracta  diversión  addTopping (): String 
} clase HoneyToppingDecorator ( privada val helado: IceCream): ToppingDecorator () {
     anulación diversión getDescription () = iceCream.getDescription () + addTopping ()
     anulación diversión addTopping () = "Con cobertura de miel &" 
} clase NutsToppingDecorator ( private val iceCream: IceCream): ToppingDecorator () {
     anular diversión getDescription
  

    () = IceCream.getDescription () + addTopping ()
     anulación  diversión  addTopping () = "con el desmoche de frutos secos y" 
} diversión principal () {
     val vanillaIceCreamWithHoneyTopping = HoneyToppingDecorator (VanillaIceCream ())
     val vanillaIceCreamWithHoneyToppingDescription = vanillaIceCreamWithHoneyTopping.getDescription () 
    println ( " Usted ordenó: $ {vanillaIceCreamWithHoneyToppingDescription.trimEnd ('&')} " ) val strawberryCreamWithNutsTopping = NutsToppingDecorator (StrawberryIceCream ())
     val strawberryCreamWithNutsToppingDescription = strawberryCreamWithNutsTopping.getDescription ()

    
    System.out.println ( "Usted ordenó: strawberryCreamWithNutsToppingDescription.trimEnd {$ ( '&')}" ) val chocolateIceCreamWithHoneyAndNutsTopping = NutsToppingDecorator (HoneyToppingDecorator (ChocolateIceCream ()))
     val chocolateIceCreamWithHoneyAndNutsToppingDescription chocolateIceCreamWithHoneyAndNutsTopping.getDescription = () 
    System.out.println ( " Usted ordenó: $ {chocolateIceCreamWithHoneyAndNutsToppingDescription.trimEnd ('&')} " ) 
}
