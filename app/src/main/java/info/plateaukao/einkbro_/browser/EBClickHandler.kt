package info.plateaukao.einkbro_.browser

import android.os.Handler
import android.os.Message
import android.view.MotionEvent
import info.plateaukao.einkbro_.view.EBWebView

class EBClickHandler(private val webView: EBWebView) : Handler() {

    var currentMotionEvent: MotionEvent? = null

    override fun handleMessage(message: Message) {
        super.handleMessage(message)
        webView.browserController?.onLongPress(message, currentMotionEvent)
    }
}