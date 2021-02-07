interfaz Documento {
     fun  showDocumentInfo () 
} clase DrawingDocument : Documento {
     anular fun showDocumentInfo () { 
        println ( "Este es un documento de dibujo" ) 
    } 
} clase WordDocument : Documento {
     anular fun showDocumentInfo () { 
        println ( "Este es un documento de Word " ) 
    } 
} Aplicación de clase abstracta {
     abstract fun createDocument (): Documento

    objeto complementario { fun getApplicationDocument (documentType: DocumentType): Application {
             return when (documentType) { 
                DocumentType.Drawing -> DrawingApplication () 
                DocumentType.Word -> WordApplication () else -> throw Exception ( "Tipo de documento no válido" ) 
            } 
        } 
    } 
} clase DrawingApplication : Application () {
     anular diversión createDocument () = DrawingDocument () 
} clase WordApplication : Application () {
    

 override  fun  createDocument () = WordDocument () 
} enumeración class DocumentType {Drawing, Word} fun main () {
     val drawingApplication = Application.getApplicationDocument (DocumentType.Drawing)
     val drawingDocument = drawingApplication.createDocument () 
    drawingDocument.showDocumentInfo () val wordApplication = Application.getApplicationDocument (DocumentType.Word)
     val wordDocument = wordApplication.createDocument () 
    wordDocument.showDocumentInfo () 
}
