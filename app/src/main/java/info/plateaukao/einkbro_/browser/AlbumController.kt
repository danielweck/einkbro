package info.plateaukao.einkbro_.browser

import info.plateaukao.einkbro_.view.Album

interface AlbumController {
    val album: Album
    var albumTitle: String
    val albumUrl: String
    var initAlbumUrl: String

    var isTranslatePage: Boolean

    var isAIPage: Boolean

    fun activate()
    fun deactivate()

    fun pauseWebView()
    fun resumeWebView()
}