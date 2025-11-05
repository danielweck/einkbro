package info.plateaukao.einkbro_.browser

import android.app.Activity
import android.content.Context
import android.webkit.DownloadListener
import info.plateaukao.einkbro_.unit.BrowserUnit.download

class EBDownloadListener(private val context: Context) : DownloadListener {
    override fun onDownloadStart(
        url: String,
        userAgent: String,
        contentDisposition: String,
        mimeType: String,
        contentLength: Long
    ) {
        if (context is Activity) {
            download(context, url, contentDisposition, mimeType)
        }
    }
}