package uz.turgunboyevjurabek.filetest3

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun PdfViewerScreen(assetFileName: String) {
    AndroidView(
        factory = { context ->
            // XML Layoutsiz to'g'ridan-to'g'ri PDFView yaratamiz
            com.github.barteksc.pdfviewer.PDFView(context, null).apply {
                fromAsset(assetFileName)
                    .enableSwipe(true) // Sahifalarni surish
                    .swipeHorizontal(false) // Gorizontal yoki vertikal
                    .enableDoubletap(true) // Zoom qilish uchun ikki marta bosish
                    .load()
            }
        },
        update = { pdfView ->
            // Agar PDF-ni dinamik o'zgartirish kerak bo'lsa, bu yerda ishlash mumkin
        }
    )
}
